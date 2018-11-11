package org.axisgroupservice.springboot.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {
	@Id
	@Column(name="category_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long categoryId;
	@Column(name="category_name")
	private String name;
	@ElementCollection(targetClass=String.class)
	private List<String> colors;
	@ElementCollection(targetClass=String.class)
	private List<String> sizes;
	@ElementCollection(targetClass=String.class)
	private List<String> styles;
	@ElementCollection(targetClass=String.class)
	private List<String> materials;
	@Column(name="average_rating")
	@ElementCollection(targetClass=String.class)
	private List<String> averageRatings;
	@ElementCollection(targetClass=String.class)
	private List<String > brands;
	
	@OneToMany(
	        mappedBy = "category", 
	        fetch = FetchType.LAZY,
	        cascade = CascadeType.ALL	
	    )
	private List<Product> products;
	
	
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getColors() {
		return colors;
	}
	public void setColors(List<String> colors) {
		this.colors = colors;
	}
	public List<String> getSizes() {
		return sizes;
	}
	public void setSizes(List<String> sizes) {
		this.sizes = sizes;
	}
	public List<String> getStyles() {
		return styles;
	}
	public void setStyles(List<String> styles) {
		this.styles = styles;
	}
	public List<String> getMaterials() {
		return materials;
	}
	public void setMaterials(List<String> materials) {
		this.materials = materials;
	}
	public List<String> getAverageRatings() {
		return averageRatings;
	}
	public void setAverageRatings(List<String> averageRatings) {
		this.averageRatings = averageRatings;
	}
	public List<String> getBrands() {
		return brands;
	}
	public void setBrands(List<String> brands) {
		this.brands = brands;
	}
	
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
}
