package com.srihari;

import java.io.Serializable;

public class Person implements Serializable {
	
	private String name;
	private int age;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String toSring() {
		return id+" : "+name+" : "+id+" : ";
	}
	

}
