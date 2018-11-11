package org.axisgroupservice.springboot.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="review")
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="review_id")
	private Long reviewId;
	private String title;
	private String description;
	@Temporal(TemporalType.DATE)
	private Date date;
	@Column(name="reviewed_by")
	private String reviewedBy;
	
	public Long getReviewId() {
		return reviewId;
	}
	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getReviewedBy() {
		return reviewedBy;
	}
	public void setReviewedBy(String reviewedBy) {
		this.reviewedBy = reviewedBy;
	}
	
}
