package com.yb.entity;

import java.math.BigDecimal;

public class Pumps {
	private Integer Pump_ID;
	private Integer Pump_Type_ID;
	private Integer Pump_Display_ID;
	private Integer Attendant_ID;
	private Integer Pump_Profile_ID;
	private Integer Loop_ID;
	private String Pump_Name;
	private String Pump_Description;
	private Integer  Logical_Number;
	private Integer  Polling_Address;
	private String Serial_Number;
	private String Pump_History;
	private Integer Price_1_Level;
	private Integer Price_2_Level;
	private Integer Reserved_by;
	private Integer Reserve_State;
	private Integer auth_limit_type;
	private Integer auth_hose_mask;
	private BigDecimal auth_limit;
	private Integer auth_level;
	private Integer Price_Multiplier;
	private Integer Value_Multiplier;
	private Integer Deleted;
	private Integer Tag_Reader_Installed;
	private String  station_id;
	public Pumps() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pumps(Integer pump_ID, Integer pump_Type_ID,
			Integer pump_Display_ID, Integer attendant_ID,
			Integer pump_Profile_ID, Integer loop_ID, String pump_Name,
			String pump_Description, Integer logical_Number,
			Integer polling_Address, String serial_Number, String pump_History,
			Integer price_1_Level, Integer price_2_Level, Integer reserved_by,
			Integer reserve_State, Integer auth_limit_type,
			Integer auth_hose_mask, BigDecimal auth_limit, Integer auth_level,
			Integer price_Multiplier, Integer value_Multiplier,
			Integer deleted, Integer tag_Reader_Installed, String station_id) {
		super();
		Pump_ID = pump_ID;
		Pump_Type_ID = pump_Type_ID;
		Pump_Display_ID = pump_Display_ID;
		Attendant_ID = attendant_ID;
		Pump_Profile_ID = pump_Profile_ID;
		Loop_ID = loop_ID;
		Pump_Name = pump_Name;
		Pump_Description = pump_Description;
		Logical_Number = logical_Number;
		Polling_Address = polling_Address;
		Serial_Number = serial_Number;
		Pump_History = pump_History;
		Price_1_Level = price_1_Level;
		Price_2_Level = price_2_Level;
		Reserved_by = reserved_by;
		Reserve_State = reserve_State;
		this.auth_limit_type = auth_limit_type;
		this.auth_hose_mask = auth_hose_mask;
		this.auth_limit = auth_limit;
		this.auth_level = auth_level;
		Price_Multiplier = price_Multiplier;
		Value_Multiplier = value_Multiplier;
		Deleted = deleted;
		Tag_Reader_Installed = tag_Reader_Installed;
		this.station_id = station_id;
	}
	@Override
	public String toString() {
		return "Pumps [Pump_ID=" + Pump_ID + ", Pump_Type_ID=" + Pump_Type_ID
				+ ", Pump_Display_ID=" + Pump_Display_ID + ", Attendant_ID="
				+ Attendant_ID + ", Pump_Profile_ID=" + Pump_Profile_ID
				+ ", Loop_ID=" + Loop_ID + ", Pump_Name=" + Pump_Name
				+ ", Pump_Description=" + Pump_Description
				+ ", Logical_Number=" + Logical_Number + ", Polling_Address="
				+ Polling_Address + ", Serial_Number=" + Serial_Number
				+ ", Pump_History=" + Pump_History + ", Price_1_Level="
				+ Price_1_Level + ", Price_2_Level=" + Price_2_Level
				+ ", Reserved_by=" + Reserved_by + ", Reserve_State="
				+ Reserve_State + ", auth_limit_type=" + auth_limit_type
				+ ", auth_hose_mask=" + auth_hose_mask + ", auth_limit="
				+ auth_limit + ", auth_level=" + auth_level
				+ ", Price_Multiplier=" + Price_Multiplier
				+ ", Value_Multiplier=" + Value_Multiplier + ", Deleted="
				+ Deleted + ", Tag_Reader_Installed=" + Tag_Reader_Installed
				+ ", station_id=" + station_id + "]";
	}
	public Integer getPump_ID() {
		return Pump_ID;
	}
	public void setPump_ID(Integer pump_ID) {
		Pump_ID = pump_ID;
	}
	public Integer getPump_Type_ID() {
		return Pump_Type_ID;
	}
	public void setPump_Type_ID(Integer pump_Type_ID) {
		Pump_Type_ID = pump_Type_ID;
	}
	public Integer getPump_Display_ID() {
		return Pump_Display_ID;
	}
	public void setPump_Display_ID(Integer pump_Display_ID) {
		Pump_Display_ID = pump_Display_ID;
	}
	public Integer getAttendant_ID() {
		return Attendant_ID;
	}
	public void setAttendant_ID(Integer attendant_ID) {
		Attendant_ID = attendant_ID;
	}
	public Integer getPump_Profile_ID() {
		return Pump_Profile_ID;
	}
	public void setPump_Profile_ID(Integer pump_Profile_ID) {
		Pump_Profile_ID = pump_Profile_ID;
	}
	public Integer getLoop_ID() {
		return Loop_ID;
	}
	public void setLoop_ID(Integer loop_ID) {
		Loop_ID = loop_ID;
	}
	public String getPump_Name() {
		return Pump_Name;
	}
	public void setPump_Name(String pump_Name) {
		Pump_Name = pump_Name;
	}
	public String getPump_Description() {
		return Pump_Description;
	}
	public void setPump_Description(String pump_Description) {
		Pump_Description = pump_Description;
	}
	public Integer getLogical_Number() {
		return Logical_Number;
	}
	public void setLogical_Number(Integer logical_Number) {
		Logical_Number = logical_Number;
	}
	public Integer getPolling_Address() {
		return Polling_Address;
	}
	public void setPolling_Address(Integer polling_Address) {
		Polling_Address = polling_Address;
	}
	public String getSerial_Number() {
		return Serial_Number;
	}
	public void setSerial_Number(String serial_Number) {
		Serial_Number = serial_Number;
	}
	public String getPump_History() {
		return Pump_History;
	}
	public void setPump_History(String pump_History) {
		Pump_History = pump_History;
	}
	public Integer getPrice_1_Level() {
		return Price_1_Level;
	}
	public void setPrice_1_Level(Integer price_1_Level) {
		Price_1_Level = price_1_Level;
	}
	public Integer getPrice_2_Level() {
		return Price_2_Level;
	}
	public void setPrice_2_Level(Integer price_2_Level) {
		Price_2_Level = price_2_Level;
	}
	public Integer getReserved_by() {
		return Reserved_by;
	}
	public void setReserved_by(Integer reserved_by) {
		Reserved_by = reserved_by;
	}
	public Integer getReserve_State() {
		return Reserve_State;
	}
	public void setReserve_State(Integer reserve_State) {
		Reserve_State = reserve_State;
	}
	public Integer getAuth_limit_type() {
		return auth_limit_type;
	}
	public void setAuth_limit_type(Integer auth_limit_type) {
		this.auth_limit_type = auth_limit_type;
	}
	public Integer getAuth_hose_mask() {
		return auth_hose_mask;
	}
	public void setAuth_hose_mask(Integer auth_hose_mask) {
		this.auth_hose_mask = auth_hose_mask;
	}
	public BigDecimal getAuth_limit() {
		return auth_limit;
	}
	public void setAuth_limit(BigDecimal auth_limit) {
		this.auth_limit = auth_limit;
	}
	public Integer getAuth_level() {
		return auth_level;
	}
	public void setAuth_level(Integer auth_level) {
		this.auth_level = auth_level;
	}
	public Integer getPrice_Multiplier() {
		return Price_Multiplier;
	}
	public void setPrice_Multiplier(Integer price_Multiplier) {
		Price_Multiplier = price_Multiplier;
	}
	public Integer getValue_Multiplier() {
		return Value_Multiplier;
	}
	public void setValue_Multiplier(Integer value_Multiplier) {
		Value_Multiplier = value_Multiplier;
	}
	public Integer getDeleted() {
		return Deleted;
	}
	public void setDeleted(Integer deleted) {
		Deleted = deleted;
	}
	public Integer getTag_Reader_Installed() {
		return Tag_Reader_Installed;
	}
	public void setTag_Reader_Installed(Integer tag_Reader_Installed) {
		Tag_Reader_Installed = tag_Reader_Installed;
	}
	public String getStation_id() {
		return station_id;
	}
	public void setStation_id(String station_id) {
		this.station_id = station_id;
	}
	
}
