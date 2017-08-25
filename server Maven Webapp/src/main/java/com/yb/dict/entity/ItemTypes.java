package com.yb.dict.entity;

public class ItemTypes {
	private Integer item_type;
	private String item_type_descr;
	private Integer refundable;
	private Integer compulsory_receipt;
	public ItemTypes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ItemTypes(Integer item_type, String item_type_descr,
			Integer refundable, Integer compulsory_receipt) {
		super();
		this.item_type = item_type;
		this.item_type_descr = item_type_descr;
		this.refundable = refundable;
		this.compulsory_receipt = compulsory_receipt;
	}
	@Override
	public String toString() {
		return "ItemTypes [item_type=" + item_type + ", item_type_descr="
				+ item_type_descr + ", refundable=" + refundable
				+ ", compulsory_receipt=" + compulsory_receipt + "]";
	}
	public Integer getItem_type() {
		return item_type;
	}
	public void setItem_type(Integer item_type) {
		this.item_type = item_type;
	}
	public String getItem_type_descr() {
		return item_type_descr;
	}
	public void setItem_type_descr(String item_type_descr) {
		this.item_type_descr = item_type_descr;
	}
	public Integer getRefundable() {
		return refundable;
	}
	public void setRefundable(Integer refundable) {
		this.refundable = refundable;
	}
	public Integer getCompulsory_receipt() {
		return compulsory_receipt;
	}
	public void setCompulsory_receipt(Integer compulsory_receipt) {
		this.compulsory_receipt = compulsory_receipt;
	}
	
}
