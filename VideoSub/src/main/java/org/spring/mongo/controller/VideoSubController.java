package org.spring.mongo.controller;

import java.util.Map;

import org.spring.mongo.Role;
import org.spring.mongo.User;
import org.spring.mongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class VideoSubController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(value="/")
	public String getHomePage() {
		return "home";
	}

	@RequestMapping(value="createUser")
	public String createUser(Map<String, Object> model) {
        User user = new User();
        Role role = new Role();
        model.put("user", user);
        model.put("role",role);

		return "createUser";
	}
	
	@RequestMapping(value="userDetails")
	public String handleCreateUser(Map<String, Object> model,
			@RequestParam(required=false) String userName,
			@RequestParam(required=false) String password,
			@RequestParam(required=false) String firstName,
			@RequestParam(required=false) String lastName,
			@RequestParam(required=false) String middleName,
			@RequestParam(required=false) String organization,
			@RequestParam(required=false) String email,
			@RequestParam(required=false) String phoneNumber,
			@RequestParam(required=false) String jobTitle,
			@RequestParam(required=false) String country,
			@RequestParam(required=false) Integer role) {
		Role newRole = new Role();
		newRole.setRole(role);
		User newUser = new User();
		newUser.setUsername(userName);
		newUser.setPassword(password);
		newUser.setFirstName(firstName);
		newUser.setMiddleName(middleName);
		newUser.setLastName(lastName);
		newUser.setEmail(email);
		newUser.setOrganization(organization);
		newUser.setPhoneNumber(phoneNumber);
		newUser.setJobTitle(jobTitle);
		newUser.setRole(newRole);
		model.put("user", service.create(newUser));
		return "userDetails";
	}
}