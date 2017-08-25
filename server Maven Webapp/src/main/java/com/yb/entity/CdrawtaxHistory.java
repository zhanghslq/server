package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class CdrawtaxHistory implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer cdrawPeriodId;
	private Integer taxId;
	private BigDecimal cdrawtaxTotAmount;
	
private String stationId;
	
	public String getStationId() {
		return stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	public CdrawtaxHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CdrawtaxHistory(Integer cdrawPeriodId, Integer taxId,
			BigDecimal cdrawtaxTotAmount) {
		super();
		this.cdrawPeriodId = cdrawPeriodId;
		this.taxId = taxId;
		this.cdrawtaxTotAmount = cdrawtaxTotAmount;
	}
	@Override
	public String toString() {
		return "CdrawtaxHistory [cdrawPeriodId=" + cdrawPeriodId + ", taxId="
				+ taxId + ", cdrawtaxTotAmount=" + cdrawtaxTotAmount + "]";
	}
	public Integer getCdrawPeriodId() {
		return cdrawPeriodId;
	}
	public void setCdrawPeriodId(Integer cdrawPeriodId) {
		this.cdrawPeriodId = cdrawPeriodId;
	}
	public Integer getTaxId() {
		return taxId;
	}
	public void setTaxId(Integer taxId) {
		this.taxId = taxId;
	}
	public BigDecimal getCdrawtaxTotAmount() {
		return cdrawtaxTotAmount;
	}
	public void setCdrawtaxTotAmount(BigDecimal cdrawtaxTotAmount) {
		this.cdrawtaxTotAmount = cdrawtaxTotAmount;
	}
	
}
