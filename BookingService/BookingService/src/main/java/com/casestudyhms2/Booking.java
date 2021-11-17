package com.casestudyhms2;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="booking")
public class Booking {
	@Id
	private String id;
	private String name;
	private int quantity;
	private float cost;
	
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
	public int getquantity() {
		return quantity;
	}
	public void setquantity(int quantity) {
		this.quantity = quantity;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "Booking [id=" + id + ", name=" + name + ", quantity=" + quantity + ", cost=" + cost + "]";
	}
	public Booking(String id, String name, int quantity, float cost) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
	}

	

}
