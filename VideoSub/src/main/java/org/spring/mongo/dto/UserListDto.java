package org.spring.mongo.dto;

import java.util.List;

import org.spring.mongo.User;


public class UserListDto {

	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}