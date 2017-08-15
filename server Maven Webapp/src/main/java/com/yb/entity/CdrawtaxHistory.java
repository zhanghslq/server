package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class CdrawtaxHistory implements Serializable{
	private Integer cdrawPeriodId;
	private Integer TaxId;
	private BigDecimal cdrawtaxTotAmount;
	public CdrawtaxHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CdrawtaxHistory(Integer cdrawPeriodId, Integer taxId,
			BigDecimal cdrawtaxTotAmount) {
		super();
		this.cdrawPeriodId = cdrawPeriodId;
		TaxId = taxId;
		this.cdrawtaxTotAmount = cdrawtaxTotAmount;
	}
	@Override
	public String toString() {
		return "CdrawtaxHistory [cdrawPeriodId=" + cdrawPeriodId + ", TaxId="
				+ TaxId + ", cdrawtaxTotAmount=" + cdrawtaxTotAmount + "]";
	}
	public Integer getCdrawPeriodId() {
		return cdrawPeriodId;
	}
	public void setCdrawPeriodId(Integer cdrawPeriodId) {
		this.cdrawPeriodId = cdrawPeriodId;
	}
	public Integer getTaxId() {
		return TaxId;
	}
	public void setTaxId(Integer taxId) {
		TaxId = taxId;
	}
	public BigDecimal getCdrawtaxTotAmount() {
		return cdrawtaxTotAmount;
	}
	public void setCdrawtaxTotAmount(BigDecimal cdrawtaxTotAmount) {
		this.cdrawtaxTotAmount = cdrawtaxTotAmount;
	}
	
	
}
