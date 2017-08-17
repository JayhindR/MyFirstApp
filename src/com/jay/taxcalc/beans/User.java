package com.jay.taxcalc.beans;

import java.io.Serializable;

public class User implements Serializable {


	private static final long serialVersionUID = -6765714377548083348L;
	
	private int userId;
	private String userName;
	private String pswd;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

}
