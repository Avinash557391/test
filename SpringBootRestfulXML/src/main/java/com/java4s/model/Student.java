package com.java4s.model;

public class Student {
	
	private int id;
	private String name;
	private String stnd;
	private String stnd1;
	public Student() {
		
	}

	public Student(int id, String name, String stnd) {
		super();
		this.id = id;
		this.name = name;
		this.stnd = stnd;
		
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

	public String getStnd() {
		return stnd;
	}

	public void setStnd(String stnd) {
		this.stnd = stnd;
	}

	public void setStnd1(String stnd1) {
		this.stnd1 = stnd1;
	}
	public String getStnd1() {
		return stnd1;
	}

}
