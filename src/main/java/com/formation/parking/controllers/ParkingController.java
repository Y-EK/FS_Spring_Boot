package com.formation.parking.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.parking.models.Parking;

@RestController
public class ParkingController {
	
	@RequestMapping(path = "/api/parkings", method = RequestMethod.GET)
	public List<Parking> getListeParkings(){
		Parking parkingTest = new Parking();
		parkingTest.setNom("Parking test");
		parkingTest.setNbPlacesDispo(100);
		parkingTest.setNbPlacesTotal(200);
		parkingTest.setStatut("FERME");
		parkingTest.setHeureMaj("11h05");
		ArrayList<Parking> liste = new ArrayList<Parking>();
		liste.add(parkingTest);
		return liste;
	}

}
