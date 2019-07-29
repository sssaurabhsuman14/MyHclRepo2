package com.bank.application.model;

import java.io.Serializable;
import java.util.Date;

import com.bank.application.entity.Customer;

public class AccountModel implements Serializable {

	private static final long serialVersionUID = 4849417516454642044L;
	private Long accountId;

	private Double balance;

	private Date createdDate;

	private String createdBy;

	private Customer customer;

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
