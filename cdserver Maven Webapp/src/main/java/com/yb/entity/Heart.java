package com.yb.entity;

public class Heart {
	private String station_id;
	private Integer number;
	private String message;
	public Heart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Heart(String station_id, Integer number, String message) {
		super();
		this.station_id = station_id;
		this.number = number;
		this.message = message;
	}
	@Override
	public String toString() {
		return "Heart [station_id=" + station_id + ", number=" + number
				+ ", message=" + message + "]";
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
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
