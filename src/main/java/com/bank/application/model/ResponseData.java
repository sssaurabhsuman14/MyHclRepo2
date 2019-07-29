package com.bank.application.model;

import org.springframework.stereotype.Component;

@Component
public class ResponseData {

	private String status;
	private String message;
	private Object object;

	public ResponseData(String status, String message, Object object) {
		super();
		this.status = status;
		this.message = message;
		this.object = object;
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

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

}
