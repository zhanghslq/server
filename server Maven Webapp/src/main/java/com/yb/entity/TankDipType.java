package com.yb.entity;

public class TankDipType {
	private Integer Tank_Dip_Type_ID;
	private String Tank_Dip_Type_Name;
private String stationId;
	
	
	public String getStationId() {
		return stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	public TankDipType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TankDipType(Integer tank_Dip_Type_ID, String tank_Dip_Type_Name) {
		super();
		Tank_Dip_Type_ID = tank_Dip_Type_ID;
		Tank_Dip_Type_Name = tank_Dip_Type_Name;
	}
	@Override
	public String toString() {
		return "TankDipType [Tank_Dip_Type_ID=" + Tank_Dip_Type_ID
				+ ", Tank_Dip_Type_Name=" + Tank_Dip_Type_Name + "]";
	}
	public Integer getTank_Dip_Type_ID() {
		return Tank_Dip_Type_ID;
	}
	public void setTank_Dip_Type_ID(Integer tank_Dip_Type_ID) {
		Tank_Dip_Type_ID = tank_Dip_Type_ID;
	}
	public String getTank_Dip_Type_Name() {
		return Tank_Dip_Type_Name;
	}
	public void setTank_Dip_Type_Name(String tank_Dip_Type_Name) {
		Tank_Dip_Type_Name = tank_Dip_Type_Name;
	}
	
}
