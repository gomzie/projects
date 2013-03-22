package videosub
import grails.converters.*

class DashboardController {
	def index = { }
	def search = { 
		if(params.query){
			def videos = Video.search(params.query).results
			def users = User.search(params.query).results
			def addresses = Address.search(params.query).results
				[videos : videos,users:users,addresses:addresses]
		}
	}
	def dashboard = {
		if (session.user && session.user.type=='admin'){
			def currentVideoUsers = VideoUser.createCriteria().list {
				lt('startTime',new Date())
				and {
					gt('endTime',new Date())
				}
			}
				
			return [user:session.user,currentVideoUsers:currentVideoUsers]
		} else if (session.user){
			def pastVideos = VideoUser.createCriteria().list {lt('endTime',new Date())}
			def videosThumbs=[:]
			def videosTitles=[:]
			def videosDuration=[:]
			for(i in pastVideos){
				def url = new URL("http://vimeo.com/api/v2/video/"+i.video.name+".json");
				def response = JSON.parse(url.newReader())
				def thumb = response.thumbnail_small
				def title = response.title
				def duration = response.duration
				videosThumbs.put(i.video.name, thumb)
				videosTitles.put(i.video.name, title)
				videosDuration.put(i.video.name, duration)
			}
			def currentVideos = VideoUser.createCriteria().list {
					eq("user.id",session.user.id)
					lt('startTime',new Date())
					and {
						gt('endTime',new Date())
					}
			}
			for(i in currentVideos){
				def url = new URL("http://vimeo.com/api/v2/video/"+i.video.name+".json");
				def response = JSON.parse(url.newReader())
				def title = response.title
				def duration = response.duration
				videosTitles.put(i.video.name, title)
				videosDuration.put(i.video.name, duration)
			}
			return [user:session.user,currentVideos:currentVideos,pastVideos:pastVideos,videosThumbs:videosThumbs,videosTitles:videosTitles,videosDuration:videosDuration]
		}
		return [user:session.user]
	}
	def validate = {
		def user = User.findByEmail(params.email)
		if (user && user.password == params.password){
			session.user = user
			if (params.cName)
				redirect(controller:params.cName, action:params.aName)
			else
				redirect(controller:'dashboard', action:'dashboard')
		}
		else{
			flash.message = "Invalid username and password."
			render(view:'login' )
		}
	}
	def login ={
		if (params.cName && !session.user)
			return [cName:params.cName, aName:params.aName]
	}
	def logout = {
		session.user = null
		redirect(url:resource(dir:'../' ))
	}
	def showDetail = {
		def user = User.get(params.id) 
		if (user) {
			render(template:"userDetails", model:[user:user]) }
		else {
			render "No user found with id: ${params.id}"
		} 
	}
}