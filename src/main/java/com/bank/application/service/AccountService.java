package com.bank.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bank.application.model.AccountModel;

@Service
public interface AccountService {

	public AccountModel addAccount(AccountModel model);
	public AccountModel getAccount(Long id);
	public List<AccountModel> getAll();
	public AccountModel updateAccount(AccountModel model);
	public AccountModel deleteAccount(AccountModel model);
	
	
}
