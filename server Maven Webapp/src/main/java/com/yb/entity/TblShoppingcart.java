package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TblShoppingcart implements Serializable{
	private BigDecimal shoppingcartId;
	private BigDecimal version;
	private Date createTime;
	private BigDecimal rulesetId;
	private BigDecimal carduserId;
	private BigDecimal integration;
	private BigDecimal customerLevel;
	private BigDecimal goodsnum;
	private BigDecimal virtualGoodsType;
	public TblShoppingcart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TblShoppingcart(BigDecimal shoppingcartId, BigDecimal version,
			Date createTime, BigDecimal rulesetId, BigDecimal carduserId,
			BigDecimal integration, BigDecimal customerLevel,
			BigDecimal goodsnum, BigDecimal virtualGoodsType) {
		super();
		this.shoppingcartId = shoppingcartId;
		this.version = version;
		this.createTime = createTime;
		this.rulesetId = rulesetId;
		this.carduserId = carduserId;
		this.integration = integration;
		this.customerLevel = customerLevel;
		this.goodsnum = goodsnum;
		this.virtualGoodsType = virtualGoodsType;
	}
	@Override
	public String toString() {
		return "TblShoppingcart [shoppingcartId=" + shoppingcartId
				+ ", version=" + version + ", createTime=" + createTime
				+ ", rulesetId=" + rulesetId + ", carduserId=" + carduserId
				+ ", integration=" + integration + ", customerLevel="
				+ customerLevel + ", goodsnum=" + goodsnum
				+ ", virtualGoodsType=" + virtualGoodsType + "]";
	}
	public BigDecimal getShoppingcartId() {
		return shoppingcartId;
	}
	public void setShoppingcartId(BigDecimal shoppingcartId) {
		this.shoppingcartId = shoppingcartId;
	}
	public BigDecimal getVersion() {
		return version;
	}
	public void setVersion(BigDecimal version) {
		this.version = version;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public BigDecimal getRulesetId() {
		return rulesetId;
	}
	public void setRulesetId(BigDecimal rulesetId) {
		this.rulesetId = rulesetId;
	}
	public BigDecimal getCarduserId() {
		return carduserId;
	}
	public void setCarduserId(BigDecimal carduserId) {
		this.carduserId = carduserId;
	}
	public BigDecimal getIntegration() {
		return integration;
	}
	public void setIntegration(BigDecimal integration) {
		this.integration = integration;
	}
	public BigDecimal getCustomerLevel() {
		return customerLevel;
	}
	public void setCustomerLevel(BigDecimal customerLevel) {
		this.customerLevel = customerLevel;
	}
	public BigDecimal getGoodsnum() {
		return goodsnum;
	}
	public void setGoodsnum(BigDecimal goodsnum) {
		this.goodsnum = goodsnum;
	}
	public BigDecimal getVirtualGoodsType() {
		return virtualGoodsType;
	}
	public void setVirtualGoodsType(BigDecimal virtualGoodsType) {
		this.virtualGoodsType = virtualGoodsType;
	}
	
}
