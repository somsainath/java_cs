package com.casestudyhms;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


//Schema
@Document(collection="customer")
public class Customer {
	@Id
	private String id;
	private String name;
	private String company;
	private double phonenum;
	private String email;
	private String gender;
	private String address;
	
	public Customer(String id, String name, String company, double phonenum, String email, String gender,
			String address) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.phonenum = phonenum;
		this.email = email;
		this.gender = gender;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(double phonenum) {
		this.phonenum = phonenum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", company=" + company + ", phonenum=" + phonenum + ", email="
				+ email + ", gender=" + gender + ", address=" + address + "]";
	}
			
}
