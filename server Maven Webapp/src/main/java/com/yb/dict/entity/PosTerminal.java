package com.yb.dict.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PosTerminal {
	private Integer pos_id;
	private Integer pos_number;
	private Integer pos_type;
	private Integer receipt_id;
	private Integer pos_master;
	private Integer display_id;
	private Integer pos_trans_number;
	private Integer pos_training_mode;
	private Integer bir_fuel_receipt_id;
	private Integer bir_non_fuel_receipt_id;
	private Integer bir_fuel_trans_number;
	private Integer bir_non_fuel_trans_number;
	private BigDecimal eft_trans_number;
	private String pos_name;
	private Integer logged_on_cashier;
	private Date logged_on_dt;
	private Integer Alt_Transaction_Number;
	private Integer next_receipt_number;
	private Date gt_open_date;
	private Integer reserve_trans_number;
	public PosTerminal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PosTerminal(Integer pos_id, Integer pos_number, Integer pos_type,
			Integer receipt_id, Integer pos_master, Integer display_id,
			Integer pos_trans_number, Integer pos_training_mode,
			Integer bir_fuel_receipt_id, Integer bir_non_fuel_receipt_id,
			Integer bir_fuel_trans_number, Integer bir_non_fuel_trans_number,
			BigDecimal eft_trans_number, String pos_name,
			Integer logged_on_cashier, Date logged_on_dt,
			Integer alt_Transaction_Number, Integer next_receipt_number,
			Date gt_open_date, Integer reserve_trans_number) {
		super();
		this.pos_id = pos_id;
		this.pos_number = pos_number;
		this.pos_type = pos_type;
		this.receipt_id = receipt_id;
		this.pos_master = pos_master;
		this.display_id = display_id;
		this.pos_trans_number = pos_trans_number;
		this.pos_training_mode = pos_training_mode;
		this.bir_fuel_receipt_id = bir_fuel_receipt_id;
		this.bir_non_fuel_receipt_id = bir_non_fuel_receipt_id;
		this.bir_fuel_trans_number = bir_fuel_trans_number;
		this.bir_non_fuel_trans_number = bir_non_fuel_trans_number;
		this.eft_trans_number = eft_trans_number;
		this.pos_name = pos_name;
		this.logged_on_cashier = logged_on_cashier;
		this.logged_on_dt = logged_on_dt;
		Alt_Transaction_Number = alt_Transaction_Number;
		this.next_receipt_number = next_receipt_number;
		this.gt_open_date = gt_open_date;
		this.reserve_trans_number = reserve_trans_number;
	}
	@Override
	public String toString() {
		return "PosTerminal [pos_id=" + pos_id + ", pos_number=" + pos_number
				+ ", pos_type=" + pos_type + ", receipt_id=" + receipt_id
				+ ", pos_master=" + pos_master + ", display_id=" + display_id
				+ ", pos_trans_number=" + pos_trans_number
				+ ", pos_training_mode=" + pos_training_mode
				+ ", bir_fuel_receipt_id=" + bir_fuel_receipt_id
				+ ", bir_non_fuel_receipt_id=" + bir_non_fuel_receipt_id
				+ ", bir_fuel_trans_number=" + bir_fuel_trans_number
				+ ", bir_non_fuel_trans_number=" + bir_non_fuel_trans_number
				+ ", eft_trans_number=" + eft_trans_number + ", pos_name="
				+ pos_name + ", logged_on_cashier=" + logged_on_cashier
				+ ", logged_on_dt=" + logged_on_dt
				+ ", Alt_Transaction_Number=" + Alt_Transaction_Number
				+ ", next_receipt_number=" + next_receipt_number
				+ ", gt_open_date=" + gt_open_date + ", reserve_trans_number="
				+ reserve_trans_number + "]";
	}
	public Integer getPos_id() {
		return pos_id;
	}
	public void setPos_id(Integer pos_id) {
		this.pos_id = pos_id;
	}
	public Integer getPos_number() {
		return pos_number;
	}
	public void setPos_number(Integer pos_number) {
		this.pos_number = pos_number;
	}
	public Integer getPos_type() {
		return pos_type;
	}
	public void setPos_type(Integer pos_type) {
		this.pos_type = pos_type;
	}
	public Integer getReceipt_id() {
		return receipt_id;
	}
	public void setReceipt_id(Integer receipt_id) {
		this.receipt_id = receipt_id;
	}
	public Integer getPos_master() {
		return pos_master;
	}
	public void setPos_master(Integer pos_master) {
		this.pos_master = pos_master;
	}
	public Integer getDisplay_id() {
		return display_id;
	}
	public void setDisplay_id(Integer display_id) {
		this.display_id = display_id;
	}
	public Integer getPos_trans_number() {
		return pos_trans_number;
	}
	public void setPos_trans_number(Integer pos_trans_number) {
		this.pos_trans_number = pos_trans_number;
	}
	public Integer getPos_training_mode() {
		return pos_training_mode;
	}
	public void setPos_training_mode(Integer pos_training_mode) {
		this.pos_training_mode = pos_training_mode;
	}
	public Integer getBir_fuel_receipt_id() {
		return bir_fuel_receipt_id;
	}
	public void setBir_fuel_receipt_id(Integer bir_fuel_receipt_id) {
		this.bir_fuel_receipt_id = bir_fuel_receipt_id;
	}
	public Integer getBir_non_fuel_receipt_id() {
		return bir_non_fuel_receipt_id;
	}
	public void setBir_non_fuel_receipt_id(Integer bir_non_fuel_receipt_id) {
		this.bir_non_fuel_receipt_id = bir_non_fuel_receipt_id;
	}
	public Integer getBir_fuel_trans_number() {
		return bir_fuel_trans_number;
	}
	public void setBir_fuel_trans_number(Integer bir_fuel_trans_number) {
		this.bir_fuel_trans_number = bir_fuel_trans_number;
	}
	public Integer getBir_non_fuel_trans_number() {
		return bir_non_fuel_trans_number;
	}
	public void setBir_non_fuel_trans_number(Integer bir_non_fuel_trans_number) {
		this.bir_non_fuel_trans_number = bir_non_fuel_trans_number;
	}
	public BigDecimal getEft_trans_number() {
		return eft_trans_number;
	}
	public void setEft_trans_number(BigDecimal eft_trans_number) {
		this.eft_trans_number = eft_trans_number;
	}
	public String getPos_name() {
		return pos_name;
	}
	public void setPos_name(String pos_name) {
		this.pos_name = pos_name;
	}
	public Integer getLogged_on_cashier() {
		return logged_on_cashier;
	}
	public void setLogged_on_cashier(Integer logged_on_cashier) {
		this.logged_on_cashier = logged_on_cashier;
	}
	public Date getLogged_on_dt() {
		return logged_on_dt;
	}
	public void setLogged_on_dt(Date logged_on_dt) {
		this.logged_on_dt = logged_on_dt;
	}
	public Integer getAlt_Transaction_Number() {
		return Alt_Transaction_Number;
	}
	public void setAlt_Transaction_Number(Integer alt_Transaction_Number) {
		Alt_Transaction_Number = alt_Transaction_Number;
	}
	public Integer getNext_receipt_number() {
		return next_receipt_number;
	}
	public void setNext_receipt_number(Integer next_receipt_number) {
		this.next_receipt_number = next_receipt_number;
	}
	public Date getGt_open_date() {
		return gt_open_date;
	}
	public void setGt_open_date(Date gt_open_date) {
		this.gt_open_date = gt_open_date;
	}
	public Integer getReserve_trans_number() {
		return reserve_trans_number;
	}
	public void setReserve_trans_number(Integer reserve_trans_number) {
		this.reserve_trans_number = reserve_trans_number;
	}
	
}
