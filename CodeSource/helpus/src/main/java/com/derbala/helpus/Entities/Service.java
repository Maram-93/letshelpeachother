package com.derbala.helpus.Entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="SERVICE")
public class Service {
	
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private Integer id;
	private String label;
	private String code;
	private Category category;
	
	public Service() {
		super();
			}
	
	public Service(Integer id, String label, String code, Category category) {
		super();
		this.id = id;
		this.label = label;
		this.code = code;
		this.category = category;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "LABEL", nullable = false)
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	@Column(name = "CODE", nullable = false)
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "CATEGORY_CODE", referencedColumnName = "CODE")
	public Category getCategory()  {
		return category;
	}
	public void setCategoryId(Category category) {
		this.category = category;
	}
	
	

}
