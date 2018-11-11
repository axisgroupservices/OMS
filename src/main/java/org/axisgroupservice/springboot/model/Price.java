package org.axisgroupservice.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="price")
public class Price {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="price_id")
	private Long priceId;
	private double msrp;
	private double discount;
	@Column(name="selling_price")
	private double sellingPrice;
	
	
	public Long getPriceId() {
		return priceId;
	}
	public void setPriceId(Long priceId) {
		this.priceId = priceId;
	}
	public double getMsrp() {
		return msrp;
	}
	public void setMsrp(double msrp) {
		this.msrp = msrp;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	
	

}
