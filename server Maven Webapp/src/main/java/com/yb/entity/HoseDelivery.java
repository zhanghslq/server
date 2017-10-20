package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class HoseDelivery implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer deliveryId;
	private Integer hoseId;
	private Integer attendantId;
	private Integer priceLevel;
	private Date completedTs;
	private Date clearedDateTime;
	private Integer deliveryType;
	private Integer deliveryState;
	private BigDecimal deliveryVolume;
	private BigDecimal deliveryValue;
	private BigDecimal delSellPrice;
	private BigDecimal delCostPrice;
	private Integer clearedBy;
	private Integer reservedBy;
	private Integer transactionId;
	private Integer delItemNumber;
	private BigDecimal delivery2Volume;
	private BigDecimal hoseMeterVolume;
	private BigDecimal hoseMeterValue;
	private BigDecimal hoseMeterVolume2;
	private BigDecimal hoseMeterValue2;
	private Integer authRef;
	private BigDecimal blendRatio;
	private Integer previousDeliveryType;
	private BigDecimal delivery1Volume;
	private BigDecimal delivery1Value;
	private BigDecimal delivery2Value;
	private BigDecimal hoseMeterVolume1;
	private BigDecimal hoseMeterValue1;
	private BigDecimal grade1Price;
	private BigDecimal grade2Price;
	private String stationId;
	public HoseDelivery() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HoseDelivery(Integer deliveryId, Integer hoseId,
			Integer attendantId, Integer priceLevel, Date completedTs,
			Date clearedDateTime, Integer deliveryType, Integer deliveryState,
			BigDecimal deliveryVolume, BigDecimal deliveryValue,
			BigDecimal delSellPrice, BigDecimal delCostPrice,
			Integer clearedBy, Integer reservedBy, Integer transactionId,
			Integer delItemNumber, BigDecimal delivery2Volume,
			BigDecimal hoseMeterVolume, BigDecimal hoseMeterValue,
			BigDecimal hoseMeterVolume2, BigDecimal hoseMeterValue2,
			Integer authRef, BigDecimal blendRatio,
			Integer previousDeliveryType, BigDecimal delivery1Volume,
			BigDecimal delivery1Value, BigDecimal delivery2Value,
			BigDecimal hoseMeterVolume1, BigDecimal hoseMeterValue1,
			BigDecimal grade1Price, BigDecimal grade2Price, String stationId) {
		super();
		this.deliveryId = deliveryId;
		this.hoseId = hoseId;
		this.attendantId = attendantId;
		this.priceLevel = priceLevel;
		this.completedTs = completedTs;
		this.clearedDateTime = clearedDateTime;
		this.deliveryType = deliveryType;
		this.deliveryState = deliveryState;
		this.deliveryVolume = deliveryVolume;
		this.deliveryValue = deliveryValue;
		this.delSellPrice = delSellPrice;
		this.delCostPrice = delCostPrice;
		this.clearedBy = clearedBy;
		this.reservedBy = reservedBy;
		this.transactionId = transactionId;
		this.delItemNumber = delItemNumber;
		this.delivery2Volume = delivery2Volume;
		this.hoseMeterVolume = hoseMeterVolume;
		this.hoseMeterValue = hoseMeterValue;
		this.hoseMeterVolume2 = hoseMeterVolume2;
		this.hoseMeterValue2 = hoseMeterValue2;
		this.authRef = authRef;
		this.blendRatio = blendRatio;
		this.previousDeliveryType = previousDeliveryType;
		this.delivery1Volume = delivery1Volume;
		this.delivery1Value = delivery1Value;
		this.delivery2Value = delivery2Value;
		this.hoseMeterVolume1 = hoseMeterVolume1;
		this.hoseMeterValue1 = hoseMeterValue1;
		this.grade1Price = grade1Price;
		this.grade2Price = grade2Price;
		this.stationId = stationId;
	}
	@Override
	public String toString() {
		return "HoseDelivery [deliveryId=" + deliveryId + ", hoseId=" + hoseId
				+ ", attendantId=" + attendantId + ", priceLevel=" + priceLevel
				+ ", completedTs=" + completedTs + ", clearedDateTime="
				+ clearedDateTime + ", deliveryType=" + deliveryType
				+ ", deliveryState=" + deliveryState + ", deliveryVolume="
				+ deliveryVolume + ", deliveryValue=" + deliveryValue
				+ ", delSellPrice=" + delSellPrice + ", delCostPrice="
				+ delCostPrice + ", clearedBy=" + clearedBy + ", reservedBy="
				+ reservedBy + ", transactionId=" + transactionId
				+ ", delItemNumber=" + delItemNumber + ", delivery2Volume="
				+ delivery2Volume + ", hoseMeterVolume=" + hoseMeterVolume
				+ ", hoseMeterValue=" + hoseMeterValue + ", hoseMeterVolume2="
				+ hoseMeterVolume2 + ", hoseMeterValue2=" + hoseMeterValue2
				+ ", authRef=" + authRef + ", blendRatio=" + blendRatio
				+ ", previousDeliveryType=" + previousDeliveryType
				+ ", delivery1Volume=" + delivery1Volume + ", delivery1Value="
				+ delivery1Value + ", delivery2Value=" + delivery2Value
				+ ", hoseMeterVolume1=" + hoseMeterVolume1
				+ ", hoseMeterValue1=" + hoseMeterValue1 + ", grade1Price="
				+ grade1Price + ", grade2Price=" + grade2Price + ", stationId="
				+ stationId + "]";
	}
	public Integer getDeliveryId() {
		return deliveryId;
	}
	public void setDeliveryId(Integer deliveryId) {
		this.deliveryId = deliveryId;
	}
	public Integer getHoseId() {
		return hoseId;
	}
	public void setHoseId(Integer hoseId) {
		this.hoseId = hoseId;
	}
	public Integer getAttendantId() {
		return attendantId;
	}
	public void setAttendantId(Integer attendantId) {
		this.attendantId = attendantId;
	}
	public Integer getPriceLevel() {
		return priceLevel;
	}
	public void setPriceLevel(Integer priceLevel) {
		this.priceLevel = priceLevel;
	}
	public Date getCompletedTs() {
		return completedTs;
	}
	public void setCompletedTs(Date completedTs) {
		this.completedTs = completedTs;
	}
	public Date getClearedDateTime() {
		return clearedDateTime;
	}
	public void setClearedDateTime(Date clearedDateTime) {
		this.clearedDateTime = clearedDateTime;
	}
	public Integer getDeliveryType() {
		return deliveryType;
	}
	public void setDeliveryType(Integer deliveryType) {
		this.deliveryType = deliveryType;
	}
	public Integer getDeliveryState() {
		return deliveryState;
	}
	public void setDeliveryState(Integer deliveryState) {
		this.deliveryState = deliveryState;
	}
	public BigDecimal getDeliveryVolume() {
		return deliveryVolume;
	}
	public void setDeliveryVolume(BigDecimal deliveryVolume) {
		this.deliveryVolume = deliveryVolume;
	}
	public BigDecimal getDeliveryValue() {
		return deliveryValue;
	}
	public void setDeliveryValue(BigDecimal deliveryValue) {
		this.deliveryValue = deliveryValue;
	}
	public BigDecimal getDelSellPrice() {
		return delSellPrice;
	}
	public void setDelSellPrice(BigDecimal delSellPrice) {
		this.delSellPrice = delSellPrice;
	}
	public BigDecimal getDelCostPrice() {
		return delCostPrice;
	}
	public void setDelCostPrice(BigDecimal delCostPrice) {
		this.delCostPrice = delCostPrice;
	}
	public Integer getClearedBy() {
		return clearedBy;
	}
	public void setClearedBy(Integer clearedBy) {
		this.clearedBy = clearedBy;
	}
	public Integer getReservedBy() {
		return reservedBy;
	}
	public void setReservedBy(Integer reservedBy) {
		this.reservedBy = reservedBy;
	}
	public Integer getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	public Integer getDelItemNumber() {
		return delItemNumber;
	}
	public void setDelItemNumber(Integer delItemNumber) {
		this.delItemNumber = delItemNumber;
	}
	public BigDecimal getDelivery2Volume() {
		return delivery2Volume;
	}
	public void setDelivery2Volume(BigDecimal delivery2Volume) {
		this.delivery2Volume = delivery2Volume;
	}
	public BigDecimal getHoseMeterVolume() {
		return hoseMeterVolume;
	}
	public void setHoseMeterVolume(BigDecimal hoseMeterVolume) {
		this.hoseMeterVolume = hoseMeterVolume;
	}
	public BigDecimal getHoseMeterValue() {
		return hoseMeterValue;
	}
	public void setHoseMeterValue(BigDecimal hoseMeterValue) {
		this.hoseMeterValue = hoseMeterValue;
	}
	public BigDecimal getHoseMeterVolume2() {
		return hoseMeterVolume2;
	}
	public void setHoseMeterVolume2(BigDecimal hoseMeterVolume2) {
		this.hoseMeterVolume2 = hoseMeterVolume2;
	}
	public BigDecimal getHoseMeterValue2() {
		return hoseMeterValue2;
	}
	public void setHoseMeterValue2(BigDecimal hoseMeterValue2) {
		this.hoseMeterValue2 = hoseMeterValue2;
	}
	public Integer getAuthRef() {
		return authRef;
	}
	public void setAuthRef(Integer authRef) {
		this.authRef = authRef;
	}
	public BigDecimal getBlendRatio() {
		return blendRatio;
	}
	public void setBlendRatio(BigDecimal blendRatio) {
		this.blendRatio = blendRatio;
	}
	public Integer getPreviousDeliveryType() {
		return previousDeliveryType;
	}
	public void setPreviousDeliveryType(Integer previousDeliveryType) {
		this.previousDeliveryType = previousDeliveryType;
	}
	public BigDecimal getDelivery1Volume() {
		return delivery1Volume;
	}
	public void setDelivery1Volume(BigDecimal delivery1Volume) {
		this.delivery1Volume = delivery1Volume;
	}
	public BigDecimal getDelivery1Value() {
		return delivery1Value;
	}
	public void setDelivery1Value(BigDecimal delivery1Value) {
		this.delivery1Value = delivery1Value;
	}
	public BigDecimal getDelivery2Value() {
		return delivery2Value;
	}
	public void setDelivery2Value(BigDecimal delivery2Value) {
		this.delivery2Value = delivery2Value;
	}
	public BigDecimal getHoseMeterVolume1() {
		return hoseMeterVolume1;
	}
	public void setHoseMeterVolume1(BigDecimal hoseMeterVolume1) {
		this.hoseMeterVolume1 = hoseMeterVolume1;
	}
	public BigDecimal getHoseMeterValue1() {
		return hoseMeterValue1;
	}
	public void setHoseMeterValue1(BigDecimal hoseMeterValue1) {
		this.hoseMeterValue1 = hoseMeterValue1;
	}
	public BigDecimal getGrade1Price() {
		return grade1Price;
	}
	public void setGrade1Price(BigDecimal grade1Price) {
		this.grade1Price = grade1Price;
	}
	public BigDecimal getGrade2Price() {
		return grade2Price;
	}
	public void setGrade2Price(BigDecimal grade2Price) {
		this.grade2Price = grade2Price;
	}
	public String getStationId() {
		return stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	
	
}
