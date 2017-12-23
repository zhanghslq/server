package com.yb.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Tanks {
	private Integer Tank_ID;
	private Integer Grade_ID;
	private String Tank_Name;
	private Integer Tank_Number;
	private String Tank_Description;
	private String Physical_Label;
	private BigDecimal Capacity;
	private BigDecimal Gauge_Level;
	private BigDecimal Temperature;
	private BigDecimal Gauge_TC_Volume;
	private BigDecimal Water_Level;
	private BigDecimal Dip_Level;
	private BigDecimal Gauge_Volume;
	private BigDecimal Theoretical_Volume;
	private BigDecimal Dip_Volume;
	private BigDecimal Average_Cost;
	private Integer Strapped_Tank_ID;
	private Integer Probe_Number;
	private BigDecimal Ullage;
	private BigDecimal Water_Volume;
	private String Gauge_alarms;
	private Integer Tank_Type;
	private BigDecimal Diameter;
	private BigDecimal Low_Volume_Warning;
	private BigDecimal Low_Volume_Alarm;
	private BigDecimal Hi_Volume_Warning;
	private BigDecimal Hi_Volume_Alarm;
	private BigDecimal Hi_Water_Alarm;
	private BigDecimal Density;
	private Integer Tank_Gauge_ID;
	private Integer Tank_Type_ID;
	private Integer Tank_Connection_Type_ID;
	private Integer Tank_Probe_Status_ID;
	private Date Tank_Readings_DT;
	private Integer Tank_Delivery_State_ID;
	private Integer Pump_Delivery_State;
	private BigDecimal Hi_Temperature;
	private BigDecimal Low_Temperature;
	private BigDecimal Loss_Tolerance_Vol;
	private BigDecimal Gain_Tolerance_Vol;
	private Integer Deleted;
	private Boolean Auto_Disable;
	private Boolean Is_Enabled;
private String stationId;
	
	public String getStationId() {
		return stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	public Tanks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tanks(Integer tank_ID, Integer grade_ID, String tank_Name,
			Integer tank_Number, String tank_Description,
			String physical_Label, BigDecimal capacity, BigDecimal gauge_Level,
			BigDecimal temperature, BigDecimal gauge_TC_Volume,
			BigDecimal water_Level, BigDecimal dip_Level,
			BigDecimal gauge_Volume, BigDecimal theoretical_Volume,
			BigDecimal dip_Volume, BigDecimal average_Cost,
			Integer strapped_Tank_ID, Integer probe_Number, BigDecimal ullage,
			BigDecimal water_Volume, String gauge_alarms, Integer tank_Type,
			BigDecimal diameter, BigDecimal low_Volume_Warning,
			BigDecimal low_Volume_Alarm, BigDecimal hi_Volume_Warning,
			BigDecimal hi_Volume_Alarm, BigDecimal hi_Water_Alarm,
			BigDecimal density, Integer tank_Gauge_ID, Integer tank_Type_ID,
			Integer tank_Connection_Type_ID, Integer tank_Probe_Status_ID,
			Date tank_Readings_DT, Integer tank_Delivery_State_ID,
			Integer pump_Delivery_State, BigDecimal hi_Temperature,
			BigDecimal low_Temperature, BigDecimal loss_Tolerance_Vol,
			BigDecimal gain_Tolerance_Vol, Integer deleted,
			Boolean auto_Disable, Boolean is_Enabled) {
		super();
		Tank_ID = tank_ID;
		Grade_ID = grade_ID;
		Tank_Name = tank_Name;
		Tank_Number = tank_Number;
		Tank_Description = tank_Description;
		Physical_Label = physical_Label;
		Capacity = capacity;
		Gauge_Level = gauge_Level;
		Temperature = temperature;
		Gauge_TC_Volume = gauge_TC_Volume;
		Water_Level = water_Level;
		Dip_Level = dip_Level;
		Gauge_Volume = gauge_Volume;
		Theoretical_Volume = theoretical_Volume;
		Dip_Volume = dip_Volume;
		Average_Cost = average_Cost;
		Strapped_Tank_ID = strapped_Tank_ID;
		Probe_Number = probe_Number;
		Ullage = ullage;
		Water_Volume = water_Volume;
		Gauge_alarms = gauge_alarms;
		Tank_Type = tank_Type;
		Diameter = diameter;
		Low_Volume_Warning = low_Volume_Warning;
		Low_Volume_Alarm = low_Volume_Alarm;
		Hi_Volume_Warning = hi_Volume_Warning;
		Hi_Volume_Alarm = hi_Volume_Alarm;
		Hi_Water_Alarm = hi_Water_Alarm;
		Density = density;
		Tank_Gauge_ID = tank_Gauge_ID;
		Tank_Type_ID = tank_Type_ID;
		Tank_Connection_Type_ID = tank_Connection_Type_ID;
		Tank_Probe_Status_ID = tank_Probe_Status_ID;
		Tank_Readings_DT = tank_Readings_DT;
		Tank_Delivery_State_ID = tank_Delivery_State_ID;
		Pump_Delivery_State = pump_Delivery_State;
		Hi_Temperature = hi_Temperature;
		Low_Temperature = low_Temperature;
		Loss_Tolerance_Vol = loss_Tolerance_Vol;
		Gain_Tolerance_Vol = gain_Tolerance_Vol;
		Deleted = deleted;
		Auto_Disable = auto_Disable;
		Is_Enabled = is_Enabled;
	}
	@Override
	public String toString() {
		return "Tanks [Tank_ID=" + Tank_ID + ", Grade_ID=" + Grade_ID
				+ ", Tank_Name=" + Tank_Name + ", Tank_Number=" + Tank_Number
				+ ", Tank_Description=" + Tank_Description
				+ ", Physical_Label=" + Physical_Label + ", Capacity="
				+ Capacity + ", Gauge_Level=" + Gauge_Level + ", Temperature="
				+ Temperature + ", Gauge_TC_Volume=" + Gauge_TC_Volume
				+ ", Water_Level=" + Water_Level + ", Dip_Level=" + Dip_Level
				+ ", Gauge_Volume=" + Gauge_Volume + ", Theoretical_Volume="
				+ Theoretical_Volume + ", Dip_Volume=" + Dip_Volume
				+ ", Average_Cost=" + Average_Cost + ", Strapped_Tank_ID="
				+ Strapped_Tank_ID + ", Probe_Number=" + Probe_Number
				+ ", Ullage=" + Ullage + ", Water_Volume=" + Water_Volume
				+ ", Gauge_alarms=" + Gauge_alarms + ", Tank_Type=" + Tank_Type
				+ ", Diameter=" + Diameter + ", Low_Volume_Warning="
				+ Low_Volume_Warning + ", Low_Volume_Alarm=" + Low_Volume_Alarm
				+ ", Hi_Volume_Warning=" + Hi_Volume_Warning
				+ ", Hi_Volume_Alarm=" + Hi_Volume_Alarm + ", Hi_Water_Alarm="
				+ Hi_Water_Alarm + ", Density=" + Density + ", Tank_Gauge_ID="
				+ Tank_Gauge_ID + ", Tank_Type_ID=" + Tank_Type_ID
				+ ", Tank_Connection_Type_ID=" + Tank_Connection_Type_ID
				+ ", Tank_Probe_Status_ID=" + Tank_Probe_Status_ID
				+ ", Tank_Readings_DT=" + Tank_Readings_DT
				+ ", Tank_Delivery_State_ID=" + Tank_Delivery_State_ID
				+ ", Pump_Delivery_State=" + Pump_Delivery_State
				+ ", Hi_Temperature=" + Hi_Temperature + ", Low_Temperature="
				+ Low_Temperature + ", Loss_Tolerance_Vol="
				+ Loss_Tolerance_Vol + ", Gain_Tolerance_Vol="
				+ Gain_Tolerance_Vol + ", Deleted=" + Deleted
				+ ", Auto_Disable=" + Auto_Disable + ", Is_Enabled="
				+ Is_Enabled + "]";
	}
	public Integer getTank_ID() {
		return Tank_ID;
	}
	public void setTank_ID(Integer tank_ID) {
		Tank_ID = tank_ID;
	}
	public Integer getGrade_ID() {
		return Grade_ID;
	}
	public void setGrade_ID(Integer grade_ID) {
		Grade_ID = grade_ID;
	}
	public String getTank_Name() {
		return Tank_Name;
	}
	public void setTank_Name(String tank_Name) {
		Tank_Name = tank_Name;
	}
	public Integer getTank_Number() {
		return Tank_Number;
	}
	public void setTank_Number(Integer tank_Number) {
		Tank_Number = tank_Number;
	}
	public String getTank_Description() {
		return Tank_Description;
	}
	public void setTank_Description(String tank_Description) {
		Tank_Description = tank_Description;
	}
	public String getPhysical_Label() {
		return Physical_Label;
	}
	public void setPhysical_Label(String physical_Label) {
		Physical_Label = physical_Label;
	}
	public BigDecimal getCapacity() {
		return Capacity;
	}
	public void setCapacity(BigDecimal capacity) {
		Capacity = capacity;
	}
	public BigDecimal getGauge_Level() {
		return Gauge_Level;
	}
	public void setGauge_Level(BigDecimal gauge_Level) {
		Gauge_Level = gauge_Level;
	}
	public BigDecimal getTemperature() {
		return Temperature;
	}
	public void setTemperature(BigDecimal temperature) {
		Temperature = temperature;
	}
	public BigDecimal getGauge_TC_Volume() {
		return Gauge_TC_Volume;
	}
	public void setGauge_TC_Volume(BigDecimal gauge_TC_Volume) {
		Gauge_TC_Volume = gauge_TC_Volume;
	}
	public BigDecimal getWater_Level() {
		return Water_Level;
	}
	public void setWater_Level(BigDecimal water_Level) {
		Water_Level = water_Level;
	}
	public BigDecimal getDip_Level() {
		return Dip_Level;
	}
	public void setDip_Level(BigDecimal dip_Level) {
		Dip_Level = dip_Level;
	}
	public BigDecimal getGauge_Volume() {
		return Gauge_Volume;
	}
	public void setGauge_Volume(BigDecimal gauge_Volume) {
		Gauge_Volume = gauge_Volume;
	}
	public BigDecimal getTheoretical_Volume() {
		return Theoretical_Volume;
	}
	public void setTheoretical_Volume(BigDecimal theoretical_Volume) {
		Theoretical_Volume = theoretical_Volume;
	}
	public BigDecimal getDip_Volume() {
		return Dip_Volume;
	}
	public void setDip_Volume(BigDecimal dip_Volume) {
		Dip_Volume = dip_Volume;
	}
	public BigDecimal getAverage_Cost() {
		return Average_Cost;
	}
	public void setAverage_Cost(BigDecimal average_Cost) {
		Average_Cost = average_Cost;
	}
	public Integer getStrapped_Tank_ID() {
		return Strapped_Tank_ID;
	}
	public void setStrapped_Tank_ID(Integer strapped_Tank_ID) {
		Strapped_Tank_ID = strapped_Tank_ID;
	}
	public Integer getProbe_Number() {
		return Probe_Number;
	}
	public void setProbe_Number(Integer probe_Number) {
		Probe_Number = probe_Number;
	}
	public BigDecimal getUllage() {
		return Ullage;
	}
	public void setUllage(BigDecimal ullage) {
		Ullage = ullage;
	}
	public BigDecimal getWater_Volume() {
		return Water_Volume;
	}
	public void setWater_Volume(BigDecimal water_Volume) {
		Water_Volume = water_Volume;
	}
	public String getGauge_alarms() {
		return Gauge_alarms;
	}
	public void setGauge_alarms(String gauge_alarms) {
		Gauge_alarms = gauge_alarms;
	}
	public Integer getTank_Type() {
		return Tank_Type;
	}
	public void setTank_Type(Integer tank_Type) {
		Tank_Type = tank_Type;
	}
	public BigDecimal getDiameter() {
		return Diameter;
	}
	public void setDiameter(BigDecimal diameter) {
		Diameter = diameter;
	}
	public BigDecimal getLow_Volume_Warning() {
		return Low_Volume_Warning;
	}
	public void setLow_Volume_Warning(BigDecimal low_Volume_Warning) {
		Low_Volume_Warning = low_Volume_Warning;
	}
	public BigDecimal getLow_Volume_Alarm() {
		return Low_Volume_Alarm;
	}
	public void setLow_Volume_Alarm(BigDecimal low_Volume_Alarm) {
		Low_Volume_Alarm = low_Volume_Alarm;
	}
	public BigDecimal getHi_Volume_Warning() {
		return Hi_Volume_Warning;
	}
	public void setHi_Volume_Warning(BigDecimal hi_Volume_Warning) {
		Hi_Volume_Warning = hi_Volume_Warning;
	}
	public BigDecimal getHi_Volume_Alarm() {
		return Hi_Volume_Alarm;
	}
	public void setHi_Volume_Alarm(BigDecimal hi_Volume_Alarm) {
		Hi_Volume_Alarm = hi_Volume_Alarm;
	}
	public BigDecimal getHi_Water_Alarm() {
		return Hi_Water_Alarm;
	}
	public void setHi_Water_Alarm(BigDecimal hi_Water_Alarm) {
		Hi_Water_Alarm = hi_Water_Alarm;
	}
	public BigDecimal getDensity() {
		return Density;
	}
	public void setDensity(BigDecimal density) {
		Density = density;
	}
	public Integer getTank_Gauge_ID() {
		return Tank_Gauge_ID;
	}
	public void setTank_Gauge_ID(Integer tank_Gauge_ID) {
		Tank_Gauge_ID = tank_Gauge_ID;
	}
	public Integer getTank_Type_ID() {
		return Tank_Type_ID;
	}
	public void setTank_Type_ID(Integer tank_Type_ID) {
		Tank_Type_ID = tank_Type_ID;
	}
	public Integer getTank_Connection_Type_ID() {
		return Tank_Connection_Type_ID;
	}
	public void setTank_Connection_Type_ID(Integer tank_Connection_Type_ID) {
		Tank_Connection_Type_ID = tank_Connection_Type_ID;
	}
	public Integer getTank_Probe_Status_ID() {
		return Tank_Probe_Status_ID;
	}
	public void setTank_Probe_Status_ID(Integer tank_Probe_Status_ID) {
		Tank_Probe_Status_ID = tank_Probe_Status_ID;
	}
	public Date getTank_Readings_DT() {
		return Tank_Readings_DT;
	}
	public void setTank_Readings_DT(Date tank_Readings_DT) {
		Tank_Readings_DT = tank_Readings_DT;
	}
	public Integer getTank_Delivery_State_ID() {
		return Tank_Delivery_State_ID;
	}
	public void setTank_Delivery_State_ID(Integer tank_Delivery_State_ID) {
		Tank_Delivery_State_ID = tank_Delivery_State_ID;
	}
	public Integer getPump_Delivery_State() {
		return Pump_Delivery_State;
	}
	public void setPump_Delivery_State(Integer pump_Delivery_State) {
		Pump_Delivery_State = pump_Delivery_State;
	}
	public BigDecimal getHi_Temperature() {
		return Hi_Temperature;
	}
	public void setHi_Temperature(BigDecimal hi_Temperature) {
		Hi_Temperature = hi_Temperature;
	}
	public BigDecimal getLow_Temperature() {
		return Low_Temperature;
	}
	public void setLow_Temperature(BigDecimal low_Temperature) {
		Low_Temperature = low_Temperature;
	}
	public BigDecimal getLoss_Tolerance_Vol() {
		return Loss_Tolerance_Vol;
	}
	public void setLoss_Tolerance_Vol(BigDecimal loss_Tolerance_Vol) {
		Loss_Tolerance_Vol = loss_Tolerance_Vol;
	}
	public BigDecimal getGain_Tolerance_Vol() {
		return Gain_Tolerance_Vol;
	}
	public void setGain_Tolerance_Vol(BigDecimal gain_Tolerance_Vol) {
		Gain_Tolerance_Vol = gain_Tolerance_Vol;
	}
	public Integer getDeleted() {
		return Deleted;
	}
	public void setDeleted(Integer deleted) {
		Deleted = deleted;
	}
	public Boolean getAuto_Disable() {
		return Auto_Disable;
	}
	public void setAuto_Disable(Boolean auto_Disable) {
		Auto_Disable = auto_Disable;
	}
	public Boolean getIs_Enabled() {
		return Is_Enabled;
	}
	public void setIs_Enabled(Boolean is_Enabled) {
		Is_Enabled = is_Enabled;
	}
	
}
