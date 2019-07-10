package com.woniu.action;

public class UserAction {
	private String username;
	private String password;
	public String save() {
		System.out.println("UserAction.save()"+username+"~~~~"+password);
		return "kk";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
