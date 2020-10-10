package com.formation.parking.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.parking.dao.ParkingAPIDAO;
import com.formation.parking.dao.entity.RecordEntity;
import com.formation.parking.dao.entity.ReponseParkingAPIEntity;
import com.formation.parking.models.Parking;
import com.formation.parking.services.ParkingService;

@Service
public class ParkigServiceImpl implements ParkingService {

	@Autowired
	public ParkingAPIDAO parkingAPIDAO;

	@Override
	public List<Parking> getListeParkings() {
		ReponseParkingAPIEntity reponse = parkingAPIDAO.getListeParking();

		return transformEntityToModel(reponse);
	}

	private List<Parking> transformEntityToModel(ReponseParkingAPIEntity reponse) {
		List<Parking> resultat = new ArrayList<Parking>();
		for (RecordEntity record : reponse.getRecords()) {
			Parking parking = new Parking();
			parking.setNom(record.getFields().getGrp_nom());
			parking.setStatut(getLibelleStatut(record));
			parking.setNbPlacesDispo(record.getFields().getGrp_disponible());
			parking.setNbPlacesTotal(record.getFields().getGrp_exploitation());
			parking.setHeureMaj(record.getFields().getGrp_horodatage());
			resultat.add(parking);
		}
		return resultat;
	}

	private String getLibelleStatut(RecordEntity record) {
		switch (record.getFields().getGrp_statut()) {
		case "1": {
			return "FERME";
		}
		case "2": {
			return "ABONNES";
		} 
		case "5": {
			return "OUVERT";
		}
		}
		return "Données non disponibles";
	}

}
