package org.axisgroupservice.springboot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.axisgroupservice.springboot.model.Category;
import org.axisgroupservice.springboot.model.Details;
import org.axisgroupservice.springboot.model.Image;
import org.axisgroupservice.springboot.model.Notification;
import org.axisgroupservice.springboot.model.Product;
import org.axisgroupservice.springboot.model.Specs;
import org.axisgroupservice.springboot.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryRepository categoryRepository;
	 
	
	@RequestMapping("/save-categories")
	public void saveProduct(){
		
		
		Category c= getCategory();
		
		categoryRepository.save(c);
	
	}
	
	public Category getCategory(){
Category category= new Category();
		
		category.setName("Boar Goat");
		
		List<String> averageRatings= new ArrayList<>();
		averageRatings.add("rating 1");
		averageRatings.add("rating 2");
		
		
		List<String> colors= new ArrayList<>();
		colors.add("red");
		colors.add("blue");
		
		List<String> sizes= new ArrayList<>();
		sizes.add("80");
		sizes.add("90");
		
		List<String> styles= new ArrayList<>();
		styles.add("white");
		styles.add("white");
		
		List<String> materials= new ArrayList<>();
		materials.add("material 1");
		materials.add("material 2");
		
		List<String> averageRating= new ArrayList<>();
		averageRating.add("averageRating 1");
		averageRating.add("averageRating 2");
		
		List<String> brands= new ArrayList<>();
		
		brands.add("boar Goat");
		brands.add("Spanish Goat");
		
		category.setAverageRatings(averageRatings);
		category.setSizes(sizes);
		category.setMaterials(materials);
		category.setAverageRatings(averageRatings);
		category.setBrands(brands);
		
		List<Product> products = new ArrayList<>();
		
		Product product1 =new Product();
		
		product1.setName("Boar Goat Name");
		product1.setRating(5);
		
		
		//Notification
		Notification notification= new Notification();
		notification.setEmail("deepak.pokhrel@hotmail.com");
		notification.setPhone("888-888-8889");
		
		product1.setNotification(notification);
		
		//Details
		Details details= new Details();
		details.setDescription(""
				+ " Boer goats were bred in South Africa for meat and were selected for superior body shape, high growth rate, and fertility. These large-framed animals may be white and reddish-brown, or they may be all red with short hair and black, brown, or red markings on the head and neck. Boers have short horns that are curved close to the head. They have long, pendulous ears, and are known for being docile."
				+ "The Boer is highly resistant to disease, and it does well in hot, dry, semi-desert areas. Reaching slaughter maturity in about 90 days, they can reach a size of about 190 to 230 pounds for does, 200 to 340 pounds"
				+ " for bucks.");
		
		List<String> features= new ArrayList<>();
		features.add("features 1");
		features.add("features 2");
		details.setFeatures(features);
		
		product1.setDetails(details);
		
		
		Specs specs1= new Specs();
		Map<String, String> features_specs=new HashMap<>();
		features_specs.put("key1", "value1");
		features_specs.put("key2", "value2");
		
		specs1.setFeatures(features_specs);
		
		product1.setSpecs(specs1);
		
		product1.setCategory(category);
		
		Image image1= new Image();
		image1.setImagePath("/some/dummy/path");
		image1.setVideoPath("some/dummy/video/path");
		image1.setProduct(product1); 
		

		
		List<Image> images= new ArrayList<>();
		images.add(image1);
		product1.setImages(images);
		
	
		products.add(product1);
		
		category.setProducts(products);
		
		
		return category;
	}

}
