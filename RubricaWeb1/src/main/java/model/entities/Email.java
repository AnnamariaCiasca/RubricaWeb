package model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emails")
public class Email {
	
	@Id //l'id non è autogenerato ed è una chiave primaria
	@Column(name = "email", nullable = false, length = 50) 
	private String email;
	@ManyToOne()
	@JoinColumn(name = "id_contact", referencedColumnName="id")   //colonna di Join, sto usando il nome della colonna sul database
	
	
	private Contact contact;

	
//	@Enumerated(EnumType.STRING)
	//private EmailType type;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Contact getContact() {
		return contact;
	}
	
	/* public EmailType getType() {
		return type;
	}
	public void setType(EmailType type) {
		this.type = type;
	} */
	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
