package com.yb.entity;

import java.util.Date;

public class Cashiers {
	private Integer cashier_id;
	private Integer cashier_number;
	private String cashier_name;
	private String cashier_psw;
	private Integer cashier_type;
	private Integer attendant_id;
	private Integer cashier_disable;
	private Date cashier_birthdate;
	private String cashier_personal_name;
	private String cashier_family_name;
	private Integer user_role_id;
	private String stationId;
	
	public String getStationId() {
		return stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	public Cashiers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cashiers(Integer cashier_id, Integer cashier_number,
			String cashier_name, String cashier_psw, Integer cashier_type,
			Integer attendant_id, Integer cashier_disable,
			Date cashier_birthdate, String cashier_personal_name,
			String cashier_family_name, Integer user_role_id) {
		super();
		this.cashier_id = cashier_id;
		this.cashier_number = cashier_number;
		this.cashier_name = cashier_name;
		this.cashier_psw = cashier_psw;
		this.cashier_type = cashier_type;
		this.attendant_id = attendant_id;
		this.cashier_disable = cashier_disable;
		this.cashier_birthdate = cashier_birthdate;
		this.cashier_personal_name = cashier_personal_name;
		this.cashier_family_name = cashier_family_name;
		this.user_role_id = user_role_id;
	}
	@Override
	public String toString() {
		return "Cashiers [cashier_id=" + cashier_id + ", cashier_number="
				+ cashier_number + ", cashier_name=" + cashier_name
				+ ", cashier_psw=" + cashier_psw + ", cashier_type="
				+ cashier_type + ", attendant_id=" + attendant_id
				+ ", cashier_disable=" + cashier_disable
				+ ", cashier_birthdate=" + cashier_birthdate
				+ ", cashier_personal_name=" + cashier_personal_name
				+ ", cashier_family_name=" + cashier_family_name
				+ ", user_role_id=" + user_role_id + "]";
	}
	public Integer getCashier_id() {
		return cashier_id;
	}
	public void setCashier_id(Integer cashier_id) {
		this.cashier_id = cashier_id;
	}
	public Integer getCashier_number() {
		return cashier_number;
	}
	public void setCashier_number(Integer cashier_number) {
		this.cashier_number = cashier_number;
	}
	public String getCashier_name() {
		return cashier_name;
	}
	public void setCashier_name(String cashier_name) {
		this.cashier_name = cashier_name;
	}
	public String getCashier_psw() {
		return cashier_psw;
	}
	public void setCashier_psw(String cashier_psw) {
		this.cashier_psw = cashier_psw;
	}
	public Integer getCashier_type() {
		return cashier_type;
	}
	public void setCashier_type(Integer cashier_type) {
		this.cashier_type = cashier_type;
	}
	public Integer getAttendant_id() {
		return attendant_id;
	}
	public void setAttendant_id(Integer attendant_id) {
		this.attendant_id = attendant_id;
	}
	public Integer getCashier_disable() {
		return cashier_disable;
	}
	public void setCashier_disable(Integer cashier_disable) {
		this.cashier_disable = cashier_disable;
	}
	public Date getCashier_birthdate() {
		return cashier_birthdate;
	}
	public void setCashier_birthdate(Date cashier_birthdate) {
		this.cashier_birthdate = cashier_birthdate;
	}
	public String getCashier_personal_name() {
		return cashier_personal_name;
	}
	public void setCashier_personal_name(String cashier_personal_name) {
		this.cashier_personal_name = cashier_personal_name;
	}
	public String getCashier_family_name() {
		return cashier_family_name;
	}
	public void setCashier_family_name(String cashier_family_name) {
		this.cashier_family_name = cashier_family_name;
	}
	public Integer getUser_role_id() {
		return user_role_id;
	}
	public void setUser_role_id(Integer user_role_id) {
		this.user_role_id = user_role_id;
	}
	
}
