package com.example.demo.entities;

import javax.persistence.Column;	
import javax.persistence.Entity;	
import javax.persistence.GeneratedValue;	
import javax.persistence.GenerationType;	
import javax.persistence.Id;	
import javax.persistence.Table;	


@Entity
@Table(name = "CUSTOMERS")
public class Customer {
	
	@Id		
	@GeneratedValue(strategy = GenerationType.IDENTITY)		
	@Column(name="ID")		
	Long id;		
	@Column(name="NAME")
	String name;	
	@Column(name="SURNAME")	
	String surname;	
	@Column(name="BIRTDATE")	
	String birtdate;		
	@Column(name="PHONE")		
	String phone;		
	@Column(name="COUNTRY")		
	String country;		
	@Column(name="CITY")		
	String city;		
	@Column(name="DIRECTION")		
	String direction;		
	@Column(name="POST_CODE")		
	String postCode;		
	//GETTERS & SETTERS		
	public Long getId() {
		return id;		
		}		
	public void setId(Long id) {
		this.id = id;		
		}		
	public String getName() {		
		return name;
		}
	public void setName(String name) {
		this.name = name;
		}
	public String getSurname() {
		return surname;	
		}
	public void setSurname(String surname) {
		this.surname = surname;
		}	
	public String getBirtdate() {	
		return birtdate;	
		}
	public void setBirtdate(String birtdate) {
		this.birtdate = birtdate;		
		}
	public String getPhone() {
		return phone;
		}
	public void setPhone(String phone) {
		this.phone = phone;
		}
	public String getCountry() {
		return country;	
		}
	public void setCountry(String country) {
		this.country = country;		
		}
	public String getCity() {		
		return city;
		}
	public void setCity(String city) {
		this.city = city;	
		}
	public String getDirection() {
		return direction;	
		}
	public void setDirection(String direction) {		
		this.direction = direction;
		}
	public String getPostCode() {
		return postCode;	
		}
	public void setPostCode(String postCode) {		
		this.postCode = postCode;		
		}

}
