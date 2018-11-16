package org.axisgroupservice.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="address")
public class Address {
	@Id
	@Column(name="address_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long addressId;
	private String address;
	private String state;
	private String unitNum;
	private String city;
	private String zipcode;
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	private Product product;
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	private Product customer;
	
	public String getAddress() {
		return address;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getUnitNum() {
		return unitNum;
	}
	public void setUnitNum(String unitNum) {
		this.unitNum = unitNum;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
