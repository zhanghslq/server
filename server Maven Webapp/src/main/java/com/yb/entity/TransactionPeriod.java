package com.yb.entity;

import java.io.Serializable;

public class TransactionPeriod implements Serializable{
	private Integer transactionId;
	private Integer periodId;
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
