package com.yb.entity;

import java.math.BigDecimal;

public class Comparison {
	private String day;
	private Integer station_id;
	private Integer cashdraw_periods_count;
	private BigDecimal cashdraw_periods_sum;
	private Integer eftcard_count;
	private BigDecimal eftcard_sum;
	private Integer Hose_Delivery_count;
	private BigDecimal Hose_Delivery_sum;
	private Integer transactions_count;
	private BigDecimal transactions_sum;
	private Integer departments_count;
	private Integer Grades_count;
	private Integer Hoses_count;
	private Integer products_count;
	public Comparison() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comparison(String day, Integer station_id,
			Integer cashdraw_periods_count, BigDecimal cashdraw_periods_sum,
			Integer eftcard_count, BigDecimal eftcard_sum,
			Integer hose_Delivery_count, BigDecimal hose_Delivery_sum,
			Integer transactions_count, BigDecimal transactions_sum,
			Integer departments_count, Integer grades_count,
			Integer hoses_count, Integer products_count) {
		super();
		this.day = day;
		this.station_id = station_id;
		this.cashdraw_periods_count = cashdraw_periods_count;
		this.cashdraw_periods_sum = cashdraw_periods_sum;
		this.eftcard_count = eftcard_count;
		this.eftcard_sum = eftcard_sum;
		Hose_Delivery_count = hose_Delivery_count;
		Hose_Delivery_sum = hose_Delivery_sum;
		this.transactions_count = transactions_count;
		this.transactions_sum = transactions_sum;
		this.departments_count = departments_count;
		Grades_count = grades_count;
		Hoses_count = hoses_count;
		this.products_count = products_count;
	}
	@Override
	public String toString() {
		return "Comparison [day=" + day + ", station_id=" + station_id
				+ ", cashdraw_periods_count=" + cashdraw_periods_count
				+ ", cashdraw_periods_sum=" + cashdraw_periods_sum
				+ ", eftcard_count=" + eftcard_count + ", eftcard_sum="
				+ eftcard_sum + ", Hose_Delivery_count=" + Hose_Delivery_count
				+ ", Hose_Delivery_sum=" + Hose_Delivery_sum
				+ ", transactions_count=" + transactions_count
				+ ", transactions_sum=" + transactions_sum
				+ ", departments_count=" + departments_count
				+ ", Grades_count=" + Grades_count + ", Hoses_count="
				+ Hoses_count + ", products_count=" + products_count + "]";
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public Integer getStation_id() {
		return station_id;
	}
	public void setStation_id(Integer station_id) {
		this.station_id = station_id;
	}
	public Integer getCashdraw_periods_count() {
		return cashdraw_periods_count;
	}
	public void setCashdraw_periods_count(Integer cashdraw_periods_count) {
		this.cashdraw_periods_count = cashdraw_periods_count;
	}
	public BigDecimal getCashdraw_periods_sum() {
		return cashdraw_periods_sum;
	}
	public void setCashdraw_periods_sum(BigDecimal cashdraw_periods_sum) {
		this.cashdraw_periods_sum = cashdraw_periods_sum;
	}
	public Integer getEftcard_count() {
		return eftcard_count;
	}
	public void setEftcard_count(Integer eftcard_count) {
		this.eftcard_count = eftcard_count;
	}
	public BigDecimal getEftcard_sum() {
		return eftcard_sum;
	}
	public void setEftcard_sum(BigDecimal eftcard_sum) {
		this.eftcard_sum = eftcard_sum;
	}
	public Integer getHose_Delivery_count() {
		return Hose_Delivery_count;
	}
	public void setHose_Delivery_count(Integer hose_Delivery_count) {
		Hose_Delivery_count = hose_Delivery_count;
	}
	public BigDecimal getHose_Delivery_sum() {
		return Hose_Delivery_sum;
	}
	public void setHose_Delivery_sum(BigDecimal hose_Delivery_sum) {
		Hose_Delivery_sum = hose_Delivery_sum;
	}
	public Integer getTransactions_count() {
		return transactions_count;
	}
	public void setTransactions_count(Integer transactions_count) {
		this.transactions_count = transactions_count;
	}
	public BigDecimal getTransactions_sum() {
		return transactions_sum;
	}
	public void setTransactions_sum(BigDecimal transactions_sum) {
		this.transactions_sum = transactions_sum;
	}
	public Integer getDepartments_count() {
		return departments_count;
	}
	public void setDepartments_count(Integer departments_count) {
		this.departments_count = departments_count;
	}
	public Integer getGrades_count() {
		return Grades_count;
	}
	public void setGrades_count(Integer grades_count) {
		Grades_count = grades_count;
	}
	public Integer getHoses_count() {
		return Hoses_count;
	}
	public void setHoses_count(Integer hoses_count) {
		Hoses_count = hoses_count;
	}
	public Integer getProducts_count() {
		return products_count;
	}
	public void setProducts_count(Integer products_count) {
		this.products_count = products_count;
	}
	
	
}
