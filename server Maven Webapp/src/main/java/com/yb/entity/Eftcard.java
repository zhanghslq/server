package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Eftcard implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer transcationId;
	private Integer itemNumber;
	private String cardNumber;
	private Integer accountType;
	private Integer cardType;
	private String cardTypeName;
	private BigDecimal auditNumber;
	private String vehicleReg;
	private BigDecimal odometer;
	private String orderNumber;
	private Integer originalDocket;
	private Date originalDate;
	private Integer terminalNumber;
	private String terminalId;
	private String terminalType;
	private BigDecimal usedPointsValue;
	private Integer terminalTypeEnum;
	private String eftTrace;
	public Eftcard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Eftcard(Integer transcationId, Integer itemNumber,
			String cardNumber, Integer accountType, Integer cardType,
			String cardTypeName, BigDecimal auditNumber, String vehicleReg,
			BigDecimal odometer, String orderNumber, Integer originalDocket,
			Date originalDate, Integer terminalNumber, String terminalId,
			String terminalType, BigDecimal usedPointsValue,
			Integer terminalTypeEnum, String eftTrace) {
		super();
		this.transcationId = transcationId;
		this.itemNumber = itemNumber;
		this.cardNumber = cardNumber;
		this.accountType = accountType;
		this.cardType = cardType;
		this.cardTypeName = cardTypeName;
		this.auditNumber = auditNumber;
		this.vehicleReg = vehicleReg;
		this.odometer = odometer;
		this.orderNumber = orderNumber;
		this.originalDocket = originalDocket;
		this.originalDate = originalDate;
		this.terminalNumber = terminalNumber;
		this.terminalId = terminalId;
		this.terminalType = terminalType;
		this.usedPointsValue = usedPointsValue;
		this.terminalTypeEnum = terminalTypeEnum;
		this.eftTrace = eftTrace;
	}
	@Override
	public String toString() {
		return "Eftcard [transcationId=" + transcationId + ", itemNumber="
				+ itemNumber + ", cardNumber=" + cardNumber + ", accountType="
				+ accountType + ", cardType=" + cardType + ", cardTypeName="
				+ cardTypeName + ", auditNumber=" + auditNumber
				+ ", vehicleReg=" + vehicleReg + ", odometer=" + odometer
				+ ", orderNumber=" + orderNumber + ", originalDocket="
				+ originalDocket + ", originalDate=" + originalDate
				+ ", terminalNumber=" + terminalNumber + ", terminalId="
				+ terminalId + ", terminalType=" + terminalType
				+ ", usedPointsValue=" + usedPointsValue
				+ ", terminalTypeEnum=" + terminalTypeEnum + ", eftTrace="
				+ eftTrace + "]";
	}
	public Integer getTranscationId() {
		return transcationId;
	}
	public void setTranscationId(Integer transcationId) {
		this.transcationId = transcationId;
	}
	public Integer getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(Integer itemNumber) {
		this.itemNumber = itemNumber;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Integer getAccountType() {
		return accountType;
	}
	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
	}
	public Integer getCardType() {
		return cardType;
	}
	public void setCardType(Integer cardType) {
		this.cardType = cardType;
	}
	public String getCardTypeName() {
		return cardTypeName;
	}
	public void setCardTypeName(String cardTypeName) {
		this.cardTypeName = cardTypeName;
	}
	public BigDecimal getAuditNumber() {
		return auditNumber;
	}
	public void setAuditNumber(BigDecimal auditNumber) {
		this.auditNumber = auditNumber;
	}
	public String getVehicleReg() {
		return vehicleReg;
	}
	public void setVehicleReg(String vehicleReg) {
		this.vehicleReg = vehicleReg;
	}
	public BigDecimal getOdometer() {
		return odometer;
	}
	public void setOdometer(BigDecimal odometer) {
		this.odometer = odometer;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public Integer getOriginalDocket() {
		return originalDocket;
	}
	public void setOriginalDocket(Integer originalDocket) {
		this.originalDocket = originalDocket;
	}
	public Date getOriginalDate() {
		return originalDate;
	}
	public void setOriginalDate(Date originalDate) {
		this.originalDate = originalDate;
	}
	public Integer getTerminalNumber() {
		return terminalNumber;
	}
	public void setTerminalNumber(Integer terminalNumber) {
		this.terminalNumber = terminalNumber;
	}
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public String getTerminalType() {
		return terminalType;
	}
	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}
	public BigDecimal getUsedPointsValue() {
		return usedPointsValue;
	}
	public void setUsedPointsValue(BigDecimal usedPointsValue) {
		this.usedPointsValue = usedPointsValue;
	}
	public Integer getTerminalTypeEnum() {
		return terminalTypeEnum;
	}
	public void setTerminalTypeEnum(Integer terminalTypeEnum) {
		this.terminalTypeEnum = terminalTypeEnum;
	}
	public String getEftTrace() {
		return eftTrace;
	}
	public void setEftTrace(String eftTrace) {
		this.eftTrace = eftTrace;
	}
	
	
}
