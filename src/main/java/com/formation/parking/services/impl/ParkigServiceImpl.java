package com.formation.parking.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.formation.parking.models.Parking;
import com.formation.parking.services.ParkingService;

@Service
public class ParkigServiceImpl implements ParkingService {

	@Override
	public List<Parking> getListeParkings() {
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
