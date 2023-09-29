package com.example.demo.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor

@DiscriminatorValue("ens")
public class EnseignantChercheur extends Membre implements Serializable {

	@NonNull
	private String grade;
	@NonNull
	private String etablissement;
	
	@OneToMany(mappedBy ="encadrant")
	Collection<Etudiant> listEtudiant;
	
	@Builder
	public EnseignantChercheur( String cin,  String nom,  String prenom,
			 Date dateNaissance,  String cv,  String email,  String password,
			 String grade,  String etablissement) {
		super(cin, nom, prenom, dateNaissance, cv, email, password);
		this.grade = grade;
		this.etablissement = etablissement;
	}
	
	
}
