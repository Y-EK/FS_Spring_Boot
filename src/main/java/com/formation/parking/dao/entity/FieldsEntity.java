package com.formation.parking.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldsEntity {
	
	@JsonProperty(value = "idobj")
	private String idObj;
	
	@JsonProperty(value = "grp_nom")
	private String grp_nom;
	
	@JsonProperty(value = "grp_exploitation")
	private String grp_exploitation;
	
	@JsonProperty(value = "grp_disponible")
	private String grp_disponible;
	
	@JsonProperty(value = "grp_statut")
	private String grp_statut;
	
	@JsonProperty(value = "grp_horodatage")
	private String grp_horodatage;
	
	public String getIdObj() {
		return idObj;
	}

	public void setIdObj(String idObj) {
		this.idObj = idObj;
	}

	public String getGrp_nom() {
		return grp_nom;
	}

	public void setGrp_nom(String grp_nom) {
		this.grp_nom = grp_nom;
	}

	public String getGrp_exploitation() {
		return grp_exploitation;
	}

	public void setGrp_exploitation(String grp_exploitation) {
		this.grp_exploitation = grp_exploitation;
	}

	public String getGrp_disponible() {
		return grp_disponible;
	}

	public void setGrp_disponible(String grp_disponible) {
		this.grp_disponible = grp_disponible;
	}

	public String getGrp_statut() {
		return grp_statut;
	}

	public void setGrp_statut(String grp_statut) {
		this.grp_statut = grp_statut;
	}

	public String getGrp_horodatage() {
		return grp_horodatage;
	}

	public void setGrp_horodatage(String grp_horodatage) {
		this.grp_horodatage = grp_horodatage;
	}
	
	

}
