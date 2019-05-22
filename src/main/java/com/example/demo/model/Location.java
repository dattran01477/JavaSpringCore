package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the locations database table.
 * 
 */
@Entity
@Table(name="locations")
@NamedQuery(name="Location.findAll", query="SELECT l FROM Location l")
public class Location implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private double locationx;

	private double locationy;

	private String province;

	//bi-directional many-to-one association to Farm
	@OneToMany(mappedBy="location")
	private List<Farm> farms;

	public Location() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLocationx() {
		return this.locationx;
	}

	public void setLocationx(double locationx) {
		this.locationx = locationx;
	}

	public double getLocationy() {
		return this.locationy;
	}

	public void setLocationy(double locationy) {
		this.locationy = locationy;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public List<Farm> getFarms() {
		return this.farms;
	}

	public void setFarms(List<Farm> farms) {
		this.farms = farms;
	}

	public Farm addFarm(Farm farm) {
		getFarms().add(farm);
		farm.setLocation(this);

		return farm;
	}

	public Farm removeFarm(Farm farm) {
		getFarms().remove(farm);
		farm.setLocation(null);

		return farm;
	}

}