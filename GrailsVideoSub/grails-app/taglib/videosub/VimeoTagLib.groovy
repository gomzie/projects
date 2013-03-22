package videosub

class VimeoTagLib {
	def video={attrs->
		def videoId = attrs['videoId']
		def vd = {
			object(width: attrs['width'] ?: "640", height:attrs['height'] ?: "385") {
				param(
					name: "movie",
					value: "http://vimeo.com/moogaloop.swf?clip_id=${videoId}&&server=vimeo.com&show_title=1&show_byline=1&show_portrait=0&color=00adef&fullscreen=1")
				param(name: "allowFullScreen", value:"true")
				param(name: "allowscriptaccess", value:"always")
				embed(src: "http://vimeo.com/moogaloop.swf?clip_id=${videoId}&&server=vimeo.com&show_title=1&show_byline=1&show_portrait=0&color=00adef&fullscreen=1",
					type: "application/x-shockwave-flash",allowscriptaccess:"always",allowfullscreen:"true",
					width: "${attrs['width']?:'640'}", height:"${attrs['height']?:'385'}")
		   }
		 }
		 def xml = new groovy.xml.StreamingMarkupBuilder().bind(vd)
		 out << xml
	}
}
