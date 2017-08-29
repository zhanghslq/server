package com.yb.entity;

import java.math.BigDecimal;

public class Hoses {
	private Integer Hose_ID;
	private Integer Pump_ID;
	private Integer Grade_ID;
	private Integer Tank_ID;
	private BigDecimal Volume_Total;
	private Integer Tank2_ID;
	private Integer Hose_number;
	private BigDecimal Mechanical_Total;
	private BigDecimal Money_Total;
	private BigDecimal Theoretical_Total;
	private BigDecimal Volume_Total2;
	private BigDecimal Money_Total2;
	private BigDecimal Theoretical_Total2;
	private Integer Blend_Type;
	private BigDecimal Volume_Total_Turnover_Correction;
	private BigDecimal Money_Total_Turnover_Correction;
	private BigDecimal Volume_Total2_Turnover_Correction;
	private Integer Volume_Total_State_ID;
	private Integer Money_Total_State_ID;
	private Integer Volume_Total2_State_ID;
	private Integer Deleted;
	private BigDecimal Volume_Total1;
	private BigDecimal Money_Total1;
	public Hoses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hoses(Integer hose_ID, Integer pump_ID, Integer grade_ID,
			Integer tank_ID, BigDecimal volume_Total, Integer tank2_ID,
			Integer hose_number, BigDecimal mechanical_Total,
			BigDecimal money_Total, BigDecimal theoretical_Total,
			BigDecimal volume_Total2, BigDecimal money_Total2,
			BigDecimal theoretical_Total2, Integer blend_Type,
			BigDecimal volume_Total_Turnover_Correction,
			BigDecimal money_Total_Turnover_Correction,
			BigDecimal volume_Total2_Turnover_Correction,
			Integer volume_Total_State_ID, Integer money_Total_State_ID,
			Integer volume_Total2_State_ID, Integer deleted,
			BigDecimal volume_Total1, BigDecimal money_Total1) {
		super();
		Hose_ID = hose_ID;
		Pump_ID = pump_ID;
		Grade_ID = grade_ID;
		Tank_ID = tank_ID;
		Volume_Total = volume_Total;
		Tank2_ID = tank2_ID;
		Hose_number = hose_number;
		Mechanical_Total = mechanical_Total;
		Money_Total = money_Total;
		Theoretical_Total = theoretical_Total;
		Volume_Total2 = volume_Total2;
		Money_Total2 = money_Total2;
		Theoretical_Total2 = theoretical_Total2;
		Blend_Type = blend_Type;
		Volume_Total_Turnover_Correction = volume_Total_Turnover_Correction;
		Money_Total_Turnover_Correction = money_Total_Turnover_Correction;
		Volume_Total2_Turnover_Correction = volume_Total2_Turnover_Correction;
		Volume_Total_State_ID = volume_Total_State_ID;
		Money_Total_State_ID = money_Total_State_ID;
		Volume_Total2_State_ID = volume_Total2_State_ID;
		Deleted = deleted;
		Volume_Total1 = volume_Total1;
		Money_Total1 = money_Total1;
	}
	@Override
	public String toString() {
		return "Hoses [Hose_ID=" + Hose_ID + ", Pump_ID=" + Pump_ID
				+ ", Grade_ID=" + Grade_ID + ", Tank_ID=" + Tank_ID
				+ ", Volume_Total=" + Volume_Total + ", Tank2_ID=" + Tank2_ID
				+ ", Hose_number=" + Hose_number + ", Mechanical_Total="
				+ Mechanical_Total + ", Money_Total=" + Money_Total
				+ ", Theoretical_Total=" + Theoretical_Total
				+ ", Volume_Total2=" + Volume_Total2 + ", Money_Total2="
				+ Money_Total2 + ", Theoretical_Total2=" + Theoretical_Total2
				+ ", Blend_Type=" + Blend_Type
				+ ", Volume_Total_Turnover_Correction="
				+ Volume_Total_Turnover_Correction
				+ ", Money_Total_Turnover_Correction="
				+ Money_Total_Turnover_Correction
				+ ", Volume_Total2_Turnover_Correction="
				+ Volume_Total2_Turnover_Correction
				+ ", Volume_Total_State_ID=" + Volume_Total_State_ID
				+ ", Money_Total_State_ID=" + Money_Total_State_ID
				+ ", Volume_Total2_State_ID=" + Volume_Total2_State_ID
				+ ", Deleted=" + Deleted + ", Volume_Total1=" + Volume_Total1
				+ ", Money_Total1=" + Money_Total1 + "]";
	}
	public Integer getHose_ID() {
		return Hose_ID;
	}
	public void setHose_ID(Integer hose_ID) {
		Hose_ID = hose_ID;
	}
	public Integer getPump_ID() {
		return Pump_ID;
	}
	public void setPump_ID(Integer pump_ID) {
		Pump_ID = pump_ID;
	}
	public Integer getGrade_ID() {
		return Grade_ID;
	}
	public void setGrade_ID(Integer grade_ID) {
		Grade_ID = grade_ID;
	}
	public Integer getTank_ID() {
		return Tank_ID;
	}
	public void setTank_ID(Integer tank_ID) {
		Tank_ID = tank_ID;
	}
	public BigDecimal getVolume_Total() {
		return Volume_Total;
	}
	public void setVolume_Total(BigDecimal volume_Total) {
		Volume_Total = volume_Total;
	}
	public Integer getTank2_ID() {
		return Tank2_ID;
	}
	public void setTank2_ID(Integer tank2_ID) {
		Tank2_ID = tank2_ID;
	}
	public Integer getHose_number() {
		return Hose_number;
	}
	public void setHose_number(Integer hose_number) {
		Hose_number = hose_number;
	}
	public BigDecimal getMechanical_Total() {
		return Mechanical_Total;
	}
	public void setMechanical_Total(BigDecimal mechanical_Total) {
		Mechanical_Total = mechanical_Total;
	}
	public BigDecimal getMoney_Total() {
		return Money_Total;
	}
	public void setMoney_Total(BigDecimal money_Total) {
		Money_Total = money_Total;
	}
	public BigDecimal getTheoretical_Total() {
		return Theoretical_Total;
	}
	public void setTheoretical_Total(BigDecimal theoretical_Total) {
		Theoretical_Total = theoretical_Total;
	}
	public BigDecimal getVolume_Total2() {
		return Volume_Total2;
	}
	public void setVolume_Total2(BigDecimal volume_Total2) {
		Volume_Total2 = volume_Total2;
	}
	public BigDecimal getMoney_Total2() {
		return Money_Total2;
	}
	public void setMoney_Total2(BigDecimal money_Total2) {
		Money_Total2 = money_Total2;
	}
	public BigDecimal getTheoretical_Total2() {
		return Theoretical_Total2;
	}
	public void setTheoretical_Total2(BigDecimal theoretical_Total2) {
		Theoretical_Total2 = theoretical_Total2;
	}
	public Integer getBlend_Type() {
		return Blend_Type;
	}
	public void setBlend_Type(Integer blend_Type) {
		Blend_Type = blend_Type;
	}
	public BigDecimal getVolume_Total_Turnover_Correction() {
		return Volume_Total_Turnover_Correction;
	}
	public void setVolume_Total_Turnover_Correction(
			BigDecimal volume_Total_Turnover_Correction) {
		Volume_Total_Turnover_Correction = volume_Total_Turnover_Correction;
	}
	public BigDecimal getMoney_Total_Turnover_Correction() {
		return Money_Total_Turnover_Correction;
	}
	public void setMoney_Total_Turnover_Correction(
			BigDecimal money_Total_Turnover_Correction) {
		Money_Total_Turnover_Correction = money_Total_Turnover_Correction;
	}
	public BigDecimal getVolume_Total2_Turnover_Correction() {
		return Volume_Total2_Turnover_Correction;
	}
	public void setVolume_Total2_Turnover_Correction(
			BigDecimal volume_Total2_Turnover_Correction) {
		Volume_Total2_Turnover_Correction = volume_Total2_Turnover_Correction;
	}
	public Integer getVolume_Total_State_ID() {
		return Volume_Total_State_ID;
	}
	public void setVolume_Total_State_ID(Integer volume_Total_State_ID) {
		Volume_Total_State_ID = volume_Total_State_ID;
	}
	public Integer getMoney_Total_State_ID() {
		return Money_Total_State_ID;
	}
	public void setMoney_Total_State_ID(Integer money_Total_State_ID) {
		Money_Total_State_ID = money_Total_State_ID;
	}
	public Integer getVolume_Total2_State_ID() {
		return Volume_Total2_State_ID;
	}
	public void setVolume_Total2_State_ID(Integer volume_Total2_State_ID) {
		Volume_Total2_State_ID = volume_Total2_State_ID;
	}
	public Integer getDeleted() {
		return Deleted;
	}
	public void setDeleted(Integer deleted) {
		Deleted = deleted;
	}
	public BigDecimal getVolume_Total1() {
		return Volume_Total1;
	}
	public void setVolume_Total1(BigDecimal volume_Total1) {
		Volume_Total1 = volume_Total1;
	}
	public BigDecimal getMoney_Total1() {
		return Money_Total1;
	}
	public void setMoney_Total1(BigDecimal money_Total1) {
		Money_Total1 = money_Total1;
	}
	
}
