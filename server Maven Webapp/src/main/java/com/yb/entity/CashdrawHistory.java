package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class CashdrawHistory implements Serializable{
	private Integer cdrawPeriodId;
	private Integer mopId;
	private BigDecimal cdrawTotAmount;
	private BigDecimal cdrawFloat;
	private Integer cdrawNumSafedrop;
	private BigDecimal cdrawTotSafedrop;
	private Integer cdrawNumPayin;
	private BigDecimal cdrawTotPayin;
	private BigDecimal cdrawAmountCounted;
	private Integer cdrawNumPayout;
	private BigDecimal cdrawTotPayout;
	private BigDecimal cdrawTotalPrepayDelValue;
	private BigDecimal cdrawPotalPrepayExcess;
	private Integer cdrawPrepayCount;
	private Integer cdrawPrepayExcessCount;
	private Integer cdrawQtyMop;
	public CashdrawHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CashdrawHistory(Integer cdrawPeriodId, Integer mopId,
			BigDecimal cdrawTotAmount, BigDecimal cdrawFloat,
			Integer cdrawNumSafedrop, BigDecimal cdrawTotSafedrop,
			Integer cdrawNumPayin, BigDecimal cdrawTotPayin,
			BigDecimal cdrawAmountCounted, Integer cdrawNumPayout,
			BigDecimal cdrawTotPayout, BigDecimal cdrawTotalPrepayDelValue,
			BigDecimal cdrawPotalPrepayExcess, Integer cdrawPrepayCount,
			Integer cdrawPrepayExcessCount, Integer cdrawQtyMop) {
		super();
		this.cdrawPeriodId = cdrawPeriodId;
		this.mopId = mopId;
		this.cdrawTotAmount = cdrawTotAmount;
		this.cdrawFloat = cdrawFloat;
		this.cdrawNumSafedrop = cdrawNumSafedrop;
		this.cdrawTotSafedrop = cdrawTotSafedrop;
		this.cdrawNumPayin = cdrawNumPayin;
		this.cdrawTotPayin = cdrawTotPayin;
		this.cdrawAmountCounted = cdrawAmountCounted;
		this.cdrawNumPayout = cdrawNumPayout;
		this.cdrawTotPayout = cdrawTotPayout;
		this.cdrawTotalPrepayDelValue = cdrawTotalPrepayDelValue;
		this.cdrawPotalPrepayExcess = cdrawPotalPrepayExcess;
		this.cdrawPrepayCount = cdrawPrepayCount;
		this.cdrawPrepayExcessCount = cdrawPrepayExcessCount;
		this.cdrawQtyMop = cdrawQtyMop;
	}
	@Override
	public String toString() {
		return "CashdrawHistory [cdrawPeriodId=" + cdrawPeriodId + ", mopId="
				+ mopId + ", cdrawTotAmount=" + cdrawTotAmount
				+ ", cdrawFloat=" + cdrawFloat + ", cdrawNumSafedrop="
				+ cdrawNumSafedrop + ", cdrawTotSafedrop=" + cdrawTotSafedrop
				+ ", cdrawNumPayin=" + cdrawNumPayin + ", cdrawTotPayin="
				+ cdrawTotPayin + ", cdrawAmountCounted=" + cdrawAmountCounted
				+ ", cdrawNumPayout=" + cdrawNumPayout + ", cdrawTotPayout="
				+ cdrawTotPayout + ", cdrawTotalPrepayDelValue="
				+ cdrawTotalPrepayDelValue + ", cdrawPotalPrepayExcess="
				+ cdrawPotalPrepayExcess + ", cdrawPrepayCount="
				+ cdrawPrepayCount + ", cdrawPrepayExcessCount="
				+ cdrawPrepayExcessCount + ", cdrawQtyMop=" + cdrawQtyMop + "]";
	}
	public Integer getCdrawPeriodId() {
		return cdrawPeriodId;
	}
	public void setCdrawPeriodId(Integer cdrawPeriodId) {
		this.cdrawPeriodId = cdrawPeriodId;
	}
	public Integer getMopId() {
		return mopId;
	}
	public void setMopId(Integer mopId) {
		this.mopId = mopId;
	}
	public BigDecimal getCdrawTotAmount() {
		return cdrawTotAmount;
	}
	public void setCdrawTotAmount(BigDecimal cdrawTotAmount) {
		this.cdrawTotAmount = cdrawTotAmount;
	}
	public BigDecimal getCdrawFloat() {
		return cdrawFloat;
	}
	public void setCdrawFloat(BigDecimal cdrawFloat) {
		this.cdrawFloat = cdrawFloat;
	}
	public Integer getCdrawNumSafedrop() {
		return cdrawNumSafedrop;
	}
	public void setCdrawNumSafedrop(Integer cdrawNumSafedrop) {
		this.cdrawNumSafedrop = cdrawNumSafedrop;
	}
	public BigDecimal getCdrawTotSafedrop() {
		return cdrawTotSafedrop;
	}
	public void setCdrawTotSafedrop(BigDecimal cdrawTotSafedrop) {
		this.cdrawTotSafedrop = cdrawTotSafedrop;
	}
	public Integer getCdrawNumPayin() {
		return cdrawNumPayin;
	}
	public void setCdrawNumPayin(Integer cdrawNumPayin) {
		this.cdrawNumPayin = cdrawNumPayin;
	}
	public BigDecimal getCdrawTotPayin() {
		return cdrawTotPayin;
	}
	public void setCdrawTotPayin(BigDecimal cdrawTotPayin) {
		this.cdrawTotPayin = cdrawTotPayin;
	}
	public BigDecimal getCdrawAmountCounted() {
		return cdrawAmountCounted;
	}
	public void setCdrawAmountCounted(BigDecimal cdrawAmountCounted) {
		this.cdrawAmountCounted = cdrawAmountCounted;
	}
	public Integer getCdrawNumPayout() {
		return cdrawNumPayout;
	}
	public void setCdrawNumPayout(Integer cdrawNumPayout) {
		this.cdrawNumPayout = cdrawNumPayout;
	}
	public BigDecimal getCdrawTotPayout() {
		return cdrawTotPayout;
	}
	public void setCdrawTotPayout(BigDecimal cdrawTotPayout) {
		this.cdrawTotPayout = cdrawTotPayout;
	}
	public BigDecimal getCdrawTotalPrepayDelValue() {
		return cdrawTotalPrepayDelValue;
	}
	public void setCdrawTotalPrepayDelValue(BigDecimal cdrawTotalPrepayDelValue) {
		this.cdrawTotalPrepayDelValue = cdrawTotalPrepayDelValue;
	}
	public BigDecimal getCdrawPotalPrepayExcess() {
		return cdrawPotalPrepayExcess;
	}
	public void setCdrawPotalPrepayExcess(BigDecimal cdrawPotalPrepayExcess) {
		this.cdrawPotalPrepayExcess = cdrawPotalPrepayExcess;
	}
	public Integer getCdrawPrepayCount() {
		return cdrawPrepayCount;
	}
	public void setCdrawPrepayCount(Integer cdrawPrepayCount) {
		this.cdrawPrepayCount = cdrawPrepayCount;
	}
	public Integer getCdrawPrepayExcessCount() {
		return cdrawPrepayExcessCount;
	}
	public void setCdrawPrepayExcessCount(Integer cdrawPrepayExcessCount) {
		this.cdrawPrepayExcessCount = cdrawPrepayExcessCount;
	}
	public Integer getCdrawQtyMop() {
		return cdrawQtyMop;
	}
	public void setCdrawQtyMop(Integer cdrawQtyMop) {
		this.cdrawQtyMop = cdrawQtyMop;
	}
	
}
