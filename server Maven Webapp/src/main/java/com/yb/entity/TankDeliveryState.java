package com.yb.entity;

public class TankDeliveryState {
	private Integer Tank_Delivery_State_ID;
	private String Tank_Delivery_State_Name;
private String stationId;
	
	
	public String getStationId() {
		return stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	public TankDeliveryState() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TankDeliveryState(Integer tank_Delivery_State_ID,
			String tank_Delivery_State_Name) {
		super();
		Tank_Delivery_State_ID = tank_Delivery_State_ID;
		Tank_Delivery_State_Name = tank_Delivery_State_Name;
	}
	@Override
	public String toString() {
		return "TankDeliveryState [Tank_Delivery_State_ID="
				+ Tank_Delivery_State_ID + ", Tank_Delivery_State_Name="
				+ Tank_Delivery_State_Name + "]";
	}
	public Integer getTank_Delivery_State_ID() {
		return Tank_Delivery_State_ID;
	}
	public void setTank_Delivery_State_ID(Integer tank_Delivery_State_ID) {
		Tank_Delivery_State_ID = tank_Delivery_State_ID;
	}
	public String getTank_Delivery_State_Name() {
		return Tank_Delivery_State_Name;
	}
	public void setTank_Delivery_State_Name(String tank_Delivery_State_Name) {
		Tank_Delivery_State_Name = tank_Delivery_State_Name;
	}
	
}
