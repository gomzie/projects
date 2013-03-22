package videosub

import grails.converters.JSON;

import org.hibernate.impl.SessionFactoryImpl.CacheImpl;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataIntegrityViolationException

class VideoController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }
	@Cacheable("videoControllerCache")
    def list(Integer max) {
        params.max = Math.min(max ?: 8, 100)
		def videos = Video.list(params)
		def videosThumbs=[:]
		def videosTitles=[:]
		def videosDuration=[:]
		for(i in videos){
			def url = new URL("http://vimeo.com/api/v2/video/"+i.name+".json");
			def response = JSON.parse(url.newReader())
			//println response
			def thumb = response.thumbnail_small
			def title = response.title
			def duration = response.duration
			videosThumbs.put(i.name, thumb)
			videosTitles.put(i.name, title)
			videosDuration.put(i.name, duration)
		}
		[videos:videos,videosThumbs:videosThumbs,videosTitles:videosTitles,videosDuration:videosDuration,videoTotal:Video.count()]
    }
	
	def ajaxList = {
		//params.max = Math.min(max ?: 8, 100)
		def videos = Video.list(params)
		def videosThumbs=[:]
		def videosTitles=[:]
		def videosDuration=[:]
		def videoMap = [:]
		for(i in videos){
			def url = new URL("http://vimeo.com/api/v2/video/"+i.name+".json");
			def response = JSON.parse(url.newReader())
			def thumb = response.thumbnail_small
			def title = response.title
			def duration = response.duration
			videosThumbs.put(i.name, thumb)
			videosTitles.put(i.name, title)
			videosDuration.put(i.name, duration)
		}
		println 'here1'
		videoMap.put("thumbs", videosThumbs)
		videoMap.put("titles", videosTitles)
		videoMap.put("durations", videosDuration)
		def videoList = new ArrayList()
		videoList.add(videoMap)
		
		render videoList as JSON
		//render(content: 'text/json',
			//ajaxResponse(videos:videos,videosThumbs:videosThumbs,videosTitles:videosTitles,videosDuration:videosDuration,videoTotal:Video.count()));
	}

    def create() {
        [videoInstance: new Video(params)]
    }

    def save() {
        def videoInstance = new Video(params)
        if (!videoInstance.save(flush: true)) {
            render(view: "create", model: [videoInstance: videoInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'video.label', default: 'Video'), videoInstance.id])
        redirect(action: "show", id: videoInstance.id)
    }

    def show(Long id) {
        def videoInstance = Video.get(id)
        if (!videoInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'video.label', default: 'Video'), id])
            redirect(action: "list")
            return
        }

        [videoInstance: videoInstance]
    }

    def edit(Long id) {
        def videoInstance = Video.get(id)
        if (!videoInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'video.label', default: 'Video'), id])
            redirect(action: "list")
            return
        }

        [videoInstance: videoInstance]
    }

    def update(Long id, Long version) {
        def videoInstance = Video.get(id)
        if (!videoInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'video.label', default: 'Video'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (videoInstance.version > version) {
                videoInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'video.label', default: 'Video')] as Object[],
                          "Another user has updated this Video while you were editing")
                render(view: "edit", model: [videoInstance: videoInstance])
                return
            }
        }

        videoInstance.properties = params

        if (!videoInstance.save(flush: true)) {
            render(view: "edit", model: [videoInstance: videoInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'video.label', default: 'Video'), videoInstance.id])
        redirect(action: "show", id: videoInstance.id)
    }

    def delete(Long id) {
        def videoInstance = Video.get(id)
        if (!videoInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'video.label', default: 'Video'), id])
            redirect(action: "list")
            return
        }

        try {
            videoInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'video.label', default: 'Video'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'video.label', default: 'Video'), id])
            redirect(action: "show", id: id)
        }
    }
}
