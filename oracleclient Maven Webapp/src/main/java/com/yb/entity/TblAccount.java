package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TblAccount implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal accountId;
	private BigDecimal version;
	private Date lastcardTime;
	private Date expireddate;
	private Date lastrecordtime;
	private BigDecimal accountStatus;
	private BigDecimal previousonlineno;
	private BigDecimal lowlimit;
	private BigDecimal frozenpoints;
	private String mac;
	private BigDecimal accounttype;
	private BigDecimal lasttxid;
	private BigDecimal lasttxstatus;
	private BigDecimal balance;
	private BigDecimal num;
	private BigDecimal pointsused;
	private BigDecimal issuerId;
	private BigDecimal carduserId;
	private BigDecimal lastonlineno;
	private BigDecimal accumulativepoints;
	private BigDecimal cardId;
	private BigDecimal totallostamount;
	public TblAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TblAccount(BigDecimal accountId, BigDecimal version,
			Date lastcardTime, Date expireddate, Date lastrecordtime,
			BigDecimal accountStatus, BigDecimal previousonlineno,
			BigDecimal lowlimit, BigDecimal frozenpoints, String mac,
			BigDecimal accounttype, BigDecimal lasttxid,
			BigDecimal lasttxstatus, BigDecimal balance, BigDecimal num,
			BigDecimal pointsused, BigDecimal issuerId, BigDecimal carduserId,
			BigDecimal lastonlineno, BigDecimal accumulativepoints,
			BigDecimal cardId, BigDecimal totallostamount) {
		super();
		this.accountId = accountId;
		this.version = version;
		this.lastcardTime = lastcardTime;
		this.expireddate = expireddate;
		this.lastrecordtime = lastrecordtime;
		this.accountStatus = accountStatus;
		this.previousonlineno = previousonlineno;
		this.lowlimit = lowlimit;
		this.frozenpoints = frozenpoints;
		this.mac = mac;
		this.accounttype = accounttype;
		this.lasttxid = lasttxid;
		this.lasttxstatus = lasttxstatus;
		this.balance = balance;
		this.num = num;
		this.pointsused = pointsused;
		this.issuerId = issuerId;
		this.carduserId = carduserId;
		this.lastonlineno = lastonlineno;
		this.accumulativepoints = accumulativepoints;
		this.cardId = cardId;
		this.totallostamount = totallostamount;
	}
	@Override
	public String toString() {
		return "TblAccount [accountId=" + accountId + ", version=" + version
				+ ", lastcardTime=" + lastcardTime + ", expireddate="
				+ expireddate + ", lastrecordtime=" + lastrecordtime
				+ ", accountStatus=" + accountStatus + ", previousonlineno="
				+ previousonlineno + ", lowlimit=" + lowlimit
				+ ", frozenpoints=" + frozenpoints + ", mac=" + mac
				+ ", accounttype=" + accounttype + ", lasttxid=" + lasttxid
				+ ", lasttxstatus=" + lasttxstatus + ", balance=" + balance
				+ ", num=" + num + ", pointsused=" + pointsused + ", issuerId="
				+ issuerId + ", carduserId=" + carduserId + ", lastonlineno="
				+ lastonlineno + ", accumulativepoints=" + accumulativepoints
				+ ", cardId=" + cardId + ", totallostamount=" + totallostamount
				+ "]";
	}
	public BigDecimal getAccountId() {
		return accountId;
	}
	public void setAccountId(BigDecimal accountId) {
		this.accountId = accountId;
	}
	public BigDecimal getVersion() {
		return version;
	}
	public void setVersion(BigDecimal version) {
		this.version = version;
	}
	public Date getLastcardTime() {
		return lastcardTime;
	}
	public void setLastcardTime(Date lastcardTime) {
		this.lastcardTime = lastcardTime;
	}
	public Date getExpireddate() {
		return expireddate;
	}
	public void setExpireddate(Date expireddate) {
		this.expireddate = expireddate;
	}
	public Date getLastrecordtime() {
		return lastrecordtime;
	}
	public void setLastrecordtime(Date lastrecordtime) {
		this.lastrecordtime = lastrecordtime;
	}
	public BigDecimal getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(BigDecimal accountStatus) {
		this.accountStatus = accountStatus;
	}
	public BigDecimal getPreviousonlineno() {
		return previousonlineno;
	}
	public void setPreviousonlineno(BigDecimal previousonlineno) {
		this.previousonlineno = previousonlineno;
	}
	public BigDecimal getLowlimit() {
		return lowlimit;
	}
	public void setLowlimit(BigDecimal lowlimit) {
		this.lowlimit = lowlimit;
	}
	public BigDecimal getFrozenpoints() {
		return frozenpoints;
	}
	public void setFrozenpoints(BigDecimal frozenpoints) {
		this.frozenpoints = frozenpoints;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public BigDecimal getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(BigDecimal accounttype) {
		this.accounttype = accounttype;
	}
	public BigDecimal getLasttxid() {
		return lasttxid;
	}
	public void setLasttxid(BigDecimal lasttxid) {
		this.lasttxid = lasttxid;
	}
	public BigDecimal getLasttxstatus() {
		return lasttxstatus;
	}
	public void setLasttxstatus(BigDecimal lasttxstatus) {
		this.lasttxstatus = lasttxstatus;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public BigDecimal getNum() {
		return num;
	}
	public void setNum(BigDecimal num) {
		this.num = num;
	}
	public BigDecimal getPointsused() {
		return pointsused;
	}
	public void setPointsused(BigDecimal pointsused) {
		this.pointsused = pointsused;
	}
	public BigDecimal getIssuerId() {
		return issuerId;
	}
	public void setIssuerId(BigDecimal issuerId) {
		this.issuerId = issuerId;
	}
	public BigDecimal getCarduserId() {
		return carduserId;
	}
	public void setCarduserId(BigDecimal carduserId) {
		this.carduserId = carduserId;
	}
	public BigDecimal getLastonlineno() {
		return lastonlineno;
	}
	public void setLastonlineno(BigDecimal lastonlineno) {
		this.lastonlineno = lastonlineno;
	}
	public BigDecimal getAccumulativepoints() {
		return accumulativepoints;
	}
	public void setAccumulativepoints(BigDecimal accumulativepoints) {
		this.accumulativepoints = accumulativepoints;
	}
	public BigDecimal getCardId() {
		return cardId;
	}
	public void setCardId(BigDecimal cardId) {
		this.cardId = cardId;
	}
	public BigDecimal getTotallostamount() {
		return totallostamount;
	}
	public void setTotallostamount(BigDecimal totallostamount) {
		this.totallostamount = totallostamount;
	}
}
