package com.derbala.helpus.Entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="CATEGORY")
public class Category {
	

	private String label;
	private String code;
	private Date creationDate;
	
public Category () {
	super();	
}

public Category( String label, String code, Date creationDate) {
	super();
	this.label = label;
	this.code = code;
	this.creationDate = creationDate;
}

@Id
@Column(name = "CODE")
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}

@Column(name = "LABEL", nullable = false)
public String getLabel() {
	return label;
}

public void setLabel(String label) {
	this.label = label;
}



@Column(name = "creation_date", nullable = false)
public Date getCreationDate() {
	return creationDate;
}

public void setCreationDate(Date creationDate) {
	this.creationDate = creationDate;
}
}
