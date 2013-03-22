package videosub

class VideoSubTagLib {
	def loginToggle = { 
		out << "<div>"
		if (session.user){
			out << "<span style='float:right;margin-right:10px;padding-top:18px'>"
			out << "<a href='${createLink(controller:'dashboard', action:'logout')}'>" 
			out << "Logout </a></span>"
		} else{
			out << "<span style='float:right;margin-right:10px;padding-top:18px'>"
			out << "<a href='${createLink(controller:'dashboard', action:'login')}'>" 
			out << "Login </a></span>"
		}
		out << "</div><br/>" 
	}
}
