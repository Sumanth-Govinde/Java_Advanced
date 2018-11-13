package com.slk.training.model;

public class productBean {
	
	private String pid;
	private String pname;
	private double pcost;
	private int pquantity;
	
	public productBean(String pid, String pname, double pcost, int pquantity) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcost = pcost;
		this.pquantity = pquantity;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPcost() {
		return pcost;
	}

	public void setPcost(double pcost) {
		this.pcost = pcost;
	}

	public int getPquantity() {
		return pquantity;
	}

	public void setPquantity(int pquantity) {
		this.pquantity = pquantity;
	}

	@Override
	public String toString() {
		return "productBean [pid=" + pid + ", pname=" + pname + ", pcost=" + pcost + ", pquantity=" + pquantity + "]";
	}
	
	
	
	

}
