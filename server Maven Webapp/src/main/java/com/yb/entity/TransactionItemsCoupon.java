package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class TransactionItemsCoupon implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer transactionId;
	private Integer itemNumber;
	private Integer itemType;
	private Integer taxId;
	private String itemDescription;
	private String mopName;
	private BigDecimal itemPrice;
	private BigDecimal itemQuantity;
	private BigDecimal itemValue;
	private Integer itemId;
	private BigDecimal itemTaxAmount;
	private Integer  scitem;
	private Integer refunded;
	private Integer origTrxId;
	private Integer origItemNum;
	private Integer departmentId;
	private String itemEan;
	private Integer priceBatchId;
	private Integer groupItemType;
	private Integer groupParentItemNumber;
	private Integer subItemNumber;
	private String currencyCode;
	private BigDecimal taxRate;
	public TransactionItemsCoupon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransactionItemsCoupon(Integer transactionId, Integer itemNumber,
			Integer itemType, Integer taxId, String itemDescription,
			String mopName, BigDecimal itemPrice, BigDecimal itemQuantity,
			BigDecimal itemValue, Integer itemId, BigDecimal itemTaxAmount,
			Integer scitem, Integer refunded, Integer origTrxId,
			Integer origItemNum, Integer departmentId, String itemEan,
			Integer priceBatchId, Integer groupItemType,
			Integer groupParentItemNumber, Integer subItemNumber,
			String currencyCode, BigDecimal taxRate) {
		super();
		this.transactionId = transactionId;
		this.itemNumber = itemNumber;
		this.itemType = itemType;
		this.taxId = taxId;
		this.itemDescription = itemDescription;
		this.mopName = mopName;
		this.itemPrice = itemPrice;
		this.itemQuantity = itemQuantity;
		this.itemValue = itemValue;
		this.itemId = itemId;
		this.itemTaxAmount = itemTaxAmount;
		this.scitem = scitem;
		this.refunded = refunded;
		this.origTrxId = origTrxId;
		this.origItemNum = origItemNum;
		this.departmentId = departmentId;
		this.itemEan = itemEan;
		this.priceBatchId = priceBatchId;
		this.groupItemType = groupItemType;
		this.groupParentItemNumber = groupParentItemNumber;
		this.subItemNumber = subItemNumber;
		this.currencyCode = currencyCode;
		this.taxRate = taxRate;
	}
	@Override
	public String toString() {
		return "TransactionItems [transactionId=" + transactionId
				+ ", itemNumber=" + itemNumber + ", itemType=" + itemType
				+ ", taxId=" + taxId + ", itemDescription=" + itemDescription
				+ ", mopName=" + mopName + ", itemPrice=" + itemPrice
				+ ", itemQuantity=" + itemQuantity + ", itemValue=" + itemValue
				+ ", itemId=" + itemId + ", itemTaxAmount=" + itemTaxAmount
				+ ", scitem=" + scitem + ", refunded=" + refunded
				+ ", origTrxId=" + origTrxId + ", origItemNum=" + origItemNum
				+ ", departmentId=" + departmentId + ", itemEan=" + itemEan
				+ ", priceBatchId=" + priceBatchId + ", groupItemType="
				+ groupItemType + ", groupParentItemNumber="
				+ groupParentItemNumber + ", subItemNumber=" + subItemNumber
				+ ", currencyCode=" + currencyCode + ", taxRate=" + taxRate
				+ "]";
	}
	public Integer getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	public Integer getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(Integer itemNumber) {
		this.itemNumber = itemNumber;
	}
	public Integer getItemType() {
		return itemType;
	}
	public void setItemType(Integer itemType) {
		this.itemType = itemType;
	}
	public Integer getTaxId() {
		return taxId;
	}
	public void setTaxId(Integer taxId) {
		this.taxId = taxId;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public String getMopName() {
		return mopName;
	}
	public void setMopName(String mopName) {
		this.mopName = mopName;
	}
	public BigDecimal getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(BigDecimal itemPrice) {
		this.itemPrice = itemPrice;
	}
	public BigDecimal getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(BigDecimal itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public BigDecimal getItemValue() {
		return itemValue;
	}
	public void setItemValue(BigDecimal itemValue) {
		this.itemValue = itemValue;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public BigDecimal getItemTaxAmount() {
		return itemTaxAmount;
	}
	public void setItemTaxAmount(BigDecimal itemTaxAmount) {
		this.itemTaxAmount = itemTaxAmount;
	}
	public Integer getScitem() {
		return scitem;
	}
	public void setScitem(Integer scitem) {
		this.scitem = scitem;
	}
	public Integer getRefunded() {
		return refunded;
	}
	public void setRefunded(Integer refunded) {
		this.refunded = refunded;
	}
	public Integer getOrigTrxId() {
		return origTrxId;
	}
	public void setOrigTrxId(Integer origTrxId) {
		this.origTrxId = origTrxId;
	}
	public Integer getOrigItemNum() {
		return origItemNum;
	}
	public void setOrigItemNum(Integer origItemNum) {
		this.origItemNum = origItemNum;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getItemEan() {
		return itemEan;
	}
	public void setItemEan(String itemEan) {
		this.itemEan = itemEan;
	}
	public Integer getPriceBatchId() {
		return priceBatchId;
	}
	public void setPriceBatchId(Integer priceBatchId) {
		this.priceBatchId = priceBatchId;
	}
	public Integer getGroupItemType() {
		return groupItemType;
	}
	public void setGroupItemType(Integer groupItemType) {
		this.groupItemType = groupItemType;
	}
	public Integer getGroupParentItemNumber() {
		return groupParentItemNumber;
	}
	public void setGroupParentItemNumber(Integer groupParentItemNumber) {
		this.groupParentItemNumber = groupParentItemNumber;
	}
	public Integer getSubItemNumber() {
		return subItemNumber;
	}
	public void setSubItemNumber(Integer subItemNumber) {
		this.subItemNumber = subItemNumber;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public BigDecimal getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}
}
