package com.yb.entity;

import java.io.Serializable;


	/**
	 * 
	 */
public class Status implements Serializable{
	private static final long serialVersionUID = 1L;
	private String status;
	private String message;
	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Status(String status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	
	public Status(String status) {
		super();
		this.status = status;
	}
	@Override
	public String toString() {
		return "Status [status=" + status + ", message=" + message + "]";
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
