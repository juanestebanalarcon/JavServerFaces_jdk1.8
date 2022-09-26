package com.jeam.jsf2.hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class StudentFour {
	private String firstName,lastName,coutry;
	private String [] favLang;
	
	public StudentFour() {

	}
	
	public void validatePersonalized(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		String data = value.toString();
		if(data.startsWith("hola")) {
			FacesMessage message = new FacesMessage("Course must start with hola");
			throw new ValidatorException(message);
		}
	}
	
	public String[] getFavLang() {
		return favLang;
	}



	public void setFavLang(String[] favLang) {
		this.favLang = favLang;
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
