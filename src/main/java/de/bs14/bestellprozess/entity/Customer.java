/**
 * @author muratbrm
 * Diese Klasse bildet eine Tabelle in MySQL ab
 */

package de.bs14.bestellprozess.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// mit der @Entity Annotation, wird die Customer Klasse zu einer DB-Tabelle.  
@Entity
public class Customer {
	//@Id steht für Primary Key
	@Id
	//@GeneratedValue bestimmt man ob z.B der Primary Key auto_increment sein soll. 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customer_id;
	
	private String firstName;
	private String lastName;
	private String street;
	private Long postalCode;
	private String city;
	private Integer streetNumber;
	private String email;
	
	public Customer(Integer customer_id, String firstName, String lastName, String street, Long postalCode, String city,
			Integer streetNumber, String email) {
		this.customer_id = customer_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.street = street;
		this.postalCode = postalCode;
		this.city = city;
		this.streetNumber = streetNumber;
		this.email = email;
	}
	
	public Customer() {}
	
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Long getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(long postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
