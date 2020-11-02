package com.projecttrainschool; 

public class Passanger {
	
	private int age;
	private String firstName; 
	private String lastName;
	private String fullName; 
	
	public Passanger(String fullName) {
		this.fullName = fullName; 
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	} 
	

}
