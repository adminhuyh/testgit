package com.neo.model;

import java.io.Serializable;



public class User implements Serializable {private int age;
					   private String adfdfsdf;
        private String country;
	private static final long serialVersionUID = 1L;
	private Long id;private Long ids;
	private String userName;
	private String password;
	private String email;
	private String nickname;
	private String regTime;
	private String regTimess;
	private String regTimessss;
	private String aaa;

	private String kyessdf;
        private String kyfdfd;	 
					   
	
	private Long idfd;

	private String sss;
					   
					   private String address;


	public User() {
		super();
	}
	public User(String email, String nickname, String password, String userName, String regTime) {
		super();
		this.email = email;
		this.nickname = nickname;
		this.password = password;
		this.userName = userName;
		this.regTime = regTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getRegTime() {
		return regTime;
	}

	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", userName='" + userName + '\'' +
				", password='" + password + '\'' +
				", email='" + email + '\'' +
				", nickname='" + nickname + '\'' +
				", regTime='" + regTime + '\'' +
				'}';
	}
}
