package com.yb.entity;

import java.math.BigDecimal;

public class Grades {
	private Integer grade_ID;
	private String grade_Name;
	private Integer grade_Number;
	private Integer price_Profile_ID;
	private String grade_Description;
	private BigDecimal allocation_Limit;
	private Integer alloc_Limit_Type;
	private String oil_Company_Code;
	private Integer tax_Link;
	private Integer group_Link;
	private Integer delivery_Timeout;
	private Integer price_Pole_Segment;
	private Integer grade_Type;
	private Integer grade1_ID;
	private Integer grade2_ID;
	private BigDecimal blend_Ratio;
	private BigDecimal min_Price;
	private BigDecimal max_Price;
	private BigDecimal loss_Tolerance;
	private BigDecimal gain_Tolerance;
	private Boolean is_Enabled;
	private Integer deleted;
	private Integer volume_Unit_ID;
	private Integer gsapExport;
	public Grades() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Grades(Integer grade_ID, String grade_Name, Integer grade_Number,
			Integer price_Profile_ID, String grade_Description,
			BigDecimal allocation_Limit, Integer alloc_Limit_Type,
			String oil_Company_Code, Integer tax_Link, Integer group_Link,
			Integer delivery_Timeout, Integer price_Pole_Segment,
			Integer grade_Type, Integer grade1_ID, Integer grade2_ID,
			BigDecimal blend_Ratio, BigDecimal min_Price, BigDecimal max_Price,
			BigDecimal loss_Tolerance, BigDecimal gain_Tolerance,
			Boolean is_Enabled, Integer deleted, Integer volume_Unit_ID,
			Integer gsapExport) {
		super();
		this.grade_ID = grade_ID;
		this.grade_Name = grade_Name;
		this.grade_Number = grade_Number;
		this.price_Profile_ID = price_Profile_ID;
		this.grade_Description = grade_Description;
		this.allocation_Limit = allocation_Limit;
		this.alloc_Limit_Type = alloc_Limit_Type;
		this.oil_Company_Code = oil_Company_Code;
		this.tax_Link = tax_Link;
		this.group_Link = group_Link;
		this.delivery_Timeout = delivery_Timeout;
		this.price_Pole_Segment = price_Pole_Segment;
		this.grade_Type = grade_Type;
		this.grade1_ID = grade1_ID;
		this.grade2_ID = grade2_ID;
		this.blend_Ratio = blend_Ratio;
		this.min_Price = min_Price;
		this.max_Price = max_Price;
		this.loss_Tolerance = loss_Tolerance;
		this.gain_Tolerance = gain_Tolerance;
		this.is_Enabled = is_Enabled;
		this.deleted = deleted;
		this.volume_Unit_ID = volume_Unit_ID;
		this.gsapExport = gsapExport;
	}
	@Override
	public String toString() {
		return "Grades [grade_ID=" + grade_ID + ", grade_Name=" + grade_Name
				+ ", grade_Number=" + grade_Number + ", price_Profile_ID="
				+ price_Profile_ID + ", grade_Description=" + grade_Description
				+ ", allocation_Limit=" + allocation_Limit
				+ ", alloc_Limit_Type=" + alloc_Limit_Type
				+ ", oil_Company_Code=" + oil_Company_Code + ", tax_Link="
				+ tax_Link + ", group_Link=" + group_Link
				+ ", delivery_Timeout=" + delivery_Timeout
				+ ", price_Pole_Segment=" + price_Pole_Segment
				+ ", grade_Type=" + grade_Type + ", grade1_ID=" + grade1_ID
				+ ", grade2_ID=" + grade2_ID + ", blend_Ratio=" + blend_Ratio
				+ ", min_Price=" + min_Price + ", max_Price=" + max_Price
				+ ", loss_Tolerance=" + loss_Tolerance + ", gain_Tolerance="
				+ gain_Tolerance + ", is_Enabled=" + is_Enabled + ", deleted="
				+ deleted + ", volume_Unit_ID=" + volume_Unit_ID
				+ ", gsapExport=" + gsapExport + "]";
	}
	public Integer getGrade_ID() {
		return grade_ID;
	}
	public void setGrade_ID(Integer grade_ID) {
		this.grade_ID = grade_ID;
	}
	public String getGrade_Name() {
		return grade_Name;
	}
	public void setGrade_Name(String grade_Name) {
		this.grade_Name = grade_Name;
	}
	public Integer getGrade_Number() {
		return grade_Number;
	}
	public void setGrade_Number(Integer grade_Number) {
		this.grade_Number = grade_Number;
	}
	public Integer getPrice_Profile_ID() {
		return price_Profile_ID;
	}
	public void setPrice_Profile_ID(Integer price_Profile_ID) {
		this.price_Profile_ID = price_Profile_ID;
	}
	public String getGrade_Description() {
		return grade_Description;
	}
	public void setGrade_Description(String grade_Description) {
		this.grade_Description = grade_Description;
	}
	public BigDecimal getAllocation_Limit() {
		return allocation_Limit;
	}
	public void setAllocation_Limit(BigDecimal allocation_Limit) {
		this.allocation_Limit = allocation_Limit;
	}
	public Integer getAlloc_Limit_Type() {
		return alloc_Limit_Type;
	}
	public void setAlloc_Limit_Type(Integer alloc_Limit_Type) {
		this.alloc_Limit_Type = alloc_Limit_Type;
	}
	public String getOil_Company_Code() {
		return oil_Company_Code;
	}
	public void setOil_Company_Code(String oil_Company_Code) {
		this.oil_Company_Code = oil_Company_Code;
	}
	public Integer getTax_Link() {
		return tax_Link;
	}
	public void setTax_Link(Integer tax_Link) {
		this.tax_Link = tax_Link;
	}
	public Integer getGroup_Link() {
		return group_Link;
	}
	public void setGroup_Link(Integer group_Link) {
		this.group_Link = group_Link;
	}
	public Integer getDelivery_Timeout() {
		return delivery_Timeout;
	}
	public void setDelivery_Timeout(Integer delivery_Timeout) {
		this.delivery_Timeout = delivery_Timeout;
	}
	public Integer getPrice_Pole_Segment() {
		return price_Pole_Segment;
	}
	public void setPrice_Pole_Segment(Integer price_Pole_Segment) {
		this.price_Pole_Segment = price_Pole_Segment;
	}
	public Integer getGrade_Type() {
		return grade_Type;
	}
	public void setGrade_Type(Integer grade_Type) {
		this.grade_Type = grade_Type;
	}
	public Integer getGrade1_ID() {
		return grade1_ID;
	}
	public void setGrade1_ID(Integer grade1_ID) {
		this.grade1_ID = grade1_ID;
	}
	public Integer getGrade2_ID() {
		return grade2_ID;
	}
	public void setGrade2_ID(Integer grade2_ID) {
		this.grade2_ID = grade2_ID;
	}
	public BigDecimal getBlend_Ratio() {
		return blend_Ratio;
	}
	public void setBlend_Ratio(BigDecimal blend_Ratio) {
		this.blend_Ratio = blend_Ratio;
	}
	public BigDecimal getMin_Price() {
		return min_Price;
	}
	public void setMin_Price(BigDecimal min_Price) {
		this.min_Price = min_Price;
	}
	public BigDecimal getMax_Price() {
		return max_Price;
	}
	public void setMax_Price(BigDecimal max_Price) {
		this.max_Price = max_Price;
	}
	public BigDecimal getLoss_Tolerance() {
		return loss_Tolerance;
	}
	public void setLoss_Tolerance(BigDecimal loss_Tolerance) {
		this.loss_Tolerance = loss_Tolerance;
	}
	public BigDecimal getGain_Tolerance() {
		return gain_Tolerance;
	}
	public void setGain_Tolerance(BigDecimal gain_Tolerance) {
		this.gain_Tolerance = gain_Tolerance;
	}
	public Boolean getIs_Enabled() {
		return is_Enabled;
	}
	public void setIs_Enabled(Boolean is_Enabled) {
		this.is_Enabled = is_Enabled;
	}
	public Integer getDeleted() {
		return deleted;
	}
	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}
	public Integer getVolume_Unit_ID() {
		return volume_Unit_ID;
	}
	public void setVolume_Unit_ID(Integer volume_Unit_ID) {
		this.volume_Unit_ID = volume_Unit_ID;
	}
	public Integer getGsapExport() {
		return gsapExport;
	}
	public void setGsapExport(Integer gsapExport) {
		this.gsapExport = gsapExport;
	}
	
}
