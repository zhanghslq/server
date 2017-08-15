package com.yb.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TblTrade {
	private BigDecimal tradeId;
	private BigDecimal version;
	private Date originaldate;
	private BigDecimal psamasn;
	private BigDecimal offlinetxno;
	private BigDecimal adjustType;
	private BigDecimal graytradeid;
	private BigDecimal realamount;
	private BigDecimal cardlocId;
	private BigDecimal activityid;
	private BigDecimal amount;
	private BigDecimal banlance;
	private BigDecimal operId;
	private BigDecimal isinvoice;
	private BigDecimal subaccounttype;
	private BigDecimal tradeStatus;
	private BigDecimal virtualgoodsid;
	private BigDecimal invoiceType;
	private String ordernum;
	private Date recordtime;
	private BigDecimal customerLevel;
	private BigDecimal cardtype;
	private BigDecimal operno;
	private BigDecimal discount;
	private BigDecimal price;
	private BigDecimal issuerId;
	private BigDecimal relatedid;
	private BigDecimal chequeid;
	private BigDecimal carduserId;
	private BigDecimal payType;
	private String banktrace;
	private BigDecimal carduserType;
	private BigDecimal tradeType;
	private BigDecimal volumn;
	private BigDecimal bringpointsid;
	private BigDecimal giftId;
	private String banktermid;
	private BigDecimal goodscategoryId;
	private BigDecimal blackinterval;
	private BigDecimal acquirerId;
	private BigDecimal orgId;
	private String uniqueid;
	private Date occurtime;
	private Date businessdate;
	private BigDecimal batchno;
	private BigDecimal eftsn;
	private BigDecimal rpossn;
	private BigDecimal maintradeid;
	private BigDecimal deposittype;
	private BigDecimal eftno;
	private BigDecimal subtradetype;
	private BigDecimal cardasn;
	private String pointdescription;
	private BigDecimal cardtxno;
	private String bankcard;
	private BigDecimal rulesetid;
	private BigDecimal baseAccountType;
	private String rposno;
	private BigDecimal epssn;
	private BigDecimal accounttype;
	private BigDecimal errorType;
	private BigDecimal accountId;
	public TblTrade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TblTrade(BigDecimal tradeId, BigDecimal version, Date originaldate,
			BigDecimal psamasn, BigDecimal offlinetxno, BigDecimal adjustType,
			BigDecimal graytradeid, BigDecimal realamount,
			BigDecimal cardlocId, BigDecimal activityid, BigDecimal amount,
			BigDecimal banlance, BigDecimal operId, BigDecimal isinvoice,
			BigDecimal subaccounttype, BigDecimal tradeStatus,
			BigDecimal virtualgoodsid, BigDecimal invoiceType, String ordernum,
			Date recordtime, BigDecimal customerLevel, BigDecimal cardtype,
			BigDecimal operno, BigDecimal discount, BigDecimal price,
			BigDecimal issuerId, BigDecimal relatedid, BigDecimal chequeid,
			BigDecimal carduserId, BigDecimal payType, String banktrace,
			BigDecimal carduserType, BigDecimal tradeType, BigDecimal volumn,
			BigDecimal bringpointsid, BigDecimal giftId, String banktermid,
			BigDecimal goodscategoryId, BigDecimal blackinterval,
			BigDecimal acquirerId, BigDecimal orgId, String uniqueid,
			Date occurtime, Date businessdate, BigDecimal batchno,
			BigDecimal eftsn, BigDecimal rpossn, BigDecimal maintradeid,
			BigDecimal deposittype, BigDecimal eftno, BigDecimal subtradetype,
			BigDecimal cardasn, String pointdescription, BigDecimal cardtxno,
			String bankcard, BigDecimal rulesetid, BigDecimal baseAccountType,
			String rposno, BigDecimal epssn, BigDecimal accounttype,
			BigDecimal errorType, BigDecimal accountId) {
		super();
		this.tradeId = tradeId;
		this.version = version;
		this.originaldate = originaldate;
		this.psamasn = psamasn;
		this.offlinetxno = offlinetxno;
		this.adjustType = adjustType;
		this.graytradeid = graytradeid;
		this.realamount = realamount;
		this.cardlocId = cardlocId;
		this.activityid = activityid;
		this.amount = amount;
		this.banlance = banlance;
		this.operId = operId;
		this.isinvoice = isinvoice;
		this.subaccounttype = subaccounttype;
		this.tradeStatus = tradeStatus;
		this.virtualgoodsid = virtualgoodsid;
		this.invoiceType = invoiceType;
		this.ordernum = ordernum;
		this.recordtime = recordtime;
		this.customerLevel = customerLevel;
		this.cardtype = cardtype;
		this.operno = operno;
		this.discount = discount;
		this.price = price;
		this.issuerId = issuerId;
		this.relatedid = relatedid;
		this.chequeid = chequeid;
		this.carduserId = carduserId;
		this.payType = payType;
		this.banktrace = banktrace;
		this.carduserType = carduserType;
		this.tradeType = tradeType;
		this.volumn = volumn;
		this.bringpointsid = bringpointsid;
		this.giftId = giftId;
		this.banktermid = banktermid;
		this.goodscategoryId = goodscategoryId;
		this.blackinterval = blackinterval;
		this.acquirerId = acquirerId;
		this.orgId = orgId;
		this.uniqueid = uniqueid;
		this.occurtime = occurtime;
		this.businessdate = businessdate;
		this.batchno = batchno;
		this.eftsn = eftsn;
		this.rpossn = rpossn;
		this.maintradeid = maintradeid;
		this.deposittype = deposittype;
		this.eftno = eftno;
		this.subtradetype = subtradetype;
		this.cardasn = cardasn;
		this.pointdescription = pointdescription;
		this.cardtxno = cardtxno;
		this.bankcard = bankcard;
		this.rulesetid = rulesetid;
		this.baseAccountType = baseAccountType;
		this.rposno = rposno;
		this.epssn = epssn;
		this.accounttype = accounttype;
		this.errorType = errorType;
		this.accountId = accountId;
	}
	@Override
	public String toString() {
		return "TblTrade [tradeId=" + tradeId + ", version=" + version
				+ ", originaldate=" + originaldate + ", psamasn=" + psamasn
				+ ", offlinetxno=" + offlinetxno + ", adjustType=" + adjustType
				+ ", graytradeid=" + graytradeid + ", realamount=" + realamount
				+ ", cardlocId=" + cardlocId + ", activityid=" + activityid
				+ ", amount=" + amount + ", banlance=" + banlance + ", operId="
				+ operId + ", isinvoice=" + isinvoice + ", subaccounttype="
				+ subaccounttype + ", tradeStatus=" + tradeStatus
				+ ", virtualgoodsid=" + virtualgoodsid + ", invoiceType="
				+ invoiceType + ", ordernum=" + ordernum + ", recordtime="
				+ recordtime + ", customerLevel=" + customerLevel
				+ ", cardtype=" + cardtype + ", operno=" + operno
				+ ", discount=" + discount + ", price=" + price + ", issuerId="
				+ issuerId + ", relatedid=" + relatedid + ", chequeid="
				+ chequeid + ", carduserId=" + carduserId + ", payType="
				+ payType + ", banktrace=" + banktrace + ", carduserType="
				+ carduserType + ", tradeType=" + tradeType + ", volumn="
				+ volumn + ", bringpointsid=" + bringpointsid + ", giftId="
				+ giftId + ", banktermid=" + banktermid + ", goodscategoryId="
				+ goodscategoryId + ", blackinterval=" + blackinterval
				+ ", acquirerId=" + acquirerId + ", orgId=" + orgId
				+ ", uniqueid=" + uniqueid + ", occurtime=" + occurtime
				+ ", businessdate=" + businessdate + ", batchno=" + batchno
				+ ", eftsn=" + eftsn + ", rpossn=" + rpossn + ", maintradeid="
				+ maintradeid + ", deposittype=" + deposittype + ", eftno="
				+ eftno + ", subtradetype=" + subtradetype + ", cardasn="
				+ cardasn + ", pointdescription=" + pointdescription
				+ ", cardtxno=" + cardtxno + ", bankcard=" + bankcard
				+ ", rulesetid=" + rulesetid + ", baseAccountType="
				+ baseAccountType + ", rposno=" + rposno + ", epssn=" + epssn
				+ ", accounttype=" + accounttype + ", errorType=" + errorType
				+ ", accountId=" + accountId + "]";
	}
	public BigDecimal getTradeId() {
		return tradeId;
	}
	public void setTradeId(BigDecimal tradeId) {
		this.tradeId = tradeId;
	}
	public BigDecimal getVersion() {
		return version;
	}
	public void setVersion(BigDecimal version) {
		this.version = version;
	}
	public Date getOriginaldate() {
		return originaldate;
	}
	public void setOriginaldate(Date originaldate) {
		this.originaldate = originaldate;
	}
	public BigDecimal getPsamasn() {
		return psamasn;
	}
	public void setPsamasn(BigDecimal psamasn) {
		this.psamasn = psamasn;
	}
	public BigDecimal getOfflinetxno() {
		return offlinetxno;
	}
	public void setOfflinetxno(BigDecimal offlinetxno) {
		this.offlinetxno = offlinetxno;
	}
	public BigDecimal getAdjustType() {
		return adjustType;
	}
	public void setAdjustType(BigDecimal adjustType) {
		this.adjustType = adjustType;
	}
	public BigDecimal getGraytradeid() {
		return graytradeid;
	}
	public void setGraytradeid(BigDecimal graytradeid) {
		this.graytradeid = graytradeid;
	}
	public BigDecimal getRealamount() {
		return realamount;
	}
	public void setRealamount(BigDecimal realamount) {
		this.realamount = realamount;
	}
	public BigDecimal getCardlocId() {
		return cardlocId;
	}
	public void setCardlocId(BigDecimal cardlocId) {
		this.cardlocId = cardlocId;
	}
	public BigDecimal getActivityid() {
		return activityid;
	}
	public void setActivityid(BigDecimal activityid) {
		this.activityid = activityid;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public BigDecimal getBanlance() {
		return banlance;
	}
	public void setBanlance(BigDecimal banlance) {
		this.banlance = banlance;
	}
	public BigDecimal getOperId() {
		return operId;
	}
	public void setOperId(BigDecimal operId) {
		this.operId = operId;
	}
	public BigDecimal getIsinvoice() {
		return isinvoice;
	}
	public void setIsinvoice(BigDecimal isinvoice) {
		this.isinvoice = isinvoice;
	}
	public BigDecimal getSubaccounttype() {
		return subaccounttype;
	}
	public void setSubaccounttype(BigDecimal subaccounttype) {
		this.subaccounttype = subaccounttype;
	}
	public BigDecimal getTradeStatus() {
		return tradeStatus;
	}
	public void setTradeStatus(BigDecimal tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public BigDecimal getVirtualgoodsid() {
		return virtualgoodsid;
	}
	public void setVirtualgoodsid(BigDecimal virtualgoodsid) {
		this.virtualgoodsid = virtualgoodsid;
	}
	public BigDecimal getInvoiceType() {
		return invoiceType;
	}
	public void setInvoiceType(BigDecimal invoiceType) {
		this.invoiceType = invoiceType;
	}
	public String getOrdernum() {
		return ordernum;
	}
	public void setOrdernum(String ordernum) {
		this.ordernum = ordernum;
	}
	public Date getRecordtime() {
		return recordtime;
	}
	public void setRecordtime(Date recordtime) {
		this.recordtime = recordtime;
	}
	public BigDecimal getCustomerLevel() {
		return customerLevel;
	}
	public void setCustomerLevel(BigDecimal customerLevel) {
		this.customerLevel = customerLevel;
	}
	public BigDecimal getCardtype() {
		return cardtype;
	}
	public void setCardtype(BigDecimal cardtype) {
		this.cardtype = cardtype;
	}
	public BigDecimal getOperno() {
		return operno;
	}
	public void setOperno(BigDecimal operno) {
		this.operno = operno;
	}
	public BigDecimal getDiscount() {
		return discount;
	}
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getIssuerId() {
		return issuerId;
	}
	public void setIssuerId(BigDecimal issuerId) {
		this.issuerId = issuerId;
	}
	public BigDecimal getRelatedid() {
		return relatedid;
	}
	public void setRelatedid(BigDecimal relatedid) {
		this.relatedid = relatedid;
	}
	public BigDecimal getChequeid() {
		return chequeid;
	}
	public void setChequeid(BigDecimal chequeid) {
		this.chequeid = chequeid;
	}
	public BigDecimal getCarduserId() {
		return carduserId;
	}
	public void setCarduserId(BigDecimal carduserId) {
		this.carduserId = carduserId;
	}
	public BigDecimal getPayType() {
		return payType;
	}
	public void setPayType(BigDecimal payType) {
		this.payType = payType;
	}
	public String getBanktrace() {
		return banktrace;
	}
	public void setBanktrace(String banktrace) {
		this.banktrace = banktrace;
	}
	public BigDecimal getCarduserType() {
		return carduserType;
	}
	public void setCarduserType(BigDecimal carduserType) {
		this.carduserType = carduserType;
	}
	public BigDecimal getTradeType() {
		return tradeType;
	}
	public void setTradeType(BigDecimal tradeType) {
		this.tradeType = tradeType;
	}
	public BigDecimal getVolumn() {
		return volumn;
	}
	public void setVolumn(BigDecimal volumn) {
		this.volumn = volumn;
	}
	public BigDecimal getBringpointsid() {
		return bringpointsid;
	}
	public void setBringpointsid(BigDecimal bringpointsid) {
		this.bringpointsid = bringpointsid;
	}
	public BigDecimal getGiftId() {
		return giftId;
	}
	public void setGiftId(BigDecimal giftId) {
		this.giftId = giftId;
	}
	public String getBanktermid() {
		return banktermid;
	}
	public void setBanktermid(String banktermid) {
		this.banktermid = banktermid;
	}
	public BigDecimal getGoodscategoryId() {
		return goodscategoryId;
	}
	public void setGoodscategoryId(BigDecimal goodscategoryId) {
		this.goodscategoryId = goodscategoryId;
	}
	public BigDecimal getBlackinterval() {
		return blackinterval;
	}
	public void setBlackinterval(BigDecimal blackinterval) {
		this.blackinterval = blackinterval;
	}
	public BigDecimal getAcquirerId() {
		return acquirerId;
	}
	public void setAcquirerId(BigDecimal acquirerId) {
		this.acquirerId = acquirerId;
	}
	public BigDecimal getOrgId() {
		return orgId;
	}
	public void setOrgId(BigDecimal orgId) {
		this.orgId = orgId;
	}
	public String getUniqueid() {
		return uniqueid;
	}
	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}
	public Date getOccurtime() {
		return occurtime;
	}
	public void setOccurtime(Date occurtime) {
		this.occurtime = occurtime;
	}
	public Date getBusinessdate() {
		return businessdate;
	}
	public void setBusinessdate(Date businessdate) {
		this.businessdate = businessdate;
	}
	public BigDecimal getBatchno() {
		return batchno;
	}
	public void setBatchno(BigDecimal batchno) {
		this.batchno = batchno;
	}
	public BigDecimal getEftsn() {
		return eftsn;
	}
	public void setEftsn(BigDecimal eftsn) {
		this.eftsn = eftsn;
	}
	public BigDecimal getRpossn() {
		return rpossn;
	}
	public void setRpossn(BigDecimal rpossn) {
		this.rpossn = rpossn;
	}
	public BigDecimal getMaintradeid() {
		return maintradeid;
	}
	public void setMaintradeid(BigDecimal maintradeid) {
		this.maintradeid = maintradeid;
	}
	public BigDecimal getDeposittype() {
		return deposittype;
	}
	public void setDeposittype(BigDecimal deposittype) {
		this.deposittype = deposittype;
	}
	public BigDecimal getEftno() {
		return eftno;
	}
	public void setEftno(BigDecimal eftno) {
		this.eftno = eftno;
	}
	public BigDecimal getSubtradetype() {
		return subtradetype;
	}
	public void setSubtradetype(BigDecimal subtradetype) {
		this.subtradetype = subtradetype;
	}
	public BigDecimal getCardasn() {
		return cardasn;
	}
	public void setCardasn(BigDecimal cardasn) {
		this.cardasn = cardasn;
	}
	public String getPointdescription() {
		return pointdescription;
	}
	public void setPointdescription(String pointdescription) {
		this.pointdescription = pointdescription;
	}
	public BigDecimal getCardtxno() {
		return cardtxno;
	}
	public void setCardtxno(BigDecimal cardtxno) {
		this.cardtxno = cardtxno;
	}
	public String getBankcard() {
		return bankcard;
	}
	public void setBankcard(String bankcard) {
		this.bankcard = bankcard;
	}
	public BigDecimal getRulesetid() {
		return rulesetid;
	}
	public void setRulesetid(BigDecimal rulesetid) {
		this.rulesetid = rulesetid;
	}
	public BigDecimal getBaseAccountType() {
		return baseAccountType;
	}
	public void setBaseAccountType(BigDecimal baseAccountType) {
		this.baseAccountType = baseAccountType;
	}
	public String getRposno() {
		return rposno;
	}
	public void setRposno(String rposno) {
		this.rposno = rposno;
	}
	public BigDecimal getEpssn() {
		return epssn;
	}
	public void setEpssn(BigDecimal epssn) {
		this.epssn = epssn;
	}
	public BigDecimal getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(BigDecimal accounttype) {
		this.accounttype = accounttype;
	}
	public BigDecimal getErrorType() {
		return errorType;
	}
	public void setErrorType(BigDecimal errorType) {
		this.errorType = errorType;
	}
	public BigDecimal getAccountId() {
		return accountId;
	}
	public void setAccountId(BigDecimal accountId) {
		this.accountId = accountId;
	}
	
	
}
