package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TblOrderdetails implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal orderdetailsId;
	private BigDecimal version;
	private String nowdate;
	private BigDecimal virtualgoodsid;
	private String returncode;
	private BigDecimal litre;
	private String stationcode;
	private BigDecimal couponamount;
	private String requestId;
	private String ordernum;
	private BigDecimal realamount;
	private String oilcode;
	private BigDecimal orderDeal;
	private BigDecimal discountamount;
	private BigDecimal carduserid;
	private BigDecimal amount;
	private BigDecimal oilprice;
	private String termnum;
	private Date sendtime;
	private String invoicetitle;
	private String memberno;
	private String virtualgoodsids;
	//新增加yi个字段
	private Integer customerId;
	//再加一个字段
	private String PPSORDERNUMBER;
	
	
	//新增字段
	private BigDecimal GOODSAMOUNT;
	private BigDecimal FUELCOUPONAMOUNT;
	private BigDecimal GOODCOUPONAMOUNT;
	private BigDecimal GOODSCOUPONAMOUNT;
	private BigDecimal UPDATEREALAMOUNT;
	private BigDecimal FULECOUPONAMOUNT;
	private BigDecimal FULEAMOUNT;
	private String CARLICENSE;
	private String OILGUNNO;
	private BigDecimal ORDER_STATE;
	private String EPSCODE;
	
	public BigDecimal getGOODSAMOUNT() {
		return GOODSAMOUNT;
	}
	public void setGOODSAMOUNT(BigDecimal gOODSAMOUNT) {
		GOODSAMOUNT = gOODSAMOUNT;
	}
	public BigDecimal getFUELCOUPONAMOUNT() {
		return FUELCOUPONAMOUNT;
	}
	public void setFUELCOUPONAMOUNT(BigDecimal fUELCOUPONAMOUNT) {
		FUELCOUPONAMOUNT = fUELCOUPONAMOUNT;
	}
	public BigDecimal getGOODCOUPONAMOUNT() {
		return GOODCOUPONAMOUNT;
	}
	public void setGOODCOUPONAMOUNT(BigDecimal gOODCOUPONAMOUNT) {
		GOODCOUPONAMOUNT = gOODCOUPONAMOUNT;
	}
	public BigDecimal getGOODSCOUPONAMOUNT() {
		return GOODSCOUPONAMOUNT;
	}
	public void setGOODSCOUPONAMOUNT(BigDecimal gOODSCOUPONAMOUNT) {
		GOODSCOUPONAMOUNT = gOODSCOUPONAMOUNT;
	}
	public BigDecimal getUPDATEREALAMOUNT() {
		return UPDATEREALAMOUNT;
	}
	public void setUPDATEREALAMOUNT(BigDecimal uPDATEREALAMOUNT) {
		UPDATEREALAMOUNT = uPDATEREALAMOUNT;
	}
	public BigDecimal getFULECOUPONAMOUNT() {
		return FULECOUPONAMOUNT;
	}
	public void setFULECOUPONAMOUNT(BigDecimal fULECOUPONAMOUNT) {
		FULECOUPONAMOUNT = fULECOUPONAMOUNT;
	}
	public BigDecimal getFULEAMOUNT() {
		return FULEAMOUNT;
	}
	public void setFULEAMOUNT(BigDecimal fULEAMOUNT) {
		FULEAMOUNT = fULEAMOUNT;
	}
	public String getCARLICENSE() {
		return CARLICENSE;
	}
	public void setCARLICENSE(String cARLICENSE) {
		CARLICENSE = cARLICENSE;
	}
	public String getOILGUNNO() {
		return OILGUNNO;
	}
	public void setOILGUNNO(String oILGUNNO) {
		OILGUNNO = oILGUNNO;
	}
	public BigDecimal getORDER_STATE() {
		return ORDER_STATE;
	}
	public void setORDER_STATE(BigDecimal oRDER_STATE) {
		ORDER_STATE = oRDER_STATE;
	}
	public String getEPSCODE() {
		return EPSCODE;
	}
	public void setEPSCODE(String ePSCODE) {
		EPSCODE = ePSCODE;
	}
	public String getPPSORDERNUMBER() {
		return PPSORDERNUMBER;
	}
	public void setPPSORDERNUMBER(String pPSORDERNUMBER) {
		PPSORDERNUMBER = pPSORDERNUMBER;
	}
	public TblOrderdetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TblOrderdetails(BigDecimal orderdetailsId, BigDecimal version,
			String nowdate, BigDecimal virtualgoodsid, String returncode,
			BigDecimal litre, String stationcode, BigDecimal couponamount,
			String requestId, String ordernum, BigDecimal realamount,
			String oilcode, BigDecimal orderDeal, BigDecimal discountamount,
			BigDecimal carduserid, BigDecimal amount, BigDecimal oilprice,
			String termnum, Date sendtime, String invoicetitle,
			String memberno, String virtualgoodsids, Integer customerId) {
		super();
		this.orderdetailsId = orderdetailsId;
		this.version = version;
		this.nowdate = nowdate;
		this.virtualgoodsid = virtualgoodsid;
		this.returncode = returncode;
		this.litre = litre;
		this.stationcode = stationcode;
		this.couponamount = couponamount;
		this.requestId = requestId;
		this.ordernum = ordernum;
		this.realamount = realamount;
		this.oilcode = oilcode;
		this.orderDeal = orderDeal;
		this.discountamount = discountamount;
		this.carduserid = carduserid;
		this.amount = amount;
		this.oilprice = oilprice;
		this.termnum = termnum;
		this.sendtime = sendtime;
		this.invoicetitle = invoicetitle;
		this.memberno = memberno;
		this.virtualgoodsids = virtualgoodsids;
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "TblOrderdetails [orderdetailsId=" + orderdetailsId
				+ ", version=" + version + ", nowdate=" + nowdate
				+ ", virtualgoodsid=" + virtualgoodsid + ", returncode="
				+ returncode + ", litre=" + litre + ", stationcode="
				+ stationcode + ", couponamount=" + couponamount
				+ ", requestId=" + requestId + ", ordernum=" + ordernum
				+ ", realamount=" + realamount + ", oilcode=" + oilcode
				+ ", orderDeal=" + orderDeal + ", discountamount="
				+ discountamount + ", carduserid=" + carduserid + ", amount="
				+ amount + ", oilprice=" + oilprice + ", termnum=" + termnum
				+ ", sendtime=" + sendtime + ", invoicetitle=" + invoicetitle
				+ ", memberno=" + memberno + ", virtualgoodsids="
				+ virtualgoodsids + ", customerId=" + customerId + "]";
	}
	public BigDecimal getOrderdetailsId() {
		return orderdetailsId;
	}
	public void setOrderdetailsId(BigDecimal orderdetailsId) {
		this.orderdetailsId = orderdetailsId;
	}
	public BigDecimal getVersion() {
		return version;
	}
	public void setVersion(BigDecimal version) {
		this.version = version;
	}
	public String getNowdate() {
		return nowdate;
	}
	public void setNowdate(String nowdate) {
		this.nowdate = nowdate;
	}
	public BigDecimal getVirtualgoodsid() {
		return virtualgoodsid;
	}
	public void setVirtualgoodsid(BigDecimal virtualgoodsid) {
		this.virtualgoodsid = virtualgoodsid;
	}
	public String getReturncode() {
		return returncode;
	}
	public void setReturncode(String returncode) {
		this.returncode = returncode;
	}
	public BigDecimal getLitre() {
		return litre;
	}
	public void setLitre(BigDecimal litre) {
		this.litre = litre;
	}
	public String getStationcode() {
		return stationcode;
	}
	public void setStationcode(String stationcode) {
		this.stationcode = stationcode;
	}
	public BigDecimal getCouponamount() {
		return couponamount;
	}
	public void setCouponamount(BigDecimal couponamount) {
		this.couponamount = couponamount;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getOrdernum() {
		return ordernum;
	}
	public void setOrdernum(String ordernum) {
		this.ordernum = ordernum;
	}
	public BigDecimal getRealamount() {
		return realamount;
	}
	public void setRealamount(BigDecimal realamount) {
		this.realamount = realamount;
	}
	public String getOilcode() {
		return oilcode;
	}
	public void setOilcode(String oilcode) {
		this.oilcode = oilcode;
	}
	public BigDecimal getOrderDeal() {
		return orderDeal;
	}
	public void setOrderDeal(BigDecimal orderDeal) {
		this.orderDeal = orderDeal;
	}
	public BigDecimal getDiscountamount() {
		return discountamount;
	}
	public void setDiscountamount(BigDecimal discountamount) {
		this.discountamount = discountamount;
	}
	public BigDecimal getCarduserid() {
		return carduserid;
	}
	public void setCarduserid(BigDecimal carduserid) {
		this.carduserid = carduserid;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public BigDecimal getOilprice() {
		return oilprice;
	}
	public void setOilprice(BigDecimal oilprice) {
		this.oilprice = oilprice;
	}
	public String getTermnum() {
		return termnum;
	}
	public void setTermnum(String termnum) {
		this.termnum = termnum;
	}
	public Date getSendtime() {
		return sendtime;
	}
	public void setSendtime(Date sendtime) {
		this.sendtime = sendtime;
	}
	public String getInvoicetitle() {
		return invoicetitle;
	}
	public void setInvoicetitle(String invoicetitle) {
		this.invoicetitle = invoicetitle;
	}
	public String getMemberno() {
		return memberno;
	}
	public void setMemberno(String memberno) {
		this.memberno = memberno;
	}
	public String getVirtualgoodsids() {
		return virtualgoodsids;
	}
	public void setVirtualgoodsids(String virtualgoodsids) {
		this.virtualgoodsids = virtualgoodsids;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
}
