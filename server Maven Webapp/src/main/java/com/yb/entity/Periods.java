package com.yb.entity;

import java.io.Serializable;
import java.util.Date;

public class Periods implements Serializable{
	private Integer periodId;
	private Date periodCreateTs;
	private Integer periodType;
	private Date periodCloseDt;
	private Integer periodState;
	private String periodName;
	private Integer periodNumber;
	private Integer tankDipsEntered;
	private Integer tankDropsEntered;
	private Integer pumpMeterEntered;
	private Integer exported;
	private Integer exportRequired;
	private Integer wetstockOutOfVariance;
	private Integer wetstockApprovalId;
	private Date businessDate;
	public Periods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Periods(Integer periodId, Date periodCreateTs, Integer periodType,
			Date periodCloseDt, Integer periodState, String periodName,
			Integer periodNumber, Integer tankDipsEntered,
			Integer tankDropsEntered, Integer pumpMeterEntered,
			Integer exported, Integer exportRequired,
			Integer wetstockOutOfVariance, Integer wetstockApprovalId,
			Date businessDate) {
		super();
		this.periodId = periodId;
		this.periodCreateTs = periodCreateTs;
		this.periodType = periodType;
		this.periodCloseDt = periodCloseDt;
		this.periodState = periodState;
		this.periodName = periodName;
		this.periodNumber = periodNumber;
		this.tankDipsEntered = tankDipsEntered;
		this.tankDropsEntered = tankDropsEntered;
		this.pumpMeterEntered = pumpMeterEntered;
		this.exported = exported;
		this.exportRequired = exportRequired;
		this.wetstockOutOfVariance = wetstockOutOfVariance;
		this.wetstockApprovalId = wetstockApprovalId;
		this.businessDate = businessDate;
	}
	@Override
	public String toString() {
		return "Periods [periodId=" + periodId + ", periodCreateTs="
				+ periodCreateTs + ", periodType=" + periodType
				+ ", periodCloseDt=" + periodCloseDt + ", periodState="
				+ periodState + ", periodName=" + periodName
				+ ", periodNumber=" + periodNumber + ", tankDipsEntered="
				+ tankDipsEntered + ", tankDropsEntered=" + tankDropsEntered
				+ ", pumpMeterEntered=" + pumpMeterEntered + ", exported="
				+ exported + ", exportRequired=" + exportRequired
				+ ", wetstockOutOfVariance=" + wetstockOutOfVariance
				+ ", wetstockApprovalId=" + wetstockApprovalId
				+ ", businessDate=" + businessDate + "]";
	}
	public Integer getPeriodId() {
		return periodId;
	}
	public void setPeriodId(Integer periodId) {
		this.periodId = periodId;
	}
	public Date getPeriodCreateTs() {
		return periodCreateTs;
	}
	public void setPeriodCreateTs(Date periodCreateTs) {
		this.periodCreateTs = periodCreateTs;
	}
	public Integer getPeriodType() {
		return periodType;
	}
	public void setPeriodType(Integer periodType) {
		this.periodType = periodType;
	}
	public Date getPeriodCloseDt() {
		return periodCloseDt;
	}
	public void setPeriodCloseDt(Date periodCloseDt) {
		this.periodCloseDt = periodCloseDt;
	}
	public Integer getPeriodState() {
		return periodState;
	}
	public void setPeriodState(Integer periodState) {
		this.periodState = periodState;
	}
	public String getPeriodName() {
		return periodName;
	}
	public void setPeriodName(String periodName) {
		this.periodName = periodName;
	}
	public Integer getPeriodNumber() {
		return periodNumber;
	}
	public void setPeriodNumber(Integer periodNumber) {
		this.periodNumber = periodNumber;
	}
	public Integer getTankDipsEntered() {
		return tankDipsEntered;
	}
	public void setTankDipsEntered(Integer tankDipsEntered) {
		this.tankDipsEntered = tankDipsEntered;
	}
	public Integer getTankDropsEntered() {
		return tankDropsEntered;
	}
	public void setTankDropsEntered(Integer tankDropsEntered) {
		this.tankDropsEntered = tankDropsEntered;
	}
	public Integer getPumpMeterEntered() {
		return pumpMeterEntered;
	}
	public void setPumpMeterEntered(Integer pumpMeterEntered) {
		this.pumpMeterEntered = pumpMeterEntered;
	}
	public Integer getExported() {
		return exported;
	}
	public void setExported(Integer exported) {
		this.exported = exported;
	}
	public Integer getExportRequired() {
		return exportRequired;
	}
	public void setExportRequired(Integer exportRequired) {
		this.exportRequired = exportRequired;
	}
	public Integer getWetstockOutOfVariance() {
		return wetstockOutOfVariance;
	}
	public void setWetstockOutOfVariance(Integer wetstockOutOfVariance) {
		this.wetstockOutOfVariance = wetstockOutOfVariance;
	}
	public Integer getWetstockApprovalId() {
		return wetstockApprovalId;
	}
	public void setWetstockApprovalId(Integer wetstockApprovalId) {
		this.wetstockApprovalId = wetstockApprovalId;
	}
	public Date getBusinessDate() {
		return businessDate;
	}
	public void setBusinessDate(Date businessDate) {
		this.businessDate = businessDate;
	}
	
}
