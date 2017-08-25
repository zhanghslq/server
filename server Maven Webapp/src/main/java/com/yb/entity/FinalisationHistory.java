package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class FinalisationHistory implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer periodId;
	private Integer mopId;
	private Integer mopNetQty;
	private BigDecimal mopNetValue;
	private Integer mopNumSafedrop;
	private BigDecimal mopValSafedrop;
	private Integer mopNumPayin;
	private BigDecimal mopValPayin;
	private Integer mopNumCashout;
	private BigDecimal mopValCashout;
	private BigDecimal mopValCashadj;
	private Integer mopNumPayout;
	private BigDecimal mopValPayout;
	private Integer mopNumAttsafedrop;
	private BigDecimal mopValAttsafedrop;
	private Integer mopQtyExtPos;
	private BigDecimal mopValExtPos;
	private Integer mopNumSafedropExtPos;
	private BigDecimal mopValSafedropExtPos;
private String stationId;
	
	public String getStationId() {
		return stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	public FinalisationHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FinalisationHistory(Integer periodId, Integer mopId,
			Integer mopNetQty, BigDecimal mopNetValue, Integer mopNumSafedrop,
			BigDecimal mopValSafedrop, Integer mopNumPayin,
			BigDecimal mopValPayin, Integer mopNumCashout,
			BigDecimal mopValCashout, BigDecimal mopValCashadj,
			Integer mopNumPayout, BigDecimal mopValPayout,
			Integer mopNumAttsafedrop, BigDecimal mopValAttsafedrop,
			Integer mopQtyExtPos, BigDecimal mopValExtPos,
			Integer mopNumSafedropExtPos, BigDecimal mopValSafedropExtPos) {
		super();
		this.periodId = periodId;
		this.mopId = mopId;
		this.mopNetQty = mopNetQty;
		this.mopNetValue = mopNetValue;
		this.mopNumSafedrop = mopNumSafedrop;
		this.mopValSafedrop = mopValSafedrop;
		this.mopNumPayin = mopNumPayin;
		this.mopValPayin = mopValPayin;
		this.mopNumCashout = mopNumCashout;
		this.mopValCashout = mopValCashout;
		this.mopValCashadj = mopValCashadj;
		this.mopNumPayout = mopNumPayout;
		this.mopValPayout = mopValPayout;
		this.mopNumAttsafedrop = mopNumAttsafedrop;
		this.mopValAttsafedrop = mopValAttsafedrop;
		this.mopQtyExtPos = mopQtyExtPos;
		this.mopValExtPos = mopValExtPos;
		this.mopNumSafedropExtPos = mopNumSafedropExtPos;
		this.mopValSafedropExtPos = mopValSafedropExtPos;
	}
	@Override
	public String toString() {
		return "FinallisationHistory [periodId=" + periodId + ", mopId="
				+ mopId + ", mopNetQty=" + mopNetQty + ", mopNetValue="
				+ mopNetValue + ", mopNumSafedrop=" + mopNumSafedrop
				+ ", mopValSafedrop=" + mopValSafedrop + ", mopNumPayin="
				+ mopNumPayin + ", mopValPayin=" + mopValPayin
				+ ", mopNumCashout=" + mopNumCashout + ", mopValCashout="
				+ mopValCashout + ", mopValCashadj=" + mopValCashadj
				+ ", mopNumPayout=" + mopNumPayout + ", mopValPayout="
				+ mopValPayout + ", mopNumAttsafedrop=" + mopNumAttsafedrop
				+ ", mopValAttsafedrop=" + mopValAttsafedrop
				+ ", mopQtyExtPos=" + mopQtyExtPos + ", mopValExtPos="
				+ mopValExtPos + ", mopNumSafedropExtPos="
				+ mopNumSafedropExtPos + ", mopValSafedropExtPos="
				+ mopValSafedropExtPos + "]";
	}
	public Integer getPeriodId() {
		return periodId;
	}
	public void setPeriodId(Integer periodId) {
		this.periodId = periodId;
	}
	public Integer getMopId() {
		return mopId;
	}
	public void setMopId(Integer mopId) {
		this.mopId = mopId;
	}
	public Integer getMopNetQty() {
		return mopNetQty;
	}
	public void setMopNetQty(Integer mopNetQty) {
		this.mopNetQty = mopNetQty;
	}
	public BigDecimal getMopNetValue() {
		return mopNetValue;
	}
	public void setMopNetValue(BigDecimal mopNetValue) {
		this.mopNetValue = mopNetValue;
	}
	public Integer getMopNumSafedrop() {
		return mopNumSafedrop;
	}
	public void setMopNumSafedrop(Integer mopNumSafedrop) {
		this.mopNumSafedrop = mopNumSafedrop;
	}
	public BigDecimal getMopValSafedrop() {
		return mopValSafedrop;
	}
	public void setMopValSafedrop(BigDecimal mopValSafedrop) {
		this.mopValSafedrop = mopValSafedrop;
	}
	public Integer getMopNumPayin() {
		return mopNumPayin;
	}
	public void setMopNumPayin(Integer mopNumPayin) {
		this.mopNumPayin = mopNumPayin;
	}
	public BigDecimal getMopValPayin() {
		return mopValPayin;
	}
	public void setMopValPayin(BigDecimal mopValPayin) {
		this.mopValPayin = mopValPayin;
	}
	public Integer getMopNumCashout() {
		return mopNumCashout;
	}
	public void setMopNumCashout(Integer mopNumCashout) {
		this.mopNumCashout = mopNumCashout;
	}
	public BigDecimal getMopValCashout() {
		return mopValCashout;
	}
	public void setMopValCashout(BigDecimal mopValCashout) {
		this.mopValCashout = mopValCashout;
	}
	public BigDecimal getMopValCashadj() {
		return mopValCashadj;
	}
	public void setMopValCashadj(BigDecimal mopValCashadj) {
		this.mopValCashadj = mopValCashadj;
	}
	public Integer getMopNumPayout() {
		return mopNumPayout;
	}
	public void setMopNumPayout(Integer mopNumPayout) {
		this.mopNumPayout = mopNumPayout;
	}
	public BigDecimal getMopValPayout() {
		return mopValPayout;
	}
	public void setMopValPayout(BigDecimal mopValPayout) {
		this.mopValPayout = mopValPayout;
	}
	public Integer getMopNumAttsafedrop() {
		return mopNumAttsafedrop;
	}
	public void setMopNumAttsafedrop(Integer mopNumAttsafedrop) {
		this.mopNumAttsafedrop = mopNumAttsafedrop;
	}
	public BigDecimal getMopValAttsafedrop() {
		return mopValAttsafedrop;
	}
	public void setMopValAttsafedrop(BigDecimal mopValAttsafedrop) {
		this.mopValAttsafedrop = mopValAttsafedrop;
	}
	public Integer getMopQtyExtPos() {
		return mopQtyExtPos;
	}
	public void setMopQtyExtPos(Integer mopQtyExtPos) {
		this.mopQtyExtPos = mopQtyExtPos;
	}
	public BigDecimal getMopValExtPos() {
		return mopValExtPos;
	}
	public void setMopValExtPos(BigDecimal mopValExtPos) {
		this.mopValExtPos = mopValExtPos;
	}
	public Integer getMopNumSafedropExtPos() {
		return mopNumSafedropExtPos;
	}
	public void setMopNumSafedropExtPos(Integer mopNumSafedropExtPos) {
		this.mopNumSafedropExtPos = mopNumSafedropExtPos;
	}
	public BigDecimal getMopValSafedropExtPos() {
		return mopValSafedropExtPos;
	}
	public void setMopValSafedropExtPos(BigDecimal mopValSafedropExtPos) {
		this.mopValSafedropExtPos = mopValSafedropExtPos;
	}
	
	
}
