package com.bank.application.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.bank.application.entity.Account;

public class CustomerModel implements Serializable {

	private static final long serialVersionUID = 8934060888732414779L;
	private Long customerId;

	private String password;

	private String finalBalance;

	private String dob;

	private Date createdDate;

	List<Account> accounts;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFinalBalance() {
		return finalBalance;
	}

	public void setFinalBalance(String finalBalance) {
		this.finalBalance = finalBalance;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

}
