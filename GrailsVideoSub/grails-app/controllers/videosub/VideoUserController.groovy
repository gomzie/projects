package videosub

import org.springframework.dao.DataIntegrityViolationException

class VideoUserController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [videoUserInstanceList: VideoUser.list(params), videoUserInstanceTotal: VideoUser.count()]
    }

    def create() {
        [videoUserInstance: new VideoUser(params)]
    }

    def save() {
        def videoUserInstance = new VideoUser(params)
        if (!videoUserInstance.save(flush: true)) {
            render(view: "create", model: [videoUserInstance: videoUserInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'videoUser.label', default: 'VideoUser'), videoUserInstance.id])
        redirect(action: "show", id: videoUserInstance.id)
    }

    def show(Long id) {
        def videoUserInstance = VideoUser.get(id)
        if (!videoUserInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'videoUser.label', default: 'VideoUser'), id])
            redirect(action: "list")
            return
        }

        [videoUserInstance: videoUserInstance]
    }

    def edit(Long id) {
        def videoUserInstance = VideoUser.get(id)
        if (!videoUserInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'videoUser.label', default: 'VideoUser'), id])
            redirect(action: "list")
            return
        }

        [videoUserInstance: videoUserInstance]
    }

    def update(Long id, Long version) {
        def videoUserInstance = VideoUser.get(id)
        if (!videoUserInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'videoUser.label', default: 'VideoUser'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (videoUserInstance.version > version) {
                videoUserInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'videoUser.label', default: 'VideoUser')] as Object[],
                          "Another user has updated this VideoUser while you were editing")
                render(view: "edit", model: [videoUserInstance: videoUserInstance])
                return
            }
        }

        videoUserInstance.properties = params

        if (!videoUserInstance.save(flush: true)) {
            render(view: "edit", model: [videoUserInstance: videoUserInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'videoUser.label', default: 'VideoUser'), videoUserInstance.id])
        redirect(action: "show", id: videoUserInstance.id)
    }

    def delete(Long id) {
        def videoUserInstance = VideoUser.get(id)
        if (!videoUserInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'videoUser.label', default: 'VideoUser'), id])
            redirect(action: "list")
            return
        }

        try {
            videoUserInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'videoUser.label', default: 'VideoUser'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'videoUser.label', default: 'VideoUser'), id])
            redirect(action: "show", id: id)
        }
    }
}
