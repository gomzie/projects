package videosub

import java.sql.Timestamp;

class VideoUser {

    static constraints = {
		user(nullable:false)
		video(nullable:false)
		startTime()
		endTime()
    }
	User user
	Video video
	Date startTime
	Date endTime
}
