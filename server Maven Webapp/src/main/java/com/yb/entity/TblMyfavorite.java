package com.yb.entity;

import java.math.BigDecimal;

public class TblMyfavorite {
	private BigDecimal myfavoriteId;
	private BigDecimal version;
	private BigDecimal orgid;
	private BigDecimal carduserId;
	public TblMyfavorite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TblMyfavorite(BigDecimal myfavoriteId, BigDecimal version,
			BigDecimal orgid, BigDecimal carduserId) {
		super();
		this.myfavoriteId = myfavoriteId;
		this.version = version;
		this.orgid = orgid;
		this.carduserId = carduserId;
	}
	@Override
	public String toString() {
		return "TblMyfavorite [myfavoriteId=" + myfavoriteId + ", version="
				+ version + ", orgid=" + orgid + ", carduserId=" + carduserId
				+ "]";
	}
	public BigDecimal getMyfavoriteId() {
		return myfavoriteId;
	}
	public void setMyfavoriteId(BigDecimal myfavoriteId) {
		this.myfavoriteId = myfavoriteId;
	}
	public BigDecimal getVersion() {
		return version;
	}
	public void setVersion(BigDecimal version) {
		this.version = version;
	}
	public BigDecimal getOrgid() {
		return orgid;
	}
	public void setOrgid(BigDecimal orgid) {
		this.orgid = orgid;
	}
	public BigDecimal getCarduserId() {
		return carduserId;
	}
	public void setCarduserId(BigDecimal carduserId) {
		this.carduserId = carduserId;
	}
	
}
