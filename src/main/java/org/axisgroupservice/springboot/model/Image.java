package org.axisgroupservice.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="image")
public class Image {
	@Id
	@Column(name="image_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long imageId;
	@Column(name="image_path")
	private String imagePath;
	@Column(name="video_path")
	private String videoPath;
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	private Product product;
	
	
	public Long getImageId() {
		return imageId;
	}
	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getVideoPath() {
		return videoPath;
	}
	public void setVideoPath(String videoPath) {
		this.videoPath = videoPath;
	}
	public Product getProduct() {
		return product; 
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
}
