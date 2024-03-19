package com.studentapp.StudentAppSpringBoot.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table
public class StudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull(message = "Name cannot be null")
	@NotBlank(message = "Name cannot be blank")
	@Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
	@Pattern(regexp = "[a-zA-Z]+", message = "Username must contain only letters")
	private String name;
	@NotNull(message = "Gender must not be null")
	@Pattern(regexp = "^(M|F|m|f|male|female|other)$", message = "Gender must be either 'male' or 'female'")
	private String gender;
	@NotNull(message = "Email address must not be null")
	@Email(message = "Invalid email address")
	@Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,3})$", message = "invalid Email Formate")
	@Column(unique = true)
	private String email;
	@NotBlank(message = "Phone number is required")
	@Pattern(regexp = "^\\d{10}$")
	private String phoneNo;
	@NotNull(message = "Aadhaar number must not be null")
	@Pattern(regexp = "^\\d{12}$")
	private String adhaarNo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAdhaarNo() {
		return adhaarNo;
	}

	public void setAdhaarNo(String adhaarNo) {
		this.adhaarNo = adhaarNo;
	}

	public StudentEntity() {
		super();
	}

	public StudentEntity(Long id, String name, String gender, String email, String phoneNo, String adhaarNo) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.phoneNo = phoneNo;
		this.adhaarNo = adhaarNo;
	}

	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", gender=" + gender + ", email=" + email + ", phoneNo="
				+ phoneNo + ", adhaarNo=" + adhaarNo + "]";
	}

}
