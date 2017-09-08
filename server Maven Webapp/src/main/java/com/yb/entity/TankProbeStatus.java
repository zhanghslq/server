package com.yb.entity;

public class TankProbeStatus {
	private Integer Tank_Probe_Status_ID;
	private String Tank_Probe_Status_Name;
private String stationId;
	
	
	public String getStationId() {
		return stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	public TankProbeStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TankProbeStatus(Integer tank_Probe_Status_ID,
			String tank_Probe_Status_Name) {
		super();
		Tank_Probe_Status_ID = tank_Probe_Status_ID;
		Tank_Probe_Status_Name = tank_Probe_Status_Name;
	}
	@Override
	public String toString() {
		return "TankProbeStatus [Tank_Probe_Status_ID=" + Tank_Probe_Status_ID
				+ ", Tank_Probe_Status_Name=" + Tank_Probe_Status_Name + "]";
	}
	public Integer getTank_Probe_Status_ID() {
		return Tank_Probe_Status_ID;
	}
	public void setTank_Probe_Status_ID(Integer tank_Probe_Status_ID) {
		Tank_Probe_Status_ID = tank_Probe_Status_ID;
	}
	public String getTank_Probe_Status_Name() {
		return Tank_Probe_Status_Name;
	}
	public void setTank_Probe_Status_Name(String tank_Probe_Status_Name) {
		Tank_Probe_Status_Name = tank_Probe_Status_Name;
	}
}
