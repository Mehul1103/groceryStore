package com.grocery.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.*;

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	@Column(name = "id", unique = true, nullable = false)
	private int id;

	@Column(name = "first_name", length = 255, nullable = false)
	private String firstName;

	@Column(name = "last_name", length = 255, nullable = false)
	private String lastName;

	@Column(name = "email", unique = true, length = 255, nullable = false)
	private String email;

	@Column(name = "password", length = 255, nullable = false)
	private String password;

	@Column(name = "phone", unique = false, length = 15, nullable = false)
	private String phone;

	@Column(name = "email_subscription", nullable = false)
	private boolean emailSubscription;

	@Column(name = "createdDate", columnDefinition = "TIMESTAMP WITH TIME ZONE", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	@Column(name = "address", unique = false, length = 255, nullable = false)
	private String address;

	@Column(name = "city", unique = false, length = 255, nullable = false)
	private String city;

	@Column(name = "country", unique = false, length = 150, nullable = false)
	private String country;

	@Column(name = "postalcode", unique = false, length = 55, nullable = false)
	private String postalCode;

	public Customer(int id, String first_name, String last_name, String email, String password, String phone,
			String address, String city, String country, String postal_code, boolean email_subscription,
			Date created_date) {
		super();
		this.id = id;
		this.firstName = first_name;
		this.lastName = last_name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.address = "--";
		this.city = "--";
		this.country = "--";
		this.postalCode = "--";
		this.emailSubscription = email_subscription;
		this.createdDate = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the first_name
	 */
	public String getFirst_name() {
		return firstName;
	}

	/**
	 * @param first_name
	 *            the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.firstName = first_name;
	}

	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return lastName;
	}

	/**
	 * @param last_name
	 *            the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.lastName = last_name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the postal_code
	 */
	public String getPostal_code() {
		return postalCode;
	}

	/**
	 * @param postal_code
	 *            the postal_code to set
	 */
	public void setPostal_code(String postal_code) {
		this.postalCode = postal_code;
	}

	/**
	 * @return the created_date
	 */
	public Date getCreated_date() {
		return createdDate;
	}

	/**
	 * @param created_date
	 *            the created_date to set
	 */
	public void setCreated_date(Date created_date) {
		this.createdDate = created_date;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the email_subscription
	 */
	public boolean isEmailSubscription() {
		return emailSubscription;
	}

	/**
	 * @param email_subscription
	 *            the email_subscription to set
	 */
	public void setEmailSubscription(boolean emailSubscription) {
		this.emailSubscription = emailSubscription;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

}
