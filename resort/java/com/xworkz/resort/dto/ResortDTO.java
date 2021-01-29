package com.xworkz.resort.dto;

public class ResortDTO {

	private String location;
	private String name;
	private double pricePerHead;
	private float rating;
	private long phoneNo;
	private boolean offers;
	private String managerName;
	private int noOfEmployees;
	private boolean poolExist;
	private int noOfRooms;

	public ResortDTO() {

	}

	/**
	 * @param location
	 * @param name
	 * @param managerName
	 * @param noOfRooms
	 */
	public ResortDTO(String location, String name, String managerName, int noOfRooms) {
		super();
		this.location = location;
		this.name = name;
		this.managerName = managerName;
		this.noOfRooms = noOfRooms;
	}

	@Override
	public String toString() {
		return "ResortDTO [location=" + location + ", name=" + name + ", pricePerHead=" + pricePerHead + ", rating="
				+ rating + ", phoneNo=" + phoneNo + ", offers=" + offers + ", managerName=" + managerName
				+ ", noOfEmployees=" + noOfEmployees + ", poolExist=" + poolExist + ", noOfRooms=" + noOfRooms + "]";
	}

	public double getPricePerHead() {
		return pricePerHead;
	}

	public void setPricePerHead(double pricePerHead) {
		this.pricePerHead = pricePerHead;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public boolean isOffers() {
		return offers;
	}

	public void setOffers(boolean offers) {
		this.offers = offers;
	}

	public boolean isPoolExist() {
		return poolExist;
	}

	public void setPoolExist(boolean poolExist) {
		this.poolExist = poolExist;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public String getLocation() {
		return location;
	}

	public String getName() {
		return name;
	}

	public String getManagerName() {
		return managerName;
	}

	public int getNoOfEmployees() {
		return noOfEmployees;
	}

}
