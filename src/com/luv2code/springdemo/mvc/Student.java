package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countyOptions;
	
	private String favoriteLanguage;
	
	private String[] operatingSystems;
		
	public Student() {
		
		// populate contry options: used ISO country code
		countyOptions = new LinkedHashMap<>();
		countyOptions.put("BR", "Brazil");
		countyOptions.put("FR", "France");
		countyOptions.put("DE", "Germany");
		countyOptions.put("IN", "India");
		countyOptions.put("US", "United Stats of America");
		countyOptions.put("KR", "Republic of Korea");
		
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

	public LinkedHashMap<String, String> getCountyOptions() {
		return countyOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
	
}

































