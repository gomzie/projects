package videosub

class User {

    static constraints = {
		email(email:true,blank:false,nullable:false,unique:true)
		password(blank:false,size: 5..15)
		salutation(nullable:true)
		firstName(blank:false,nullable:false)
		middleName(nullable:true)
		lastName(blank:false,nullable:false) 
		organization(nullable:true)
		phoneNumber(nullable:true)
		jobTitle(nullable:true)
		country(nullable:false)
		addresses(nullable:true)
		type(nullable:false)
    }
	static mapping = {
		autoTimestamp true
	}
	static searchable = true
	String email
	String password
	String salutation
	String firstName
	String middleName
	String lastName
	String organization
	String phoneNumber
	String jobTitle
	String country
	Date dateCreated
	Date dateUpdated
	static hasMany = [addresses:Address]
	String type
	String toString(){firstName+" "+lastName }
}
