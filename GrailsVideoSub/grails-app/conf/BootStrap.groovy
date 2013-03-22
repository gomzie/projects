import videosub.Address;
import videosub.User;
import videosub.Video;
import videosub.VideoUser;

class BootStrap {

    def init = { servletContext ->
		def address1 = new Address(
			address1:'501, Saubhagya Apt',
			address2:'GH-7',
			address3:'Sector-21D',
			city:'Faridabad',
			state:'Haryana',
			postCode:'121001',
			country:'India',
			homeAddress:true
		)
		if (!address1.save()){ address1.errors.allErrors.each{error ->
			println "An error occured with address1: ${error}" }
		}
		
		def address2 = new Address(
			address1:'B-1/I-1, Mohan Co-operative',
			address2:'Mathua Road',
			address3:'Post Bag-6',
			city:'New Delhi',
			state:'Delhi',
			postCode:'121001',
			country:'India',
			homeAddress:false
		)
		if (!address2.save()){ address2.errors.allErrors.each{error ->
			println "An error occured with address2: ${error}" }
		}
		
		def user1 = new User(email:'bhavi.mehta@sagepub.in',
			password:'123456',
			salutation:'Mr',
			firstName:'Bhavi',
			middleName:'test',
			lastName:'Mehta',
			organization:'SAGE Publications Pvt. Ltd.',
			phoneNumber:'9560050296',
			jobTitle:'Lead - Web Development',
			country:'India',
			dateCreated:new Date('30/11/2012'),
			dateUpdated:new Date('30/11/2012'),
			type:'admin',
			addresses:address1
		)
		if (!user1.save()){ user1.errors.allErrors.each{error ->
			println "An error occured with user1: ${error}" }
		}
		
		def user2 = new User(email:'gautam.mehta@sagepub.co.uk',
			password:'123456',
			salutation:'Mr',
			firstName:'Gautam',
			middleName:'test',
			lastName:'Mehta',
			organization:'SAGE Publications Pvt. Ltd.',
			phoneNumber:'9560050296',
			jobTitle:'Lead - Web Development',
			country:'India',
			dateCreated:new Date('30/11/2012'),
			dateUpdated:new Date('30/11/2012'),
			type:'customer',
			addresses:address2
		)
		if (!user2.save()){ user2.errors.allErrors.each{error ->
			println "An error occured with user2: ${error}" }
		}
		
		def video1 = new Video(name:'47243269',
			description:'This is a test video ',
			subject:'Business',
			speaker:User.findByEmail('gautam.mehta@sagepub.co.uk'),
			dateCreated:new Date('30/11/2012'),
			path:'http://player.vimeo.com/video/54135163'
		)
		if (!video1.save()){ video1.errors.allErrors.each{error ->
			println "An error occured with video1: ${error}" }
		}
		
		def video2 = new Video(name:'55378704',
			description:'This is a test video 1',
			subject:'Business',
			speaker:User.findByEmail('bhavi.mehta@sagepub.in'),
			dateCreated:new Date('30/11/2012'),
			path:'http://player.vimeo.com/video/54510052'
		)
		if (!video2.save()){ video2.errors.allErrors.each{error ->
			println "An error occured with video1: ${error}" }
		}
		def video3 = new Video(name:'55369305',
			description:'This is a test video 2',
			subject:'Business',
			speaker:User.findByEmail('gautam.mehta@sagepub.co.uk'),
			dateCreated:new Date('30/11/2012'),
			path:'http://player.vimeo.com/video/54135163'
		)
		if (!video3.save()){ video3.errors.allErrors.each{error ->
			println "An error occured with video1: ${error}" }
		}
		
		def video4 = new Video(name:'55369304',
			description:'This is a test video 3',
			subject:'Business',
			speaker:User.findByEmail('bhavi.mehta@sagepub.in'),
			dateCreated:new Date('30/11/2012'),
			path:'http://player.vimeo.com/video/54510052'
		)
		if (!video4.save()){ video4.errors.allErrors.each{error ->
			println "An error occured with video1: ${error}" }
		}
		def video5 = new Video(name:'55369305',
			description:'This is a test video 4',
			subject:'Business',
			speaker:User.findByEmail('bhavi.mehta@sagepub.in'),
			dateCreated:new Date('30/11/2012'),
			path:'http://player.vimeo.com/video/54510052'
		)
		if (!video5.save()){ video5.errors.allErrors.each{error ->
			println "An error occured with video1: ${error}" }
		}
		def video6 = new Video(name:'47243269',
			description:'This is a test video 5',
			subject:'Business',
			speaker:User.findByEmail('gautam.mehta@sagepub.co.uk'),
			dateCreated:new Date('30/11/2012'),
			path:'http://player.vimeo.com/video/54135163'
		)
		if (!video6.save()){ video6.errors.allErrors.each{error ->
			println "An error occured with video1: ${error}" }
		}
		
		def video7 = new Video(name:'55378704',
			description:'This is a test video 6',
			subject:'Business',
			speaker:User.findByEmail('bhavi.mehta@sagepub.in'),
			dateCreated:new Date('30/11/2012'),
			path:'http://player.vimeo.com/video/54510052'
		)
		if (!video7.save()){ video7.errors.allErrors.each{error ->
			println "An error occured with video1: ${error}" }
		}
		def video8 = new Video(name:'55369305',
			description:'This is a test video 7',
			subject:'Business',
			speaker:User.findByEmail('gautam.mehta@sagepub.co.uk'),
			dateCreated:new Date('30/11/2012'),
			path:'http://player.vimeo.com/video/54135163'
		)
		if (!video8.save()){ video8.errors.allErrors.each{error ->
			println "An error occured with video1: ${error}" }
		}
		
		def video10 = new Video(name:'55369304',
			description:'This is a test video 8',
			subject:'Business',
			speaker:User.findByEmail('bhavi.mehta@sagepub.in'),
			dateCreated:new Date('30/11/2012'),
			path:'http://player.vimeo.com/video/54510052'
		)
		if (!video10.save()){ video10.errors.allErrors.each{error ->
			println "An error occured with video1: ${error}" }
		}
		def video11 = new Video(name:'55369305',
			description:'This is a test video 9 ',
			subject:'Business',
			speaker:User.findByEmail('bhavi.mehta@sagepub.in'),
			dateCreated:new Date('30/11/2012'),
			path:'http://player.vimeo.com/video/54510052'
		)
		if (!video11.save()){ video11.errors.allErrors.each{error ->
			println "An error occured with video1: ${error}" }
		}
		
		def video12 = new Video(name:'47243269',
			description:'This is a test video 10',
			subject:'Business',
			speaker:User.findByEmail('gautam.mehta@sagepub.co.uk'),
			dateCreated:new Date('30/11/2012'),
			path:'http://player.vimeo.com/video/54135163'
		)
		if (!video12.save()){ video12.errors.allErrors.each{error ->
			println "An error occured with video1: ${error}" }
		}
		
		def video13 = new Video(name:'55378704',
			description:'This is a test video 11',
			subject:'Business',
			speaker:User.findByEmail('bhavi.mehta@sagepub.in'),
			dateCreated:new Date('30/11/2012'),
			path:'http://player.vimeo.com/video/54510052'
		)
		if (!video13.save()){ video13.errors.allErrors.each{error ->
			println "An error occured with video1: ${error}" }
		}
		def video14 = new Video(name:'55369305',
			description:'This is a test video 12',
			subject:'Business',
			speaker:User.findByEmail('gautam.mehta@sagepub.co.uk'),
			dateCreated:new Date('30/11/2012'),
			path:'http://player.vimeo.com/video/54135163'
		)
		if (!video14.save()){ video8.errors.allErrors.each{error ->
			println "An error occured with video1: ${error}" }
		}
		
		def video15 = new Video(name:'55369304',
			description:'This is a test video 13',
			subject:'Business',
			speaker:User.findByEmail('bhavi.mehta@sagepub.in'),
			dateCreated:new Date('30/11/2012'),
			path:'http://player.vimeo.com/video/54510052'
		)
		if (!video15.save()){ video10.errors.allErrors.each{error ->
			println "An error occured with video1: ${error}" }
		}
		def video16 = new Video(name:'55369305',
			description:'This is a test video 14',
			subject:'Business',
			speaker:User.findByEmail('bhavi.mehta@sagepub.in'),
			dateCreated:new Date('30/11/2012'),
			path:'http://player.vimeo.com/video/54510052'
		)
		if (!video16.save()){ video11.errors.allErrors.each{error ->
			println "An error occured with video1: ${error}" }
		}
		
		
		def video17 = new Video(name:'55378704',
			description:'This is a test video 15',
			subject:'Business',
			speaker:User.findByEmail('bhavi.mehta@sagepub.in'),
			dateCreated:new Date('30/11/2012'),
			path:'http://player.vimeo.com/video/54510052'
		)
		if (!video17.save()){ video7.errors.allErrors.each{error ->
			println "An error occured with video1: ${error}" }
		}
		def video18 = new Video(name:'55369305',
			description:'This is a test video 16',
			subject:'Business',
			speaker:User.findByEmail('gautam.mehta@sagepub.co.uk'),
			dateCreated:new Date('30/11/2012'),
			path:'http://player.vimeo.com/video/54135163'
		)
		if (!video18.save()){ video8.errors.allErrors.each{error ->
			println "An error occured with video1: ${error}" }
		}
		
		def video19 = new Video(name:'55369304',
			description:'This is a test video 17',
			subject:'Business',
			speaker:User.findByEmail('bhavi.mehta@sagepub.in'),
			dateCreated:new Date('30/11/2012'),
			path:'http://player.vimeo.com/video/54510052'
		)
		if (!video10.save()){ video10.errors.allErrors.each{error ->
			println "An error occured with video1: ${error}" }
		}
		def video20 = new Video(name:'55369305',
			description:'This is a test video 18',
			subject:'Business',
			speaker:User.findByEmail('bhavi.mehta@sagepub.in'),
			dateCreated:new Date('30/11/2012'),
			path:'http://player.vimeo.com/video/54510052'
		)
		if (!video20.save()){ video20.errors.allErrors.each{error ->
			println "An error occured with video20: ${error}" }
		}
		def videoUser1 = new VideoUser(
			video:video1,
			user:user1,
			startTime:new Date().parse("dd-MM-yyyy HH:mm:ss","18-05-2012 09:29:41"),
			endTime:new Date().parse("dd-MM-yyyy HH:mm:ss","31-12-2012 09:29:41")
		)
		if (!videoUser1.save()){ videoUser1.errors.allErrors.each{error ->
			println "An error occured with videoUser1: ${error}" }
		}
		
		def videoUser2 = new VideoUser(
			video:video2,
			user:user2,
			startTime:new Date().parse("dd-MM-yyyy HH:mm:ss","18-05-2012 09:29:41"),
			endTime:new Date().parse("dd-MM-yyyy HH:mm:ss","03-12-2013 09:29:41")
		)
		if (!videoUser2.save()){ videoUser2.errors.allErrors.each{error ->
			println "An error occured with videoUser2: ${error}" }
		}
		
		def videoUser3 = new VideoUser(
			video:video3,
			user:user2,
			startTime:new Date().parse("dd-MM-yyyy HH:mm:ss","18-05-2012 09:29:41"),
			endTime:new Date().parse("dd-MM-yyyy HH:mm:ss","02-12-2013 09:29:41")
		)
		if (!videoUser3.save()){ videoUser3.errors.allErrors.each{error ->
			println "An error occured with videoUser3: ${error}" }
		}
		
		def videoUser4 = new VideoUser(
			video:video4,
			user:user2,
			startTime:new Date().parse("dd-MM-yyyy HH:mm:ss","18-05-2012 09:29:41"),
			endTime:new Date().parse("dd-MM-yyyy HH:mm:ss","31-12-2013 09:29:41")
		)
		if (!videoUser4.save()){ videoUser4.errors.allErrors.each{error ->
			println "An error occured with videoUser4: ${error}" }
		}
    }
	
    def destroy = {
    }
}
