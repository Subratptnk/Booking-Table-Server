package com.example.demo.model;

import java.time.LocalDateTime;

public class Table {
	
	private Long id;
	private String name;
	private String email;
	private LocalDateTime bookingDate;
	private Integer members;
	private String diningType;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDateTime getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Integer getMembers() {
		return members;
	}
	public void setMembers(Integer members) {
		this.members = members;
	}
	public String getDiningType() {
		return diningType;
	}
	public void setDiningType(String diningType) {
		this.diningType = diningType;
	}
	@Override
	public String toString() {
		return "Table [id=" + id + ", name=" + name + ", email=" + email + ", bookingDate=" + bookingDate + ", members="
				+ members + ", diningType=" + diningType + "]";
	}
	
	

}
