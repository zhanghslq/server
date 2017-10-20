package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class CashierHistory implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer periodId;
	private Integer cashierId;
	private Integer cshrNumTrs;
	private BigDecimal cshrValTrs;
	private Integer cshrNumVoid;
	private BigDecimal cshrValVoid;
	private Integer cshrNumNosales;
	private Integer cshrNumRefund;
	private BigDecimal cshrValRefund;
	private Integer cshrNumDisc;
	private BigDecimal cshrValDisc;
	private Integer cshrNumSurc;
	private BigDecimal cshrValSurc;
	private Integer cshrNumSafedrop;
	private BigDecimal cshrValSafedrop;
	private Integer totalAwardedQty;
	private BigDecimal totalAwarderVal;
	private Integer totalRedeemedQty;
	private BigDecimal totalRedeemedVal;
	private String stationId;
	public String getStationId() {
		return stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	public CashierHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CashierHistory(Integer periodId, Integer cashierId,
			Integer cshrNumTrs, BigDecimal cshrValTrs, Integer cshrNumVoid,
			BigDecimal cshrValVoid, Integer cshrNumNosales,
			Integer cshrNumRefund, BigDecimal cshrValRefund,
			Integer cshrNumDisc, BigDecimal cshrValDisc, Integer cshrNumSurc,
			BigDecimal cshrValSurc, Integer cshrNumSafedrop,
			BigDecimal cshrValSafedrop, Integer totalAwardedQty,
			BigDecimal totalAwarderVal, Integer totalRedeemedQty,
			BigDecimal totalRedeemedVal) {
		super();
		this.periodId = periodId;
		this.cashierId = cashierId;
		this.cshrNumTrs = cshrNumTrs;
		this.cshrValTrs = cshrValTrs;
		this.cshrNumVoid = cshrNumVoid;
		this.cshrValVoid = cshrValVoid;
		this.cshrNumNosales = cshrNumNosales;
		this.cshrNumRefund = cshrNumRefund;
		this.cshrValRefund = cshrValRefund;
		this.cshrNumDisc = cshrNumDisc;
		this.cshrValDisc = cshrValDisc;
		this.cshrNumSurc = cshrNumSurc;
		this.cshrValSurc = cshrValSurc;
		this.cshrNumSafedrop = cshrNumSafedrop;
		this.cshrValSafedrop = cshrValSafedrop;
		this.totalAwardedQty = totalAwardedQty;
		this.totalAwarderVal = totalAwarderVal;
		this.totalRedeemedQty = totalRedeemedQty;
		this.totalRedeemedVal = totalRedeemedVal;
	}
	@Override
	public String toString() {
		return "CashierHistory [periodId=" + periodId + ", cashierId="
				+ cashierId + ", cshrNumTrs=" + cshrNumTrs + ", cshrValTrs="
				+ cshrValTrs + ", cshrNumVoid=" + cshrNumVoid
				+ ", cshrValVoid=" + cshrValVoid + ", cshrNumNosales="
				+ cshrNumNosales + ", cshrNumRefund=" + cshrNumRefund
				+ ", cshrValRefund=" + cshrValRefund + ", cshrNumDisc="
				+ cshrNumDisc + ", cshrValDisc=" + cshrValDisc
				+ ", cshrNumSurc=" + cshrNumSurc + ", cshrValSurc="
				+ cshrValSurc + ", cshrNumSafedrop=" + cshrNumSafedrop
				+ ", cshrValSafedrop=" + cshrValSafedrop + ", totalAwardedQty="
				+ totalAwardedQty + ", totalAwarderVal=" + totalAwarderVal
				+ ", totalRedeemedQty=" + totalRedeemedQty
				+ ", totalRedeemedVal=" + totalRedeemedVal + "]";
	}
	public Integer getPeriodId() {
		return periodId;
	}
	public void setPeriodId(Integer periodId) {
		this.periodId = periodId;
	}
	public Integer getCashierId() {
		return cashierId;
	}
	public void setCashierId(Integer cashierId) {
		this.cashierId = cashierId;
	}
	public Integer getCshrNumTrs() {
		return cshrNumTrs;
	}
	public void setCshrNumTrs(Integer cshrNumTrs) {
		this.cshrNumTrs = cshrNumTrs;
	}
	public BigDecimal getCshrValTrs() {
		return cshrValTrs;
	}
	public void setCshrValTrs(BigDecimal cshrValTrs) {
		this.cshrValTrs = cshrValTrs;
	}
	public Integer getCshrNumVoid() {
		return cshrNumVoid;
	}
	public void setCshrNumVoid(Integer cshrNumVoid) {
		this.cshrNumVoid = cshrNumVoid;
	}
	public BigDecimal getCshrValVoid() {
		return cshrValVoid;
	}
	public void setCshrValVoid(BigDecimal cshrValVoid) {
		this.cshrValVoid = cshrValVoid;
	}
	public Integer getCshrNumNosales() {
		return cshrNumNosales;
	}
	public void setCshrNumNosales(Integer cshrNumNosales) {
		this.cshrNumNosales = cshrNumNosales;
	}
	public Integer getCshrNumRefund() {
		return cshrNumRefund;
	}
	public void setCshrNumRefund(Integer cshrNumRefund) {
		this.cshrNumRefund = cshrNumRefund;
	}
	public BigDecimal getCshrValRefund() {
		return cshrValRefund;
	}
	public void setCshrValRefund(BigDecimal cshrValRefund) {
		this.cshrValRefund = cshrValRefund;
	}
	public Integer getCshrNumDisc() {
		return cshrNumDisc;
	}
	public void setCshrNumDisc(Integer cshrNumDisc) {
		this.cshrNumDisc = cshrNumDisc;
	}
	public BigDecimal getCshrValDisc() {
		return cshrValDisc;
	}
	public void setCshrValDisc(BigDecimal cshrValDisc) {
		this.cshrValDisc = cshrValDisc;
	}
	public Integer getCshrNumSurc() {
		return cshrNumSurc;
	}
	public void setCshrNumSurc(Integer cshrNumSurc) {
		this.cshrNumSurc = cshrNumSurc;
	}
	public BigDecimal getCshrValSurc() {
		return cshrValSurc;
	}
	public void setCshrValSurc(BigDecimal cshrValSurc) {
		this.cshrValSurc = cshrValSurc;
	}
	public Integer getCshrNumSafedrop() {
		return cshrNumSafedrop;
	}
	public void setCshrNumSafedrop(Integer cshrNumSafedrop) {
		this.cshrNumSafedrop = cshrNumSafedrop;
	}
	public BigDecimal getCshrValSafedrop() {
		return cshrValSafedrop;
	}
	public void setCshrValSafedrop(BigDecimal cshrValSafedrop) {
		this.cshrValSafedrop = cshrValSafedrop;
	}
	public Integer getTotalAwardedQty() {
		return totalAwardedQty;
	}
	public void setTotalAwardedQty(Integer totalAwardedQty) {
		this.totalAwardedQty = totalAwardedQty;
	}
	public BigDecimal getTotalAwarderVal() {
		return totalAwarderVal;
	}
	public void setTotalAwarderVal(BigDecimal totalAwarderVal) {
		this.totalAwarderVal = totalAwarderVal;
	}
	public Integer getTotalRedeemedQty() {
		return totalRedeemedQty;
	}
	public void setTotalRedeemedQty(Integer totalRedeemedQty) {
		this.totalRedeemedQty = totalRedeemedQty;
	}
	public BigDecimal getTotalRedeemedVal() {
		return totalRedeemedVal;
	}
	public void setTotalRedeemedVal(BigDecimal totalRedeemedVal) {
		this.totalRedeemedVal = totalRedeemedVal;
	}

}
