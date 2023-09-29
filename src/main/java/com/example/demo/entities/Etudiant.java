package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor

@DiscriminatorValue("etd")
public class Etudiant extends Membre implements Serializable {
	
	@NonNull @Temporal(TemporalType.DATE)
	private Date dateInscription;
	@NonNull
	private String diplome;
	@NonNull
	private String sujet;
	
	@ManyToOne
	EnseignantChercheur encadrant;
	
	@Builder
	public Etudiant(String cin,  String nom,  String prenom,  Date dateNaissance,
			 String cv,  String email,  String password,  Date dateInscription,
			 String diplome,  String sujet, EnseignantChercheur encadrant) {
		super(cin, nom, prenom, dateNaissance, cv, email, password);
		this.dateInscription = dateInscription;
		this.diplome = diplome;
		this.sujet = sujet;
		this.encadrant= encadrant;
	}
	
	

	
	
}
