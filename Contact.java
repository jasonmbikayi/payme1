package com.payme.payme.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*l'annotation Entity (pour la version de java 15,17,20 on utilise java jakarta sinon javax pour les version anterieure a java8) une entité
 * permet de mapper la classe d'entité(=classe Contact) et ses attributs(champs=colonnes) à la table (payme_db.contact) dans la DB 
 * la classe Contact.java est une classe entité, pas besoin d'ecrire le nom du schema, spring boot va chercher son nom
 * dans l'application.properties.
* l'annotation @id veut dire que la column à la quelle elle s'applique contient la clé primaire
* l'annotation  @column doit correspondre au  nom exact dans la colonne dans la db
* l'annotation @GeneratedValue sert à génerer automatiquement la valeur du champ ID
* */
@Entity
@Table(name = "contact")
public class Contact {	
			
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "StudID", nullable = false, updatable = true, insertable = true)
	private int studid;
	
	@Column(name = "StudFirstName", nullable = false, updatable = true, insertable = true)
    private String studFirstname;
    
	@Column(name = "StudLastName", nullable = false, updatable = true, insertable = true)
	private String studLastName;
    
	@Column(name = "EmailId", nullable = false, updatable = true, insertable = true)
	private String emailId ;
	
	@Column(name = "Phone", nullable = false, updatable = true, insertable = true)
	private String phone ;

	//Le setter est une methode qui permet d'initialiser la variable afin de recevoir une valeur
	//le getter permet de retouner la valeur qui a été stoquée dans une variable
	//Alors que le contructor nous permet d'initialiser à la fois et obligatoire toutes les variables d'une classe

	
	
	
	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getStudFirstname() {
		return studFirstname;
	}

	public void setStudFirstname(String studFirstname) {
		this.studFirstname = studFirstname;
	}

	public String getStudLastName() {
		return studLastName;
	}

	public void setStudLastName(String studLastName) {
		this.studLastName = studLastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Contact [studid=" + studid + ", studFirstname=" + studFirstname + ", studLastName=" + studLastName
				+ ", emailId=" + emailId + ", phone=" + phone + "]";
	}
	
	
	
	
	
}

