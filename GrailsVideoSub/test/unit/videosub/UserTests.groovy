package videosub

import grails.test.mixin.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(User)
class UserTests {

   protected void setUp() {
	   super.setUp() 
	}
   protected void tearDown() { 
	   super.tearDown()
   }
   void testToString() {
	  def user1 = new User(email:'gautam.mehta@sagepub.in',
			password:'123456',
			salutation:'Mr',
			firstName:'Gautam',
			middleName:'test',
			lastName:'Mehta',
			organization:'SAGE Publications Pvt. Ltd.',
			phoneNumber:'9560050296',
			jobTitle:'Lead - Web Development',
			country:'IN',
			creationDate:new Date('30/11/2012'),
			lastModifiedDate:new Date('30/11/2012')
		)
	  assertEquals 'Gautam test Mehta', user1.toString()
   }
}
