/**
 * @author muratbrm
 * Diese Klasse bildet eine Tabelle in MySQL ab
 */

package de.bs14.bestellprozess.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//mit der @Entity Annotation, wird die Customer Klasse zu einer DB-Tabelle.
@Entity
public class Orders {
	//@Id steht für Primary Key
	@Id
	//@GeneratedValue bestimmt man ob z.B der Primary Key auto_increment sein soll. 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orders_id;
	private Date deliverDate;
	
	public Orders(Integer order_id, Date deliverDate) {
		this.orders_id = order_id;
		this.deliverDate = deliverDate;
	}
	
	public Orders() {}
	
	public Integer getOrder_id() {
		return orders_id;
	}
	public void setOrder_id(Integer order_id) {
		this.orders_id = order_id;
	}
	public Date getDeliverDate() {
		return deliverDate;
	}
	public void setDeliverDate(Date deliverDate) {
		this.deliverDate = deliverDate;
	}
	
}
