package videosub

import java.util.Date;

class Address {

    static constraints = {
		address1(nullable:false)
		address2()
		address3()
		city(nullable:false)
		state(nullable:false)
		postCode(nullable:false)
		country(nullable:false)
		homeAddress()
    }
	static searchable = true
	String address1
	String address2
	String address3
	String city
	String state
	String postCode
	String country
	boolean homeAddress
	String toString(){address1+", "+address2+", "+city+", "+state+", "+postCode+", "+country}
}
