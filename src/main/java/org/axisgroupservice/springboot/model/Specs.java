package org.axisgroupservice.springboot.model;

import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="specs")
public class Specs {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long specId;
	@ElementCollection
	private Map<String, String> features;
	
	public Long getSpecId() {
		return specId;
	}
	public void setSpecId(Long specId) {
		this.specId = specId;
	}
	public Map<String, String> getFeatures() {
		return features;
	}
	public void setFeatures(Map<String, String> features) {
		this.features = features;
	}
	
}
