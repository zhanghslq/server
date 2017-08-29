package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TblOrder implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal orderId;
	private BigDecimal version;
	private BigDecimal amount;
	private String orderno;
	private BigDecimal tradeId;
	private BigDecimal carduserId;
	private Date createdate;
	private BigDecimal orderStatus;
	private Date updatedate;
	private String openId;
	public TblOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TblOrder(BigDecimal orderId, BigDecimal version, BigDecimal amount,
			String orderno, BigDecimal tradeId, BigDecimal carduserId,
			Date createdate, BigDecimal orderStatus, Date updatedate,
			String openId) {
		super();
		this.orderId = orderId;
		this.version = version;
		this.amount = amount;
		this.orderno = orderno;
		this.tradeId = tradeId;
		this.carduserId = carduserId;
		this.createdate = createdate;
		this.orderStatus = orderStatus;
		this.updatedate = updatedate;
		this.openId = openId;
	}
	@Override
	public String toString() {
		return "TblOrder [orderId=" + orderId + ", version=" + version
				+ ", amount=" + amount + ", orderno=" + orderno + ", tradeId="
				+ tradeId + ", carduserId=" + carduserId + ", createdate="
				+ createdate + ", orderStatus=" + orderStatus + ", updatedate="
				+ updatedate + ", openId=" + openId + "]";
	}
	public BigDecimal getOrderId() {
		return orderId;
	}
	public void setOrderId(BigDecimal orderId) {
		this.orderId = orderId;
	}
	public BigDecimal getVersion() {
		return version;
	}
	public void setVersion(BigDecimal version) {
		this.version = version;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getOrderno() {
		return orderno;
	}
	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}
	public BigDecimal getTradeId() {
		return tradeId;
	}
	public void setTradeId(BigDecimal tradeId) {
		this.tradeId = tradeId;
	}
	public BigDecimal getCarduserId() {
		return carduserId;
	}
	public void setCarduserId(BigDecimal carduserId) {
		this.carduserId = carduserId;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public BigDecimal getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(BigDecimal orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	
}
