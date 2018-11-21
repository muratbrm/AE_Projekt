/**
 * @author muratbrm
 * Diese Klasse bildet eine Tabelle in MySQL ab
 */

package de.bs14.bestellprozess.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//mit der @Entity Annotation, wird die Customer Klasse zu einer DB-Tabelle.
@Entity
public class Product {
	//@Id steht für Primary Key
	@Id
	//@GeneratedValue bestimmt man ob z.B der Primary Key auto_increment sein soll. 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer product_id;
	
	private Long articleNumber;
	private Double price;
	private String imagePath;
	private String shortText;
	private String longText;
	private String headerText;
	
	public Product(Integer product_id, Long articleNumber, Double price, String imagePath, String shortText,
			String longText, String headerText) {
		this.product_id = product_id;
		this.articleNumber = articleNumber;
		this.price = price;
		this.imagePath = imagePath;
		this.shortText = shortText;
		this.longText = longText;
		this.headerText = headerText;
	}
	
	public Product() {}

	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public Long getArticleNumber() {
		return articleNumber;
	}

	public void setArticleNumber(Long articleNumber) {
		this.articleNumber = articleNumber;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getShortText() {
		return shortText;
	}

	public void setShortText(String shortText) {
		this.shortText = shortText;
	}

	public String getLongText() {
		return longText;
	}

	public void setLongText(String longText) {
		this.longText = longText;
	}

	public String getHeaderText() {
		return headerText;
	}

	public void setHeaderText(String headerText) {
		this.headerText = headerText;
	}
	
	
	
}
