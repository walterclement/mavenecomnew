package com.bakeecom.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String cname;
	private String address;
	private String email;

	public int getCid() {
		return cid;
	}

	public void setPid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return cname;
	}

	public void setName(String cname) {
		this.cname = cname;
	}

	public String getAddress() {
		return address;
	}

	public void setDescription(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setPrice(String email) {
		this.email = email;
	}

}
