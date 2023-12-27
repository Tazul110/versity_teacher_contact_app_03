package com.example.demo.sms.Model;

import java.sql.Blob;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Table(name="teacher")
@Entity(name="teacher")
public class Teacher {

	@Id
	private String tEmail;
	private String tName;
	private String tDept;
	private String tPhone;
	
	@Lob
	private Blob tImage;
	
	public String gettEmail() {
		return tEmail;
	}
	public void settEmail(String tEmail) {
		this.tEmail = tEmail;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public String gettDept() {
		return tDept;
	}
	public void settDept(String tDept) {
		this.tDept = tDept;
	}
	public String gettPhone() {
		return tPhone;
	}
	public void settPhone(String tPhone) {
		this.tPhone = tPhone;
	}
	
	
	
	
	
	public Blob gettImage() {
		return tImage;
	}
	
	public void settImage(Blob tImage) {
		this.tImage = tImage;
	}
	
	public Teacher()
	{
		
	}
	public Teacher(String tEmail, String tName, String tDept, String tPhone, Blob image) {
		super();
		this.tEmail = tEmail;
		this.tName = tName;
		this.tDept = tDept;
		this.tPhone = tPhone;
		this.tImage = image;
	}
	
	
	
	
}
