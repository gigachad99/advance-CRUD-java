package com.learncode.entities;

public class User {
	private int id;
	private String name;
	private String email;
	private String password;
	private String profile;
	public User(int id, String name, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	
	
	public User(String email) {
		super();
		this.email = email;
	}



	public User(int id, String name, String email, String password, String profile) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.profile = profile;
	}



	public String getProfile() {
		return profile;
	}



	public void setProfile(String profile) {
		this.profile = profile;
	}



	public User(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}






	public User() {
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}




	
	
	
	
}
