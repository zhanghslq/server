package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PriceBatch implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer priceBatchId;
	private BigDecimal priceEventNumber;
	private String priceBatchDescription;
	private Integer priceBatchPermanent;
	private Date priceBatchStartDt;
	private Date priceBatchEndDt;
	private Integer priceBatchStatus;
	private Integer priceTypeName;
	public PriceBatch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PriceBatch(Integer priceBatchId, BigDecimal priceEventNumber,
			String priceBatchDescription, Integer priceBatchPermanent,
			Date priceBatchStartDt, Date priceBatchEndDt,
			Integer priceBatchStatus, Integer priceTypeName) {
		super();
		this.priceBatchId = priceBatchId;
		this.priceEventNumber = priceEventNumber;
		this.priceBatchDescription = priceBatchDescription;
		this.priceBatchPermanent = priceBatchPermanent;
		this.priceBatchStartDt = priceBatchStartDt;
		this.priceBatchEndDt = priceBatchEndDt;
		this.priceBatchStatus = priceBatchStatus;
		this.priceTypeName = priceTypeName;
	}
	@Override
	public String toString() {
		return "PriceBatch [priceBatchId=" + priceBatchId
				+ ", priceEventNumber=" + priceEventNumber
				+ ", priceBatchDescription=" + priceBatchDescription
				+ ", priceBatchPermanent=" + priceBatchPermanent
				+ ", priceBatchStartDt=" + priceBatchStartDt
				+ ", priceBatchEndDt=" + priceBatchEndDt
				+ ", priceBatchStatus=" + priceBatchStatus + ", priceTypeName="
				+ priceTypeName + "]";
	}
	public Integer getPriceBatchId() {
		return priceBatchId;
	}
	public void setPriceBatchId(Integer priceBatchId) {
		this.priceBatchId = priceBatchId;
	}
	public BigDecimal getPriceEventNumber() {
		return priceEventNumber;
	}
	public void setPriceEventNumber(BigDecimal priceEventNumber) {
		this.priceEventNumber = priceEventNumber;
	}
	public String getPriceBatchDescription() {
		return priceBatchDescription;
	}
	public void setPriceBatchDescription(String priceBatchDescription) {
		this.priceBatchDescription = priceBatchDescription;
	}
	public Integer getPriceBatchPermanent() {
		return priceBatchPermanent;
	}
	public void setPriceBatchPermanent(Integer priceBatchPermanent) {
		this.priceBatchPermanent = priceBatchPermanent;
	}
	public Date getPriceBatchStartDt() {
		return priceBatchStartDt;
	}
	public void setPriceBatchStartDt(Date priceBatchStartDt) {
		this.priceBatchStartDt = priceBatchStartDt;
	}
	public Date getPriceBatchEndDt() {
		return priceBatchEndDt;
	}
	public void setPriceBatchEndDt(Date priceBatchEndDt) {
		this.priceBatchEndDt = priceBatchEndDt;
	}
	public Integer getPriceBatchStatus() {
		return priceBatchStatus;
	}
	public void setPriceBatchStatus(Integer priceBatchStatus) {
		this.priceBatchStatus = priceBatchStatus;
	}
	public Integer getPriceTypeName() {
		return priceTypeName;
	}
	public void setPriceTypeName(Integer priceTypeName) {
		this.priceTypeName = priceTypeName;
	}
	
}
