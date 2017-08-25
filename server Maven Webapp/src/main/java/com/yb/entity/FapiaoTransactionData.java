package com.yb.entity;

import java.io.Serializable;

public class FapiaoTransactionData implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer transactionId;
	private Integer printInvoice;
	private String customerCode;
	private String customerText;
private String stationId;
	
	public String getStationId() {
		return stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	public FapiaoTransactionData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FapiaoTransactionData(Integer transactionId, Integer printInvoice,
			String customerCode, String customerText) {
		super();
		this.transactionId = transactionId;
		this.printInvoice = printInvoice;
		this.customerCode = customerCode;
		this.customerText = customerText;
	}
	@Override
	public String toString() {
		return "FapiaoTransactionData [transactionId=" + transactionId
				+ ", printInvoice=" + printInvoice + ", customerCode="
				+ customerCode + ", customerText=" + customerText + "]";
	}
	public Integer getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	public Integer getPrintInvoice() {
		return printInvoice;
	}
	public void setPrintInvoice(Integer printInvoice) {
		this.printInvoice = printInvoice;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getCustomerText() {
		return customerText;
	}
	public void setCustomerText(String customerText) {
		this.customerText = customerText;
	}
	
}
