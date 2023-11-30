package com.jdc04.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "IPL")
public class Cricket {
	@Id
	private Integer id;
	private String name;

	private String gender;
	private String email;
	private String contact;
	private String position;
	private String team;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public Cricket(Integer id, String name, Integer dod, String gender, String email, String contact, String position,
			String team) {
		super();
		this.id = id;
		this.name = name;
		
		this.gender = gender;
		this.email = email;
		this.contact = contact;
		this.position = position;
		this.team = team;
	}

	public Cricket() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cricket [id=" + id + ", name=" + name + ", gender=" + gender + ", email=" + email
				+ ", contact=" + contact + ", position=" + position + ", team=" + team + "]";
	}

}
