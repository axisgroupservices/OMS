package org.axisgroupservice.springboot.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="product_id")
	private Long productId;
	private String name;
	private int rating;
	@OneToMany(
	        mappedBy = "reviewId", 
	        cascade = CascadeType.ALL, 
	        orphanRemoval = true
	    )
	private List<Review> review;
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="priceId")
	private Price price;
	@OneToMany(
	        mappedBy = "product", 
	        cascade = CascadeType.ALL, 
	        orphanRemoval = true
	    ) 
	private List<Address> shipping;
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="notificationId")
	private Notification notification;
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="detailId")
	private Details details;
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="specId")
	private Specs specs;
	@ManyToOne
    @JoinColumn(name = "category_id_", nullable = false)
	private Category category;
	@OneToMany(
	        mappedBy = "product", 
	        cascade = CascadeType.ALL, 
	        orphanRemoval = true
	    ) 
	
	private List<Image> images;

	public Long getId() {
		return productId;
	}
	public void setId(Long productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public List<Review> getReview() {
		return review;
	}
	public void setReview(List<Review> review) {
		this.review = review;
	}
	public Price getPrice() {
		return price;
	}
	public void setPrice(Price price) {
		this.price = price;
	}
	
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public List<Address> getShipping() {
		return shipping;
	}
	public void setShipping(List<Address> shipping) {
		this.shipping = shipping;
	}
	public Notification getNotification() {
		return notification;
	}
	public void setNotification(Notification notification) {
		this.notification = notification;
	}
	public Details getDetails() {
		return details;
	}
	public void setDetails(Details details) {
		this.details = details;
	}
	public Specs getSpecs() {
		return specs;
	}
	public void setSpecs(Specs specs) {
		this.specs = specs;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public List<Image> getImages() {
		return images;
	}
	public void setImages(List<Image> images) {
		this.images = images;
	}
	
	
	

}
