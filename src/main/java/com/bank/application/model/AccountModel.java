package com.bank.application.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.bank.application.entity.Customer;
import com.bank.application.entity.Transaction;

public class AccountModel implements Serializable {

	private static final long serialVersionUID = 4849417516454642044L;
	private Long accountId;

	private Double balance;

	private Date createdDate;

	private String createdBy;
	
	private String accountType;

	private Customer customer;
	
	private List<Transaction> transactions;

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

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
