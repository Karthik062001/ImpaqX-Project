package com.SpringProjAutowiringEX7.SpringAutowiringProj2;

public class profesor {

	
	int p_id;
	String p_name;
	String p_sub;
	public profesor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public profesor(int p_id, String p_name, String p_sub) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_sub = p_sub;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_sub() {
		return p_sub;
	}
	public void setP_sub(String p_sub) {
		this.p_sub = p_sub;
	}
	@Override
	public String toString() {
		return "profesor [p_id=" + p_id + ", p_name=" + p_name + ", p_sub=" + p_sub + "]";
	}
	
	
}
