package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProductPrice implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer priceBatchId;
	private Integer productId;
	private BigDecimal productPrice;
	private BigDecimal productRrp;
	private BigDecimal productMaxretailprice;
	private Integer productPriceStatus;
private String stationId;
	
	public String getStationId() {
		return stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	public ProductPrice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductPrice(Integer priceBatchId, Integer productId,
			BigDecimal productPrice, BigDecimal productRrp,
			BigDecimal productMaxretailprice, Integer productPriceStatus) {
		super();
		this.priceBatchId = priceBatchId;
		this.productId = productId;
		this.productPrice = productPrice;
		this.productRrp = productRrp;
		this.productMaxretailprice = productMaxretailprice;
		this.productPriceStatus = productPriceStatus;
	}
	@Override
	public String toString() {
		return "ProductPrice [priceBatchId=" + priceBatchId + ", productId="
				+ productId + ", productPrice=" + productPrice
				+ ", productRrp=" + productRrp + ", productMaxretailprice="
				+ productMaxretailprice + ", productPriceStatus="
				+ productPriceStatus + "]";
	}
	public Integer getPriceBatchId() {
		return priceBatchId;
	}
	public void setPriceBatchId(Integer priceBatchId) {
		this.priceBatchId = priceBatchId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public BigDecimal getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}
	public BigDecimal getProductRrp() {
		return productRrp;
	}
	public void setProductRrp(BigDecimal productRrp) {
		this.productRrp = productRrp;
	}
	public BigDecimal getProductMaxretailprice() {
		return productMaxretailprice;
	}
	public void setProductMaxretailprice(BigDecimal productMaxretailprice) {
		this.productMaxretailprice = productMaxretailprice;
	}
	public Integer getProductPriceStatus() {
		return productPriceStatus;
	}
	public void setProductPriceStatus(Integer productPriceStatus) {
		this.productPriceStatus = productPriceStatus;
	}
	
}
