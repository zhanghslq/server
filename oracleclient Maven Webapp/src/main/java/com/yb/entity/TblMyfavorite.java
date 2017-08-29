package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class TblMyfavorite implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal myfavoriteId;
	private BigDecimal version;
	private BigDecimal orgid;
	private BigDecimal cusid;
	public TblMyfavorite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TblMyfavorite(BigDecimal myfavoriteId, BigDecimal version,
			BigDecimal orgid, BigDecimal cusid) {
		super();
		this.myfavoriteId = myfavoriteId;
		this.version = version;
		this.orgid = orgid;
		this.cusid = cusid;
	}
	@Override
	public String toString() {
		return "TblMyfavorite [myfavoriteId=" + myfavoriteId + ", version="
				+ version + ", orgid=" + orgid + ", cusid=" + cusid + "]";
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
	public BigDecimal getCusid() {
		return cusid;
	}
	public void setCusid(BigDecimal cusid) {
		this.cusid = cusid;
	}
	
}
