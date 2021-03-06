package com.lko.shopingBackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="Category")
@SequenceGenerator(name="categoryIdSeq", sequenceName= "category_id_seq", allocationSize=1)
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator ="categoryIdSeq")
	private int categoryId;
	
	@NotBlank(message = "Please Enter The Product Name!")
	private String categoryName;
	
	@NotBlank(message = "Please Enter The Product Name!")
	private String description;
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
