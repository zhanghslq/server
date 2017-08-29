package com.yb.entity;

import java.math.BigDecimal;

public class Departments {
	private Integer department_id;
	private String dept_name;
	private Integer tax_id;
	private BigDecimal dept_upper_halo;
	private BigDecimal dept_lower_halo;
	private BigDecimal dept_preset;
	private Integer dept_keynumber;
	private String dept_keylabel;
	private Integer dept_unit;
	private Integer dept_number;
	private Integer dept_level;
	private Integer dept_status;
	private Integer dept_managed_by;
	private Integer dept_usage;
	public Departments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Departments(Integer department_id, String dept_name, Integer tax_id,
			BigDecimal dept_upper_halo, BigDecimal dept_lower_halo,
			BigDecimal dept_preset, Integer dept_keynumber,
			String dept_keylabel, Integer dept_unit, Integer dept_number,
			Integer dept_level, Integer dept_status, Integer dept_managed_by,
			Integer dept_usage) {
		super();
		this.department_id = department_id;
		this.dept_name = dept_name;
		this.tax_id = tax_id;
		this.dept_upper_halo = dept_upper_halo;
		this.dept_lower_halo = dept_lower_halo;
		this.dept_preset = dept_preset;
		this.dept_keynumber = dept_keynumber;
		this.dept_keylabel = dept_keylabel;
		this.dept_unit = dept_unit;
		this.dept_number = dept_number;
		this.dept_level = dept_level;
		this.dept_status = dept_status;
		this.dept_managed_by = dept_managed_by;
		this.dept_usage = dept_usage;
	}
	@Override
	public String toString() {
		return "Departments [department_id=" + department_id + ", dept_name="
				+ dept_name + ", tax_id=" + tax_id + ", dept_upper_halo="
				+ dept_upper_halo + ", dept_lower_halo=" + dept_lower_halo
				+ ", dept_preset=" + dept_preset + ", dept_keynumber="
				+ dept_keynumber + ", dept_keylabel=" + dept_keylabel
				+ ", dept_unit=" + dept_unit + ", dept_number=" + dept_number
				+ ", dept_level=" + dept_level + ", dept_status=" + dept_status
				+ ", dept_managed_by=" + dept_managed_by + ", dept_usage="
				+ dept_usage + "]";
	}
	public Integer getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public Integer getTax_id() {
		return tax_id;
	}
	public void setTax_id(Integer tax_id) {
		this.tax_id = tax_id;
	}
	public BigDecimal getDept_upper_halo() {
		return dept_upper_halo;
	}
	public void setDept_upper_halo(BigDecimal dept_upper_halo) {
		this.dept_upper_halo = dept_upper_halo;
	}
	public BigDecimal getDept_lower_halo() {
		return dept_lower_halo;
	}
	public void setDept_lower_halo(BigDecimal dept_lower_halo) {
		this.dept_lower_halo = dept_lower_halo;
	}
	public BigDecimal getDept_preset() {
		return dept_preset;
	}
	public void setDept_preset(BigDecimal dept_preset) {
		this.dept_preset = dept_preset;
	}
	public Integer getDept_keynumber() {
		return dept_keynumber;
	}
	public void setDept_keynumber(Integer dept_keynumber) {
		this.dept_keynumber = dept_keynumber;
	}
	public String getDept_keylabel() {
		return dept_keylabel;
	}
	public void setDept_keylabel(String dept_keylabel) {
		this.dept_keylabel = dept_keylabel;
	}
	public Integer getDept_unit() {
		return dept_unit;
	}
	public void setDept_unit(Integer dept_unit) {
		this.dept_unit = dept_unit;
	}
	public Integer getDept_number() {
		return dept_number;
	}
	public void setDept_number(Integer dept_number) {
		this.dept_number = dept_number;
	}
	public Integer getDept_level() {
		return dept_level;
	}
	public void setDept_level(Integer dept_level) {
		this.dept_level = dept_level;
	}
	public Integer getDept_status() {
		return dept_status;
	}
	public void setDept_status(Integer dept_status) {
		this.dept_status = dept_status;
	}
	public Integer getDept_managed_by() {
		return dept_managed_by;
	}
	public void setDept_managed_by(Integer dept_managed_by) {
		this.dept_managed_by = dept_managed_by;
	}
	public Integer getDept_usage() {
		return dept_usage;
	}
	public void setDept_usage(Integer dept_usage) {
		this.dept_usage = dept_usage;
	}
	
}
