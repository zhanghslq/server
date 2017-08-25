package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Products implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer productId;
	private Integer taxId;
	private Integer departmentId;
	private String productDesc;
	private BigDecimal productPrice;
	private String productQuickCode;
	private String productCode;
	private Integer productOrderingStatus;
	private Integer productManagedBy;
	private Integer productType;
	private Integer productSellingType;
	private Integer productStockType;
	private Integer productCompositeType;
	private Integer MultipleTaxes;
	private Integer priceBatchId;
	private Integer incompleteProduct;
	private Date delistedDate;
	private Integer productSpecialType;
	private String barcode;
	private String upcType;
	private Integer barcodeSpecialType;
	private Integer transactionNumber;
	private Date nowDate;
private String stationId;
	
	public String getStationId() {
		return stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	public Integer getTransactionNumber() {
		return transactionNumber;
	}
	public void setTransactionNumber(Integer transactionNumber) {
		this.transactionNumber = transactionNumber;
	}
	
	public Date getNowDate() {
		return nowDate;
	}
	public void setNowDate(Date nowDate) {
		this.nowDate = nowDate;
	}
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Products(Integer productId, Integer taxId, Integer departmentId,
			String productDesc, BigDecimal productPrice,
			String productQuickCode, String productCode,
			Integer productOrderingStatus, Integer productManagedBy,
			Integer productType, Integer productSellingType,
			Integer productStockType, Integer productCompositeType,
			Integer multipleTaxes, Integer priceBatchId,
			Integer incompleteProduct, Date delistedDate,
			Integer productSpecialType, String barcode, String upcType,
			Integer barcodeSpecialType) {
		super();
		this.productId = productId;
		this.taxId = taxId;
		this.departmentId = departmentId;
		this.productDesc = productDesc;
		this.productPrice = productPrice;
		this.productQuickCode = productQuickCode;
		this.productCode = productCode;
		this.productOrderingStatus = productOrderingStatus;
		this.productManagedBy = productManagedBy;
		this.productType = productType;
		this.productSellingType = productSellingType;
		this.productStockType = productStockType;
		this.productCompositeType = productCompositeType;
		MultipleTaxes = multipleTaxes;
		this.priceBatchId = priceBatchId;
		this.incompleteProduct = incompleteProduct;
		this.delistedDate = delistedDate;
		this.productSpecialType = productSpecialType;
		this.barcode = barcode;
		this.upcType = upcType;
		this.barcodeSpecialType = barcodeSpecialType;
	}
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", taxId=" + taxId
				+ ", departmentId=" + departmentId + ", productDesc="
				+ productDesc + ", productPrice=" + productPrice
				+ ", productQuickCode=" + productQuickCode + ", productCode="
				+ productCode + ", productOrderingStatus="
				+ productOrderingStatus + ", productManagedBy="
				+ productManagedBy + ", productType=" + productType
				+ ", productSellingType=" + productSellingType
				+ ", productStockType=" + productStockType
				+ ", productCompositeType=" + productCompositeType
				+ ", MultipleTaxes=" + MultipleTaxes + ", priceBatchId="
				+ priceBatchId + ", incompleteProduct=" + incompleteProduct
				+ ", delistedDate=" + delistedDate + ", productSpecialType="
				+ productSpecialType + ", barcode=" + barcode + ", upcType="
				+ upcType + ", barcodeSpecialType=" + barcodeSpecialType + "]";
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getTaxId() {
		return taxId;
	}
	public void setTaxId(Integer taxId) {
		this.taxId = taxId;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public BigDecimal getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductQuickCode() {
		return productQuickCode;
	}
	public void setProductQuickCode(String productQuickCode) {
		this.productQuickCode = productQuickCode;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public Integer getProductOrderingStatus() {
		return productOrderingStatus;
	}
	public void setProductOrderingStatus(Integer productOrderingStatus) {
		this.productOrderingStatus = productOrderingStatus;
	}
	public Integer getProductManagedBy() {
		return productManagedBy;
	}
	public void setProductManagedBy(Integer productManagedBy) {
		this.productManagedBy = productManagedBy;
	}
	public Integer getProductType() {
		return productType;
	}
	public void setProductType(Integer productType) {
		this.productType = productType;
	}
	public Integer getProductSellingType() {
		return productSellingType;
	}
	public void setProductSellingType(Integer productSellingType) {
		this.productSellingType = productSellingType;
	}
	public Integer getProductStockType() {
		return productStockType;
	}
	public void setProductStockType(Integer productStockType) {
		this.productStockType = productStockType;
	}
	public Integer getProductCompositeType() {
		return productCompositeType;
	}
	public void setProductCompositeType(Integer productCompositeType) {
		this.productCompositeType = productCompositeType;
	}
	public Integer getMultipleTaxes() {
		return MultipleTaxes;
	}
	public void setMultipleTaxes(Integer multipleTaxes) {
		MultipleTaxes = multipleTaxes;
	}
	public Integer getPriceBatchId() {
		return priceBatchId;
	}
	public void setPriceBatchId(Integer priceBatchId) {
		this.priceBatchId = priceBatchId;
	}
	public Integer getIncompleteProduct() {
		return incompleteProduct;
	}
	public void setIncompleteProduct(Integer incompleteProduct) {
		this.incompleteProduct = incompleteProduct;
	}
	public Date getDelistedDate() {
		return delistedDate;
	}
	public void setDelistedDate(Date delistedDate) {
		this.delistedDate = delistedDate;
	}
	public Integer getProductSpecialType() {
		return productSpecialType;
	}
	public void setProductSpecialType(Integer productSpecialType) {
		this.productSpecialType = productSpecialType;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getUpcType() {
		return upcType;
	}
	public void setUpcType(String upcType) {
		this.upcType = upcType;
	}
	public Integer getBarcodeSpecialType() {
		return barcodeSpecialType;
	}
	public void setBarcodeSpecialType(Integer barcodeSpecialType) {
		this.barcodeSpecialType = barcodeSpecialType;
	}
}
