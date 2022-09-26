package com.jeam.jsf2.hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentThree {
	private String firstName,lastName,coutry;
	private List<String>countryOptions;
	
	public StudentThree() {
		countryOptions = new ArrayList<>();
		countryOptions.add("Brazil");
		countryOptions.add("France");
		countryOptions.add("Colombia");
		countryOptions.add("Brucelas");
		countryOptions.add("Chile");
		countryOptions.add("United States");
		countryOptions.add("United Kindom");
	}
	
	
	
	public List<String> getCountryOptions() {
		return countryOptions;
	}



	public void setCountryOptions(List<String> countryOptions) {
		this.countryOptions = countryOptions;
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
