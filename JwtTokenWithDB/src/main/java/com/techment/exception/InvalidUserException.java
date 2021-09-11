package com.techment.exception;

public class InvalidUserException extends RuntimeException {
	String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public InvalidUserException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
		this.msg = msg;
	}
}