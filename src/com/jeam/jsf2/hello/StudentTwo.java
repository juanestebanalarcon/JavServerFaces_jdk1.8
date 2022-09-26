package com.jeam.jsf2.hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentTwo {
	private String firstName,lastName,coutry;
	private String favLanguage;
	
	public StudentTwo() {
	}
	

	public String getFavLanguage() {
		return favLanguage;
	}


	public void setFavLanguage(String favLanguage) {
		this.favLanguage = favLanguage;
	}


	public String getCoutry() {
		return coutry;
	}


	public void setCoutry(String coutry) {
		this.coutry = coutry;
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
	
}
