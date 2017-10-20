package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TblDifferencestrade implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal differencestradeId;
	private BigDecimal version;
	private BigDecimal tradeType;
	private String couponRemove;
	private Date workdate;
	private String stationcode;
	private String rrn;
	private String autoflag;
	private String handingfee;
	private String thirdorderno;
	private String feeRate;
	private String posnum;
	private String realamount;
	private String thirdtransdate;
	private String amount;
	private String orgId;
	private String transdate;
	private String batchno;
	private String diffType;
	private String transtime;
	private String paytype;
	private String coupon;
	private String thirdtranstime;
	private Date nowDate;
	public TblDifferencestrade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TblDifferencestrade(BigDecimal differencestradeId,
			BigDecimal version, BigDecimal tradeType, String couponRemove,
			Date workdate, String stationcode, String rrn, String autoflag,
			String handingfee, String thirdorderno, String feeRate,
			String posnum, String realamount, String thirdtransdate,
			String amount, String orgId, String transdate, String batchno,
			String diffType, String transtime, String paytype, String coupon,
			String thirdtranstime, Date nowDate) {
		super();
		this.differencestradeId = differencestradeId;
		this.version = version;
		this.tradeType = tradeType;
		this.couponRemove = couponRemove;
		this.workdate = workdate;
		this.stationcode = stationcode;
		this.rrn = rrn;
		this.autoflag = autoflag;
		this.handingfee = handingfee;
		this.thirdorderno = thirdorderno;
		this.feeRate = feeRate;
		this.posnum = posnum;
		this.realamount = realamount;
		this.thirdtransdate = thirdtransdate;
		this.amount = amount;
		this.orgId = orgId;
		this.transdate = transdate;
		this.batchno = batchno;
		this.diffType = diffType;
		this.transtime = transtime;
		this.paytype = paytype;
		this.coupon = coupon;
		this.thirdtranstime = thirdtranstime;
		this.nowDate = nowDate;
	}
	@Override
	public String toString() {
		return "TblDifferencestrade [differencestradeId=" + differencestradeId
				+ ", version=" + version + ", tradeType=" + tradeType
				+ ", couponRemove=" + couponRemove + ", workdate=" + workdate
				+ ", stationcode=" + stationcode + ", rrn=" + rrn
				+ ", autoflag=" + autoflag + ", handingfee=" + handingfee
				+ ", thirdorderno=" + thirdorderno + ", feeRate=" + feeRate
				+ ", posnum=" + posnum + ", realamount=" + realamount
				+ ", thirdtransdate=" + thirdtransdate + ", amount=" + amount
				+ ", orgId=" + orgId + ", transdate=" + transdate
				+ ", batchno=" + batchno + ", diffType=" + diffType
				+ ", transtime=" + transtime + ", paytype=" + paytype
				+ ", coupon=" + coupon + ", thirdtranstime=" + thirdtranstime
				+ ", nowDate=" + nowDate + "]";
	}
	public BigDecimal getDifferencestradeId() {
		return differencestradeId;
	}
	public void setDifferencestradeId(BigDecimal differencestradeId) {
		this.differencestradeId = differencestradeId;
	}
	public BigDecimal getVersion() {
		return version;
	}
	public void setVersion(BigDecimal version) {
		this.version = version;
	}
	public BigDecimal getTradeType() {
		return tradeType;
	}
	public void setTradeType(BigDecimal tradeType) {
		this.tradeType = tradeType;
	}
	public String getCouponRemove() {
		return couponRemove;
	}
	public void setCouponRemove(String couponRemove) {
		this.couponRemove = couponRemove;
	}
	public Date getWorkdate() {
		return workdate;
	}
	public void setWorkdate(Date workdate) {
		this.workdate = workdate;
	}
	public String getStationcode() {
		return stationcode;
	}
	public void setStationcode(String stationcode) {
		this.stationcode = stationcode;
	}
	public String getRrn() {
		return rrn;
	}
	public void setRrn(String rrn) {
		this.rrn = rrn;
	}
	public String getAutoflag() {
		return autoflag;
	}
	public void setAutoflag(String autoflag) {
		this.autoflag = autoflag;
	}
	public String getHandingfee() {
		return handingfee;
	}
	public void setHandingfee(String handingfee) {
		this.handingfee = handingfee;
	}
	public String getThirdorderno() {
		return thirdorderno;
	}
	public void setThirdorderno(String thirdorderno) {
		this.thirdorderno = thirdorderno;
	}
	public String getFeeRate() {
		return feeRate;
	}
	public void setFeeRate(String feeRate) {
		this.feeRate = feeRate;
	}
	public String getPosnum() {
		return posnum;
	}
	public void setPosnum(String posnum) {
		this.posnum = posnum;
	}
	public String getRealamount() {
		return realamount;
	}
	public void setRealamount(String realamount) {
		this.realamount = realamount;
	}
	public String getThirdtransdate() {
		return thirdtransdate;
	}
	public void setThirdtransdate(String thirdtransdate) {
		this.thirdtransdate = thirdtransdate;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getTransdate() {
		return transdate;
	}
	public void setTransdate(String transdate) {
		this.transdate = transdate;
	}
	public String getBatchno() {
		return batchno;
	}
	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}
	public String getDiffType() {
		return diffType;
	}
	public void setDiffType(String diffType) {
		this.diffType = diffType;
	}
	public String getTranstime() {
		return transtime;
	}
	public void setTranstime(String transtime) {
		this.transtime = transtime;
	}
	public String getPaytype() {
		return paytype;
	}
	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}
	public String getCoupon() {
		return coupon;
	}
	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}
	public String getThirdtranstime() {
		return thirdtranstime;
	}
	public void setThirdtranstime(String thirdtranstime) {
		this.thirdtranstime = thirdtranstime;
	}
	public Date getNowDate() {
		return nowDate;
	}
	public void setNowDate(Date nowDate) {
		this.nowDate = nowDate;
	}
	
	
}
