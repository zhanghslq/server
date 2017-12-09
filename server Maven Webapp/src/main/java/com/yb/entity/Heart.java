package com.yb.entity;

public class Heart {
	private String station_id;
	private Integer number;
	public Heart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Heart(String station_id, Integer number) {
		super();
		this.station_id = station_id;
		this.number = number;
	}
	@Override
	public String toString() {
		return "Heart [station_id=" + station_id + ", number=" + number + "]";
	}
	public String getStation_id() {
		return station_id;
	}
	public void setStation_id(String station_id) {
		this.station_id = station_id;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	
}
