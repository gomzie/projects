package org.spring.mongo.controller;

import org.spring.mongo.Role;
import org.spring.mongo.User;
import org.spring.mongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {
	@Autowired
	private UserService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public String createUser() {
		return "createUser";
	}
	
	public @ResponseBody User handleCreateUser(
			@RequestParam String userName,
			@RequestParam String password,
			@RequestParam String firstName,
			@RequestParam String lastName,
			@RequestParam String middleName,
			@RequestParam String organization,
			@RequestParam String email,
			@RequestParam String phoneNumber,
			@RequestParam String jobTitle,
			@RequestParam String country,
			@RequestParam Integer role) {
		System.out.println("########### ");
		Role newRole = new Role();
		newRole.setRole(role);
		User newUser = new User();
		newUser.setUsername(userName);
		newUser.setPassword(password);
		newUser.setFirstName(firstName);
		newUser.setLastName(lastName);
		newUser.setEmail(email);
		newUser.setOrganization(organization);
		newUser.setPhoneNumber(phoneNumber);
		newUser.setJobTitle(jobTitle);
		newUser.setRole(newRole);
		

		return service.create(newUser);
	}
}
