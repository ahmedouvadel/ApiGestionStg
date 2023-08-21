package com.example.demo3;

import com.example.demo3.Model.Departement;
import com.example.demo3.Model.Direction;
import com.example.demo3.Model.Service;
import com.example.demo3.Model.Stagiaire;
import com.example.demo3.Repository.DepartementRepository;
import com.example.demo3.Repository.DirectionRepository;
import com.example.demo3.Repository.ServiceRepository;
import com.example.demo3.Repository.StagiaireRepository;
import com.example.demo3.service.Interfaces.IDepartement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.UUID;

@SpringBootApplication
public class Demo3Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}

	@Autowired
	private StagiaireRepository stagiaireRepository;
	@Autowired
	private DepartementRepository departementRepository;
	@Autowired
	private ServiceRepository serviceRepository;
	@Autowired
	private DirectionRepository directionRepository;





	@Override
	public void run(String... args) throws Exception {

		/**
		 * endpoint: pour Ajouter Un Stagiaire
		 * @return


		Stagiaire stagiaire = new Stagiaire();
		stagiaire.setFirstname("Ahmedou");
		stagiaire.setLastname("Vadel");
		stagiaire.setDatedeb(LocalDate.of(2023,7,9));
		stagiaire.setDatefin(LocalDate.of(2023,8,9));
		stagiaire.setCin(Long.valueOf(9132339));
		stagiaire.setNumberphone(Long.valueOf(44223507));
		stagiaire.setNbadge(1213);

		stagiaireRepository.save(stagiaire);

		Stagiaire stagiaire1 = new Stagiaire();
		stagiaire1.setFirstname("Abdallahi");
		stagiaire1.setLastname("bouda");
		stagiaire1.setDatedeb(LocalDate.of(2023,8,11));
		stagiaire1.setDatefin(LocalDate.of(2023,9,10));
		stagiaire1.setCin(Long.valueOf(8132339));
		stagiaire1.setNumberphone(Long.valueOf(44220334));
		stagiaire1.setNbadge(1214);

		stagiaireRepository.save(stagiaire);

		/**
		 * endpoint: pour Ajouter Un Departemnt
		 * @return

		Departement departement = new Departement();
		departement.setNomdepartement("DSI");
		departement.setNomdirection("DTI");

		departementRepository.save(departement);

		/**
		 * endpoint: pour Ajouter Un Service
		 * @return


		Service service = new Service();
		service.setNomservice("Genie Logiciel");
		service.setNomdepartement("DSI");

		serviceRepository.save(service);

		/**Service service1 = new Service();
		service1.setNomservice("Reseau Informatique");
		service1.setNomdepartement("DSI");

		serviceRepository.save(service);

		Service service2 = new Service();
		service2.setNomservice("Serv Nettoyage");
		service2.setNomdepartement("D610");

		serviceRepository.save(service); */

		/**
		 * endpoint: pour Ajouter Un Direction
		 * @return

		Direction direction = new Direction();
		direction.setNomdirection("DAL");

		directionRepository.save(direction);

		*/




	}

}
