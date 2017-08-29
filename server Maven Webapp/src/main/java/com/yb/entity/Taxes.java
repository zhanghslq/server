package com.yb.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Taxes {
	private Integer tax_id;
	private String tax_name;
	private BigDecimal tax_rate;
	private Integer tax_inclusive;
	private String tax_legend;
	private String tax_code;
	private Date Effective_Datetime;
	private String New_Name;
	private BigDecimal New_Rate;
	private Integer tax_active;
	public Taxes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Taxes(Integer tax_id, String tax_name, BigDecimal tax_rate,
			Integer tax_inclusive, String tax_legend, String tax_code,
			Date effective_Datetime, String new_Name, BigDecimal new_Rate,
			Integer tax_active) {
		super();
		this.tax_id = tax_id;
		this.tax_name = tax_name;
		this.tax_rate = tax_rate;
		this.tax_inclusive = tax_inclusive;
		this.tax_legend = tax_legend;
		this.tax_code = tax_code;
		Effective_Datetime = effective_Datetime;
		New_Name = new_Name;
		New_Rate = new_Rate;
		this.tax_active = tax_active;
	}
	@Override
	public String toString() {
		return "Taxes [tax_id=" + tax_id + ", tax_name=" + tax_name
				+ ", tax_rate=" + tax_rate + ", tax_inclusive=" + tax_inclusive
				+ ", tax_legend=" + tax_legend + ", tax_code=" + tax_code
				+ ", Effective_Datetime=" + Effective_Datetime + ", New_Name="
				+ New_Name + ", New_Rate=" + New_Rate + ", tax_active="
				+ tax_active + "]";
	}
	public Integer getTax_id() {
		return tax_id;
	}
	public void setTax_id(Integer tax_id) {
		this.tax_id = tax_id;
	}
	public String getTax_name() {
		return tax_name;
	}
	public void setTax_name(String tax_name) {
		this.tax_name = tax_name;
	}
	public BigDecimal getTax_rate() {
		return tax_rate;
	}
	public void setTax_rate(BigDecimal tax_rate) {
		this.tax_rate = tax_rate;
	}
	public Integer getTax_inclusive() {
		return tax_inclusive;
	}
	public void setTax_inclusive(Integer tax_inclusive) {
		this.tax_inclusive = tax_inclusive;
	}
	public String getTax_legend() {
		return tax_legend;
	}
	public void setTax_legend(String tax_legend) {
		this.tax_legend = tax_legend;
	}
	public String getTax_code() {
		return tax_code;
	}
	public void setTax_code(String tax_code) {
		this.tax_code = tax_code;
	}
	public Date getEffective_Datetime() {
		return Effective_Datetime;
	}
	public void setEffective_Datetime(Date effective_Datetime) {
		Effective_Datetime = effective_Datetime;
	}
	public String getNew_Name() {
		return New_Name;
	}
	public void setNew_Name(String new_Name) {
		New_Name = new_Name;
	}
	public BigDecimal getNew_Rate() {
		return New_Rate;
	}
	public void setNew_Rate(BigDecimal new_Rate) {
		New_Rate = new_Rate;
	}
	public Integer getTax_active() {
		return tax_active;
	}
	public void setTax_active(Integer tax_active) {
		this.tax_active = tax_active;
	}
	
}
