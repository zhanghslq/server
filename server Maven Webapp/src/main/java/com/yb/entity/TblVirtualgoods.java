package com.yb.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TblVirtualgoods {
	private BigDecimal virtualgoodsId;
	private BigDecimal version;
	private Date createtime;
	private String usestationlimit;
	private BigDecimal carduserId;
	private BigDecimal tradeid;
	private BigDecimal virtualGoodsStatus;
	private BigDecimal couponType;
	private String orguniqueid;
	private BigDecimal loweramount;
	private String stationlimit;
	private BigDecimal vitualGoodsType;
	private BigDecimal amount;
	private BigDecimal goodsRuleType;
	private BigDecimal relatedid;
	private BigDecimal integration;
	private BigDecimal ruleId;
	private BigDecimal goodsUseType;
	private Date expiredTime;
	private BigDecimal iscumsun;
	private String catcode;
	private BigDecimal goodsruleId;
	private BigDecimal discountrate;
	private Date effectivedate;
	private BigDecimal trueFalse;
	public TblVirtualgoods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TblVirtualgoods(BigDecimal virtualgoodsId, BigDecimal version,
			Date createtime, String usestationlimit, BigDecimal carduserId,
			BigDecimal tradeid, BigDecimal virtualGoodsStatus,
			BigDecimal couponType, String orguniqueid, BigDecimal loweramount,
			String stationlimit, BigDecimal vitualGoodsType, BigDecimal amount,
			BigDecimal goodsRuleType, BigDecimal relatedid,
			BigDecimal integration, BigDecimal ruleId, BigDecimal goodsUseType,
			Date expiredTime, BigDecimal iscumsun, String catcode,
			BigDecimal goodsruleId, BigDecimal discountrate,
			Date effectivedate, BigDecimal trueFalse) {
		super();
		this.virtualgoodsId = virtualgoodsId;
		this.version = version;
		this.createtime = createtime;
		this.usestationlimit = usestationlimit;
		this.carduserId = carduserId;
		this.tradeid = tradeid;
		this.virtualGoodsStatus = virtualGoodsStatus;
		this.couponType = couponType;
		this.orguniqueid = orguniqueid;
		this.loweramount = loweramount;
		this.stationlimit = stationlimit;
		this.vitualGoodsType = vitualGoodsType;
		this.amount = amount;
		this.goodsRuleType = goodsRuleType;
		this.relatedid = relatedid;
		this.integration = integration;
		this.ruleId = ruleId;
		this.goodsUseType = goodsUseType;
		this.expiredTime = expiredTime;
		this.iscumsun = iscumsun;
		this.catcode = catcode;
		this.goodsruleId = goodsruleId;
		this.discountrate = discountrate;
		this.effectivedate = effectivedate;
		this.trueFalse = trueFalse;
	}
	@Override
	public String toString() {
		return "TblVirtualGoods [virtualgoodsId=" + virtualgoodsId
				+ ", version=" + version + ", createtime=" + createtime
				+ ", usestationlimit=" + usestationlimit + ", carduserId="
				+ carduserId + ", tradeid=" + tradeid + ", virtualGoodsStatus="
				+ virtualGoodsStatus + ", couponType=" + couponType
				+ ", orguniqueid=" + orguniqueid + ", loweramount="
				+ loweramount + ", stationlimit=" + stationlimit
				+ ", vitualGoodsType=" + vitualGoodsType + ", amount=" + amount
				+ ", goodsRuleType=" + goodsRuleType + ", relatedid="
				+ relatedid + ", integration=" + integration + ", ruleId="
				+ ruleId + ", goodsUseType=" + goodsUseType + ", expiredTime="
				+ expiredTime + ", iscumsun=" + iscumsun + ", catcode="
				+ catcode + ", goodsruleId=" + goodsruleId + ", discountrate="
				+ discountrate + ", effectivedate=" + effectivedate
				+ ", trueFalse=" + trueFalse + "]";
	}
	public BigDecimal getVirtualgoodsId() {
		return virtualgoodsId;
	}
	public void setVirtualgoodsId(BigDecimal virtualgoodsId) {
		this.virtualgoodsId = virtualgoodsId;
	}
	public BigDecimal getVersion() {
		return version;
	}
	public void setVersion(BigDecimal version) {
		this.version = version;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getUsestationlimit() {
		return usestationlimit;
	}
	public void setUsestationlimit(String usestationlimit) {
		this.usestationlimit = usestationlimit;
	}
	public BigDecimal getCarduserId() {
		return carduserId;
	}
	public void setCarduserId(BigDecimal carduserId) {
		this.carduserId = carduserId;
	}
	public BigDecimal getTradeid() {
		return tradeid;
	}
	public void setTradeid(BigDecimal tradeid) {
		this.tradeid = tradeid;
	}
	public BigDecimal getVirtualGoodsStatus() {
		return virtualGoodsStatus;
	}
	public void setVirtualGoodsStatus(BigDecimal virtualGoodsStatus) {
		this.virtualGoodsStatus = virtualGoodsStatus;
	}
	public BigDecimal getCouponType() {
		return couponType;
	}
	public void setCouponType(BigDecimal couponType) {
		this.couponType = couponType;
	}
	public String getOrguniqueid() {
		return orguniqueid;
	}
	public void setOrguniqueid(String orguniqueid) {
		this.orguniqueid = orguniqueid;
	}
	public BigDecimal getLoweramount() {
		return loweramount;
	}
	public void setLoweramount(BigDecimal loweramount) {
		this.loweramount = loweramount;
	}
	public String getStationlimit() {
		return stationlimit;
	}
	public void setStationlimit(String stationlimit) {
		this.stationlimit = stationlimit;
	}
	public BigDecimal getVitualGoodsType() {
		return vitualGoodsType;
	}
	public void setVitualGoodsType(BigDecimal vitualGoodsType) {
		this.vitualGoodsType = vitualGoodsType;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public BigDecimal getGoodsRuleType() {
		return goodsRuleType;
	}
	public void setGoodsRuleType(BigDecimal goodsRuleType) {
		this.goodsRuleType = goodsRuleType;
	}
	public BigDecimal getRelatedid() {
		return relatedid;
	}
	public void setRelatedid(BigDecimal relatedid) {
		this.relatedid = relatedid;
	}
	public BigDecimal getIntegration() {
		return integration;
	}
	public void setIntegration(BigDecimal integration) {
		this.integration = integration;
	}
	public BigDecimal getRuleId() {
		return ruleId;
	}
	public void setRuleId(BigDecimal ruleId) {
		this.ruleId = ruleId;
	}
	public BigDecimal getGoodsUseType() {
		return goodsUseType;
	}
	public void setGoodsUseType(BigDecimal goodsUseType) {
		this.goodsUseType = goodsUseType;
	}
	public Date getExpiredTime() {
		return expiredTime;
	}
	public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}
	public BigDecimal getIscumsun() {
		return iscumsun;
	}
	public void setIscumsun(BigDecimal iscumsun) {
		this.iscumsun = iscumsun;
	}
	public String getCatcode() {
		return catcode;
	}
	public void setCatcode(String catcode) {
		this.catcode = catcode;
	}
	public BigDecimal getGoodsruleId() {
		return goodsruleId;
	}
	public void setGoodsruleId(BigDecimal goodsruleId) {
		this.goodsruleId = goodsruleId;
	}
	public BigDecimal getDiscountrate() {
		return discountrate;
	}
	public void setDiscountrate(BigDecimal discountrate) {
		this.discountrate = discountrate;
	}
	public Date getEffectivedate() {
		return effectivedate;
	}
	public void setEffectivedate(Date effectivedate) {
		this.effectivedate = effectivedate;
	}
	public BigDecimal getTrueFalse() {
		return trueFalse;
	}
	public void setTrueFalse(BigDecimal trueFalse) {
		this.trueFalse = trueFalse;
	}
	
}
