package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class TaxHistory implements Serializable{
	private Integer periodId;
	private Integer taxId;
	private BigDecimal taxTotValue;
	public TaxHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TaxHistory(Integer periodId, Integer taxId, BigDecimal taxTotValue) {
		super();
		this.periodId = periodId;
		this.taxId = taxId;
		this.taxTotValue = taxTotValue;
	}
	@Override
	public String toString() {
		return "TaxHistory [periodId=" + periodId + ", taxId=" + taxId
				+ ", taxTotValue=" + taxTotValue + "]";
	}
	public Integer getPeriodId() {
		return periodId;
	}
	public void setPeriodId(Integer periodId) {
		this.periodId = periodId;
	}
	public Integer getTaxId() {
		return taxId;
	}
	public void setTaxId(Integer taxId) {
		this.taxId = taxId;
	}
	public BigDecimal getTaxTotValue() {
		return taxTotValue;
	}
	public void setTaxTotValue(BigDecimal taxTotValue) {
		this.taxTotValue = taxTotValue;
	}
	
}
