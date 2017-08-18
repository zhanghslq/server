package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Transactions implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer transactionId;
	private Integer cashierId;
	private Integer subAccountId;
	private Integer posId;
	private Integer transactionNumber;
	private Date transactionDate;
	private Integer periodId;
	private BigDecimal taxTotal;
	private BigDecimal saleTotal;
	private Integer birReceiptType;
	private Integer birTransNumber;
	private Integer refunded;
	private Integer altTransactionNumber;
	private Integer cdrawPeriodId;
	private Integer receiptNumber;
	private Date transactionStartDt;
	private BigDecimal awardTotal;
	private BigDecimal redemptionTotal;
	private BigDecimal refundTotal;
	private BigDecimal discountTotal;
	private Date refundedDate;
	private Integer isRefund;
	private BigDecimal discAsMopTotal;
	private Date transactionDbDate;
	public Transactions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transactions(Integer transactionId, Integer cashierId,
			Integer subAccountId, Integer posId, Integer transactionNumber,
			Date transactionDate, Integer periodId, BigDecimal taxTotal,
			BigDecimal saleTotal, Integer birReceiptType,
			Integer birTransNumber, Integer refunded,
			Integer altTransactionNumber, Integer cdrawPeriodId,
			Integer receiptNumber, Date transactionStartDt,
			BigDecimal awardTotal, BigDecimal redemptionTotal,
			BigDecimal refundTotal, BigDecimal discountTotal,
			Date refundedDate, Integer isRefund, BigDecimal discAsMopTotal,
			Date transactionDbDate) {
		super();
		this.transactionId = transactionId;
		this.cashierId = cashierId;
		this.subAccountId = subAccountId;
		this.posId = posId;
		this.transactionNumber = transactionNumber;
		this.transactionDate = transactionDate;
		this.periodId = periodId;
		this.taxTotal = taxTotal;
		this.saleTotal = saleTotal;
		this.birReceiptType = birReceiptType;
		this.birTransNumber = birTransNumber;
		this.refunded = refunded;
		this.altTransactionNumber = altTransactionNumber;
		this.cdrawPeriodId = cdrawPeriodId;
		this.receiptNumber = receiptNumber;
		this.transactionStartDt = transactionStartDt;
		this.awardTotal = awardTotal;
		this.redemptionTotal = redemptionTotal;
		this.refundTotal = refundTotal;
		this.discountTotal = discountTotal;
		this.refundedDate = refundedDate;
		this.isRefund = isRefund;
		this.discAsMopTotal = discAsMopTotal;
		this.transactionDbDate = transactionDbDate;
	}
	@Override
	public String toString() {
		return "Transactions [transactionId=" + transactionId + ", cashierId="
				+ cashierId + ", subAccountId=" + subAccountId + ", posId="
				+ posId + ", transactionNumber=" + transactionNumber
				+ ", transactionDate=" + transactionDate + ", periodId="
				+ periodId + ", taxTotal=" + taxTotal + ", saleTotal="
				+ saleTotal + ", birReceiptType=" + birReceiptType
				+ ", birTransNumber=" + birTransNumber + ", refunded="
				+ refunded + ", altTransactionNumber=" + altTransactionNumber
				+ ", cdrawPeriodId=" + cdrawPeriodId + ", receiptNumber="
				+ receiptNumber + ", transactionStartDt=" + transactionStartDt
				+ ", awardTotal=" + awardTotal + ", redemptionTotal="
				+ redemptionTotal + ", refundTotal=" + refundTotal
				+ ", discountTotal=" + discountTotal + ", refundedDate="
				+ refundedDate + ", isRefund=" + isRefund + ", discAsMopTotal="
				+ discAsMopTotal + ", transactionDbDate=" + transactionDbDate
				+ "]";
	}
	public Integer getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	public Integer getCashierId() {
		return cashierId;
	}
	public void setCashierId(Integer cashierId) {
		this.cashierId = cashierId;
	}
	public Integer getSubAccountId() {
		return subAccountId;
	}
	public void setSubAccountId(Integer subAccountId) {
		this.subAccountId = subAccountId;
	}
	public Integer getPosId() {
		return posId;
	}
	public void setPosId(Integer posId) {
		this.posId = posId;
	}
	public Integer getTransactionNumber() {
		return transactionNumber;
	}
	public void setTransactionNumber(Integer transactionNumber) {
		this.transactionNumber = transactionNumber;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public Integer getPeriodId() {
		return periodId;
	}
	public void setPeriodId(Integer periodId) {
		this.periodId = periodId;
	}
	public BigDecimal getTaxTotal() {
		return taxTotal;
	}
	public void setTaxTotal(BigDecimal taxTotal) {
		this.taxTotal = taxTotal;
	}
	public BigDecimal getSaleTotal() {
		return saleTotal;
	}
	public void setSaleTotal(BigDecimal saleTotal) {
		this.saleTotal = saleTotal;
	}
	public Integer getBirReceiptType() {
		return birReceiptType;
	}
	public void setBirReceiptType(Integer birReceiptType) {
		this.birReceiptType = birReceiptType;
	}
	public Integer getBirTransNumber() {
		return birTransNumber;
	}
	public void setBirTransNumber(Integer birTransNumber) {
		this.birTransNumber = birTransNumber;
	}
	public Integer getRefunded() {
		return refunded;
	}
	public void setRefunded(Integer refunded) {
		this.refunded = refunded;
	}
	public Integer getAltTransactionNumber() {
		return altTransactionNumber;
	}
	public void setAltTransactionNumber(Integer altTransactionNumber) {
		this.altTransactionNumber = altTransactionNumber;
	}
	public Integer getCdrawPeriodId() {
		return cdrawPeriodId;
	}
	public void setCdrawPeriodId(Integer cdrawPeriodId) {
		this.cdrawPeriodId = cdrawPeriodId;
	}
	public Integer getReceiptNumber() {
		return receiptNumber;
	}
	public void setReceiptNumber(Integer receiptNumber) {
		this.receiptNumber = receiptNumber;
	}
	public Date getTransactionStartDt() {
		return transactionStartDt;
	}
	public void setTransactionStartDt(Date transactionStartDt) {
		this.transactionStartDt = transactionStartDt;
	}
	public BigDecimal getAwardTotal() {
		return awardTotal;
	}
	public void setAwardTotal(BigDecimal awardTotal) {
		this.awardTotal = awardTotal;
	}
	public BigDecimal getRedemptionTotal() {
		return redemptionTotal;
	}
	public void setRedemptionTotal(BigDecimal redemptionTotal) {
		this.redemptionTotal = redemptionTotal;
	}
	public BigDecimal getRefundTotal() {
		return refundTotal;
	}
	public void setRefundTotal(BigDecimal refundTotal) {
		this.refundTotal = refundTotal;
	}
	public BigDecimal getDiscountTotal() {
		return discountTotal;
	}
	public void setDiscountTotal(BigDecimal discountTotal) {
		this.discountTotal = discountTotal;
	}
	public Date getRefundedDate() {
		return refundedDate;
	}
	public void setRefundedDate(Date refundedDate) {
		this.refundedDate = refundedDate;
	}
	public Integer getIsRefund() {
		return isRefund;
	}
	public void setIsRefund(Integer isRefund) {
		this.isRefund = isRefund;
	}
	public BigDecimal getDiscAsMopTotal() {
		return discAsMopTotal;
	}
	public void setDiscAsMopTotal(BigDecimal discAsMopTotal) {
		this.discAsMopTotal = discAsMopTotal;
	}
	public Date getTransactionDbDate() {
		return transactionDbDate;
	}
	public void setTransactionDbDate(Date transactionDbDate) {
		this.transactionDbDate = transactionDbDate;
	}
	
}