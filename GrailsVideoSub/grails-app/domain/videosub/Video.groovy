package videosub

class Video {

    static constraints = {
		name(nullable:false)
		description(maxSize:5000,nullable:false)
		subject(nullable:false)
		path(url:true,nullable:false)
    }
	static searchable = true
	String name
	String description
	String subject
	User speaker
	Date dateCreated
	String path
	String toString(){description}
}
