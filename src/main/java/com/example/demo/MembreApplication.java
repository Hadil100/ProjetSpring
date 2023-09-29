package com.example.demo;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.EnseignantChercheurRepository;
import com.example.demo.dao.EtudiantRepository;
import com.example.demo.dao.MembreRepository;
import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;

import lombok.AllArgsConstructor;

@SpringBootApplication
@AllArgsConstructor
public class MembreApplication implements CommandLineRunner {
	
	MembreRepository membrerepository;
	EtudiantRepository etudiantrepository;
	EnseignantChercheurRepository enseignantchercheurrepository;

	public static void main(String[] args) {
		SpringApplication.run(MembreApplication.class, args);}
		
	

		

		@Override
		public void run(java.lang.String... args) throws Exception {
			Etudiant etd1=Etudiant.builder()
					.cin("123456")
					.dateInscription(new Date())
					.dateNaissance(new Date())
					.diplome("mastère")
					.email("etd1@gmail.com")
					.password("pass1")
					.encadrant(null)
					.cv("cv1")
					.nom("abid")
					.prenom("youssef)")
					.sujet("blockhain")
					.build();
					
					Etudiant etd2=Etudiant.builder()
							.cin("12345786")
							.dateInscription(new Date())
							.dateNaissance(new Date())
							.diplome("mastère")
							.email("etd2@gmail.com")
							.password("pass2")
							.encadrant(null)
							.cv("cv2")
							.nom("ali")
							.prenom("anis)")
							.sujet("blockhain")
							.build();
					
					
					EnseignantChercheur enseignant=EnseignantChercheur.builder()
							.cin("014246")
							.nom("ben ali")
							.prenom("Mohamed")
							.dateNaissance(new Date())
							.cv("cvEnseignant")
							.email("enseignant.com")
							.password("123")
							.grade("grade 1")
							.etablissement("etab 1")
							.build();
							
							EnseignantChercheur enseignant1=EnseignantChercheur.builder()
							.cin("54585")
							.nom("ben salah")
							.prenom("Ahmed")
							.dateNaissance(new Date())
							.cv("cvEnseignant1")
							.email("enseignant1.com")
							.password("1234")
							.grade("grade 2")
							.etablissement("etab 2")
							.build();
							membrerepository.save(etd1);
							membrerepository.save(etd2);
							membrerepository.save(enseignant);
							membrerepository.save(enseignant1);
							
							membrerepository.findAll();
							membrerepository.findById(2L);
							membrerepository.delete(etd2);
							etd1.setCv("mon cv");
							membrerepository.save(etd1);
							
		}
				
	
	

}
