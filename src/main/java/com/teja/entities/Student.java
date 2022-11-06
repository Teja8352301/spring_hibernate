package com.teja.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;

	@Column(name="name")
	String name;
	
	@Column(name="school_name")
	String schoolName;
	
	public Student(int id, String name, String schoolName) {
		super();
		this.id = id;
		this.name = name;
		this.schoolName = schoolName;
	}
	
	

	public Student() {
		super();
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", schoolName=" + schoolName + "]";
	}
	
}
