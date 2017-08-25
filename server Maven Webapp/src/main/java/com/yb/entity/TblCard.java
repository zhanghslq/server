package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TblCard implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal cardId;
	private BigDecimal version;
	private BigDecimal templetId;
	private Date unblacktime;
	private BigDecimal shopId;
	private Date blacktime;
	private BigDecimal locationId;
	private String mac;
	private BigDecimal typeId;
	private BigDecimal foregiftamount;
	private BigDecimal terminalid;
	private Date revocationtime;
	private String blackreason;
	private BigDecimal storelocationId;
	private Date effectivedate;
	private BigDecimal cardpackId;
	private BigDecimal cardStatus;
	private Date issuetime;
	private BigDecimal baseCardType;
	private BigDecimal targetorgId;
	private BigDecimal ukeyoperatorId;
	private BigDecimal blacktype;
	private BigDecimal cardstoreStatus;
	private BigDecimal tradel;
	private Date expiredtime;
	private BigDecimal carduserId;
	private BigDecimal asn;
	private Date nowDate;
	public TblCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TblCard(BigDecimal cardId, BigDecimal version, BigDecimal templetId,
			Date unblacktime, BigDecimal shopId, Date blacktime,
			BigDecimal locationId, String mac, BigDecimal typeId,
			BigDecimal foregiftamount, BigDecimal terminalid,
			Date revocationtime, String blackreason,
			BigDecimal storelocationId, Date effectivedate,
			BigDecimal cardpackId, BigDecimal cardStatus, Date issuetime,
			BigDecimal baseCardType, BigDecimal targetorgId,
			BigDecimal ukeyoperatorId, BigDecimal blacktype,
			BigDecimal cardstoreStatus, BigDecimal tradel, Date expiredtime,
			BigDecimal carduserId, BigDecimal asn, Date nowDate) {
		super();
		this.cardId = cardId;
		this.version = version;
		this.templetId = templetId;
		this.unblacktime = unblacktime;
		this.shopId = shopId;
		this.blacktime = blacktime;
		this.locationId = locationId;
		this.mac = mac;
		this.typeId = typeId;
		this.foregiftamount = foregiftamount;
		this.terminalid = terminalid;
		this.revocationtime = revocationtime;
		this.blackreason = blackreason;
		this.storelocationId = storelocationId;
		this.effectivedate = effectivedate;
		this.cardpackId = cardpackId;
		this.cardStatus = cardStatus;
		this.issuetime = issuetime;
		this.baseCardType = baseCardType;
		this.targetorgId = targetorgId;
		this.ukeyoperatorId = ukeyoperatorId;
		this.blacktype = blacktype;
		this.cardstoreStatus = cardstoreStatus;
		this.tradel = tradel;
		this.expiredtime = expiredtime;
		this.carduserId = carduserId;
		this.asn = asn;
		this.nowDate = nowDate;
	}
	@Override
	public String toString() {
		return "TblCard [cardId=" + cardId + ", version=" + version
				+ ", templetId=" + templetId + ", unblacktime=" + unblacktime
				+ ", shopId=" + shopId + ", blacktime=" + blacktime
				+ ", locationId=" + locationId + ", mac=" + mac + ", typeId="
				+ typeId + ", foregiftamount=" + foregiftamount
				+ ", terminalid=" + terminalid + ", revocationtime="
				+ revocationtime + ", blackreason=" + blackreason
				+ ", storelocationId=" + storelocationId + ", effectivedate="
				+ effectivedate + ", cardpackId=" + cardpackId
				+ ", cardStatus=" + cardStatus + ", issuetime=" + issuetime
				+ ", baseCardType=" + baseCardType + ", targetorgId="
				+ targetorgId + ", ukeyoperatorId=" + ukeyoperatorId
				+ ", blacktype=" + blacktype + ", cardstoreStatus="
				+ cardstoreStatus + ", tradel=" + tradel + ", expiredtime="
				+ expiredtime + ", carduserId=" + carduserId + ", asn=" + asn
				+ ", nowDate=" + nowDate + "]";
	}
	public BigDecimal getCardId() {
		return cardId;
	}
	public void setCardId(BigDecimal cardId) {
		this.cardId = cardId;
	}
	public BigDecimal getVersion() {
		return version;
	}
	public void setVersion(BigDecimal version) {
		this.version = version;
	}
	public BigDecimal getTempletId() {
		return templetId;
	}
	public void setTempletId(BigDecimal templetId) {
		this.templetId = templetId;
	}
	public Date getUnblacktime() {
		return unblacktime;
	}
	public void setUnblacktime(Date unblacktime) {
		this.unblacktime = unblacktime;
	}
	public BigDecimal getShopId() {
		return shopId;
	}
	public void setShopId(BigDecimal shopId) {
		this.shopId = shopId;
	}
	public Date getBlacktime() {
		return blacktime;
	}
	public void setBlacktime(Date blacktime) {
		this.blacktime = blacktime;
	}
	public BigDecimal getLocationId() {
		return locationId;
	}
	public void setLocationId(BigDecimal locationId) {
		this.locationId = locationId;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public BigDecimal getTypeId() {
		return typeId;
	}
	public void setTypeId(BigDecimal typeId) {
		this.typeId = typeId;
	}
	public BigDecimal getForegiftamount() {
		return foregiftamount;
	}
	public void setForegiftamount(BigDecimal foregiftamount) {
		this.foregiftamount = foregiftamount;
	}
	public BigDecimal getTerminalid() {
		return terminalid;
	}
	public void setTerminalid(BigDecimal terminalid) {
		this.terminalid = terminalid;
	}
	public Date getRevocationtime() {
		return revocationtime;
	}
	public void setRevocationtime(Date revocationtime) {
		this.revocationtime = revocationtime;
	}
	public String getBlackreason() {
		return blackreason;
	}
	public void setBlackreason(String blackreason) {
		this.blackreason = blackreason;
	}
	public BigDecimal getStorelocationId() {
		return storelocationId;
	}
	public void setStorelocationId(BigDecimal storelocationId) {
		this.storelocationId = storelocationId;
	}
	public Date getEffectivedate() {
		return effectivedate;
	}
	public void setEffectivedate(Date effectivedate) {
		this.effectivedate = effectivedate;
	}
	public BigDecimal getCardpackId() {
		return cardpackId;
	}
	public void setCardpackId(BigDecimal cardpackId) {
		this.cardpackId = cardpackId;
	}
	public BigDecimal getCardStatus() {
		return cardStatus;
	}
	public void setCardStatus(BigDecimal cardStatus) {
		this.cardStatus = cardStatus;
	}
	public Date getIssuetime() {
		return issuetime;
	}
	public void setIssuetime(Date issuetime) {
		this.issuetime = issuetime;
	}
	public BigDecimal getBaseCardType() {
		return baseCardType;
	}
	public void setBaseCardType(BigDecimal baseCardType) {
		this.baseCardType = baseCardType;
	}
	public BigDecimal getTargetorgId() {
		return targetorgId;
	}
	public void setTargetorgId(BigDecimal targetorgId) {
		this.targetorgId = targetorgId;
	}
	public BigDecimal getUkeyoperatorId() {
		return ukeyoperatorId;
	}
	public void setUkeyoperatorId(BigDecimal ukeyoperatorId) {
		this.ukeyoperatorId = ukeyoperatorId;
	}
	public BigDecimal getBlacktype() {
		return blacktype;
	}
	public void setBlacktype(BigDecimal blacktype) {
		this.blacktype = blacktype;
	}
	public BigDecimal getCardstoreStatus() {
		return cardstoreStatus;
	}
	public void setCardstoreStatus(BigDecimal cardstoreStatus) {
		this.cardstoreStatus = cardstoreStatus;
	}
	public BigDecimal getTradel() {
		return tradel;
	}
	public void setTradel(BigDecimal tradel) {
		this.tradel = tradel;
	}
	public Date getExpiredtime() {
		return expiredtime;
	}
	public void setExpiredtime(Date expiredtime) {
		this.expiredtime = expiredtime;
	}
	public BigDecimal getCarduserId() {
		return carduserId;
	}
	public void setCarduserId(BigDecimal carduserId) {
		this.carduserId = carduserId;
	}
	public BigDecimal getAsn() {
		return asn;
	}
	public void setAsn(BigDecimal asn) {
		this.asn = asn;
	}
	public Date getNowDate() {
		return nowDate;
	}
	public void setNowDate(Date nowDate) {
		this.nowDate = nowDate;
	}
	
	
}
