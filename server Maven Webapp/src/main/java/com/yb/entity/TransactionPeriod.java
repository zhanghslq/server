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
	private Date transaction_date;

	@Override
	public String toString() {
		return "TransactionPeriod{" +
				"transactionId=" + transactionId +
				", periodId=" + periodId +
				", stationId='" + stationId + '\'' +
				", transaction_date=" + transaction_date +
				'}';
	}

	public Date getTransaction_date() {
		return transaction_date;
	}

	public void setTransaction_date(Date transaction_date) {
		this.transaction_date = transaction_date;
	}

	public TransactionPeriod(Integer transactionId, Integer periodId, String stationId, Date transaction_date) {

		this.transactionId = transactionId;
		this.periodId = periodId;
		this.stationId = stationId;
		this.transaction_date = transaction_date;
	}

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
