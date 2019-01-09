package com.luv2code.springdemo.mvc;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favLanguage;
	private String[] operatingSystems;
	
	private LinkedHashMap<String, String> countryOptions;
	private ArrayList<String> languages;
	private ArrayList<String> opSystems;
	
	public Student() {
		
		// Populate country options
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("SP", "Spain");
		countryOptions.put("US", "United States");
		
		languages = new ArrayList<>();
		languages.add("JAVA");
		languages.add("C#");
		languages.add("PHP");
		languages.add("Ruby");
		
		opSystems = new ArrayList<>();
		opSystems.add("Linux");
		opSystems.add("Mac OS");
		opSystems.add("Windows");
		
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavLanguage() {
		return favLanguage;
	}

	public void setFavLanguage(String favLanguage) {
		this.favLanguage = favLanguage;
	}
	
	public ArrayList<String> getLanguages() {
		return languages;
	}

	public ArrayList<String> getOpSystems() {
		return opSystems;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	

}
