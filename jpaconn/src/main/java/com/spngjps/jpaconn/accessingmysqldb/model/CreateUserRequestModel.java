package com.spngjps.jpaconn.accessingmysqldb.model;

public class CreateUserRequestModel {
	private String name;

	 private String email;

	public CreateUserRequestModel(String name, String email) {
		super();
		this.name = name;
		this.email = email;
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
}
