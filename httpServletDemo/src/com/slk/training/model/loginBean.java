package com.slk.training.model;

public class loginBean {
	
	private String name;
	private String pass;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public boolean validate() {
		// TODO Auto-generated method stub
		if(pass.contains("slk"))
			return true;
		else
			return false;
	}

}
