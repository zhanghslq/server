package com.yb.entity;

import java.io.Serializable;
import java.util.Date;

public class TransactionPeriod implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer transactionId;
	private Integer periodId;
private String stationId;
	
	public String getStationId() {
		return stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	public TransactionPeriod() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransactionPeriod(Integer transactionId, Integer periodId) {
		super();
		this.transactionId = transactionId;
		this.periodId = periodId;
	}
	@Override
	public String toString() {
		return "TransactionPeriod [transactionId=" + transactionId
				+ ", periodId=" + periodId + "]";
	}
	public Integer getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	public Integer getPeriodId() {
		return periodId;
	}
	public void setPeriodId(Integer periodId) {
		this.periodId = periodId;
	}
	
}
