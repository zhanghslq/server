package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class TblShopgoodsdetails implements Serializable{
	private BigDecimal shopgoodsdetailsId;
	private BigDecimal version;
	private String member;
	private String amount;
	private String receivedate;
	private BigDecimal orderdetailsId;
	private String remark;
	private String totalamount;
	private String ordernum;
	private String unitprice;
	private String quantity;
	private String code;
	private String discount;
	public TblShopgoodsdetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TblShopgoodsdetails(BigDecimal shopgoodsdetailsId,
			BigDecimal version, String member, String amount,
			String receivedate, BigDecimal orderdetailsId, String remark,
			String totalamount, String ordernum, String unitprice,
			String quantity, String code, String discount) {
		super();
		this.shopgoodsdetailsId = shopgoodsdetailsId;
		this.version = version;
		this.member = member;
		this.amount = amount;
		this.receivedate = receivedate;
		this.orderdetailsId = orderdetailsId;
		this.remark = remark;
		this.totalamount = totalamount;
		this.ordernum = ordernum;
		this.unitprice = unitprice;
		this.quantity = quantity;
		this.code = code;
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "TblShopgooddetails [shopgoodsdetailsId=" + shopgoodsdetailsId
				+ ", version=" + version + ", member=" + member + ", amount="
				+ amount + ", receivedate=" + receivedate + ", orderdetailsId="
				+ orderdetailsId + ", remark=" + remark + ", totalamount="
				+ totalamount + ", ordernum=" + ordernum + ", unitprice="
				+ unitprice + ", quantity=" + quantity + ", code=" + code
				+ ", discount=" + discount + "]";
	}
	public BigDecimal getShopgoodsdetailsId() {
		return shopgoodsdetailsId;
	}
	public void setShopgoodsdetailsId(BigDecimal shopgoodsdetailsId) {
		this.shopgoodsdetailsId = shopgoodsdetailsId;
	}
	public BigDecimal getVersion() {
		return version;
	}
	public void setVersion(BigDecimal version) {
		this.version = version;
	}
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getReceivedate() {
		return receivedate;
	}
	public void setReceivedate(String receivedate) {
		this.receivedate = receivedate;
	}
	public BigDecimal getOrderdetailsId() {
		return orderdetailsId;
	}
	public void setOrderdetailsId(BigDecimal orderdetailsId) {
		this.orderdetailsId = orderdetailsId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(String totalamount) {
		this.totalamount = totalamount;
	}
	public String getOrdernum() {
		return ordernum;
	}
	public void setOrdernum(String ordernum) {
		this.ordernum = ordernum;
	}
	public String getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(String unitprice) {
		this.unitprice = unitprice;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	
	
}
