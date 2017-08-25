package com.yb.entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FutureGradePrice implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer futureGradePriceId;
	private Integer gradeId;
	private Date effectiveDate;
	private String comment;
	private Integer priceType;
	private BigDecimal gradePrice;
	private Integer priceUpdateStatus;
	private Integer priceLevel;
	private BigDecimal previousGradePrice;
	private Integer sequenceNumber;
private String stationId;
	
	public String getStationId() {
		return stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	public FutureGradePrice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FutureGradePrice(Integer futureGradePriceId, Integer gradeId,
			Date effectiveDate, String comment, Integer priceType,
			BigDecimal gradePrice, Integer priceUpdateStatus,
			Integer priceLevel, BigDecimal previousGradePrice,
			Integer sequenceNumber) {
		super();
		this.futureGradePriceId = futureGradePriceId;
		this.gradeId = gradeId;
		this.effectiveDate = effectiveDate;
		this.comment = comment;
		this.priceType = priceType;
		this.gradePrice = gradePrice;
		this.priceUpdateStatus = priceUpdateStatus;
		this.priceLevel = priceLevel;
		this.previousGradePrice = previousGradePrice;
		this.sequenceNumber = sequenceNumber;
	}
	@Override
	public String toString() {
		return "FutureGradePrice [futureGradePriceId=" + futureGradePriceId
				+ ", gradeId=" + gradeId + ", effectiveDate=" + effectiveDate
				+ ", comment=" + comment + ", priceType=" + priceType
				+ ", gradePrice=" + gradePrice + ", priceUpdateStatus="
				+ priceUpdateStatus + ", priceLevel=" + priceLevel
				+ ", previousGradePrice=" + previousGradePrice
				+ ", sequenceNumber=" + sequenceNumber + "]";
	}
	public Integer getFutureGradePriceId() {
		return futureGradePriceId;
	}
	public void setFutureGradePriceId(Integer futureGradePriceId) {
		this.futureGradePriceId = futureGradePriceId;
	}
	public Integer getGradeId() {
		return gradeId;
	}
	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Integer getPriceType() {
		return priceType;
	}
	public void setPriceType(Integer priceType) {
		this.priceType = priceType;
	}
	public BigDecimal getGradePrice() {
		return gradePrice;
	}
	public void setGradePrice(BigDecimal gradePrice) {
		this.gradePrice = gradePrice;
	}
	public Integer getPriceUpdateStatus() {
		return priceUpdateStatus;
	}
	public void setPriceUpdateStatus(Integer priceUpdateStatus) {
		this.priceUpdateStatus = priceUpdateStatus;
	}
	public Integer getPriceLevel() {
		return priceLevel;
	}
	public void setPriceLevel(Integer priceLevel) {
		this.priceLevel = priceLevel;
	}
	public BigDecimal getPreviousGradePrice() {
		return previousGradePrice;
	}
	public void setPreviousGradePrice(BigDecimal previousGradePrice) {
		this.previousGradePrice = previousGradePrice;
	}
	public Integer getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(Integer sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	
}
