package com.yb.dict.entity;

import java.math.BigDecimal;

public class Attendant {
	private Integer attendant_ID;
	private String attendant_Name;
	private String attendant_Logon_ID;
	private Integer attendant_Number;
	private String attendant_Password;
	private Integer  attendant_Disabled;
	private Integer attendant_Blocked_Reason;
	private BigDecimal warning_Level;
	private BigDecimal alarm_Level;
	private Integer deleted;
	private Integer attendant_Tag_ID;
	private Boolean attendant_Tag_Active;
	private Integer safedrop_Alert_Level;
	public Attendant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Attendant(Integer attendant_ID, String attendant_Name,
			String attendant_Logon_ID, Integer attendant_Number,
			String attendant_Password, Integer attendant_Disabled,
			Integer attendant_Blocked_Reason, BigDecimal warning_Level,
			BigDecimal alarm_Level, Integer deleted, Integer attendant_Tag_ID,
			Boolean attendant_Tag_Active, Integer safedrop_Alert_Level) {
		super();
		this.attendant_ID = attendant_ID;
		this.attendant_Name = attendant_Name;
		this.attendant_Logon_ID = attendant_Logon_ID;
		this.attendant_Number = attendant_Number;
		this.attendant_Password = attendant_Password;
		this.attendant_Disabled = attendant_Disabled;
		this.attendant_Blocked_Reason = attendant_Blocked_Reason;
		this.warning_Level = warning_Level;
		this.alarm_Level = alarm_Level;
		this.deleted = deleted;
		this.attendant_Tag_ID = attendant_Tag_ID;
		this.attendant_Tag_Active = attendant_Tag_Active;
		this.safedrop_Alert_Level = safedrop_Alert_Level;
	}
	@Override
	public String toString() {
		return "Attendant [attendant_ID=" + attendant_ID + ", attendant_Name="
				+ attendant_Name + ", attendant_Logon_ID=" + attendant_Logon_ID
				+ ", attendant_Number=" + attendant_Number
				+ ", attendant_Password=" + attendant_Password
				+ ", attendant_Disabled=" + attendant_Disabled
				+ ", attendant_Blocked_Reason=" + attendant_Blocked_Reason
				+ ", warning_Level=" + warning_Level + ", alarm_Level="
				+ alarm_Level + ", deleted=" + deleted + ", attendant_Tag_ID="
				+ attendant_Tag_ID + ", attendant_Tag_Active="
				+ attendant_Tag_Active + ", safedrop_Alert_Level="
				+ safedrop_Alert_Level + "]";
	}
	public Integer getAttendant_ID() {
		return attendant_ID;
	}
	public void setAttendant_ID(Integer attendant_ID) {
		this.attendant_ID = attendant_ID;
	}
	public String getAttendant_Name() {
		return attendant_Name;
	}
	public void setAttendant_Name(String attendant_Name) {
		this.attendant_Name = attendant_Name;
	}
	public String getAttendant_Logon_ID() {
		return attendant_Logon_ID;
	}
	public void setAttendant_Logon_ID(String attendant_Logon_ID) {
		this.attendant_Logon_ID = attendant_Logon_ID;
	}
	public Integer getAttendant_Number() {
		return attendant_Number;
	}
	public void setAttendant_Number(Integer attendant_Number) {
		this.attendant_Number = attendant_Number;
	}
	public String getAttendant_Password() {
		return attendant_Password;
	}
	public void setAttendant_Password(String attendant_Password) {
		this.attendant_Password = attendant_Password;
	}
	public Integer getAttendant_Disabled() {
		return attendant_Disabled;
	}
	public void setAttendant_Disabled(Integer attendant_Disabled) {
		this.attendant_Disabled = attendant_Disabled;
	}
	public Integer getAttendant_Blocked_Reason() {
		return attendant_Blocked_Reason;
	}
	public void setAttendant_Blocked_Reason(Integer attendant_Blocked_Reason) {
		this.attendant_Blocked_Reason = attendant_Blocked_Reason;
	}
	public BigDecimal getWarning_Level() {
		return warning_Level;
	}
	public void setWarning_Level(BigDecimal warning_Level) {
		this.warning_Level = warning_Level;
	}
	public BigDecimal getAlarm_Level() {
		return alarm_Level;
	}
	public void setAlarm_Level(BigDecimal alarm_Level) {
		this.alarm_Level = alarm_Level;
	}
	public Integer getDeleted() {
		return deleted;
	}
	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}
	public Integer getAttendant_Tag_ID() {
		return attendant_Tag_ID;
	}
	public void setAttendant_Tag_ID(Integer attendant_Tag_ID) {
		this.attendant_Tag_ID = attendant_Tag_ID;
	}
	public Boolean getAttendant_Tag_Active() {
		return attendant_Tag_Active;
	}
	public void setAttendant_Tag_Active(Boolean attendant_Tag_Active) {
		this.attendant_Tag_Active = attendant_Tag_Active;
	}
	public Integer getSafedrop_Alert_Level() {
		return safedrop_Alert_Level;
	}
	public void setSafedrop_Alert_Level(Integer safedrop_Alert_Level) {
		this.safedrop_Alert_Level = safedrop_Alert_Level;
	}
}
