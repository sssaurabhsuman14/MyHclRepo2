package com.bank.application.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.application.entity.Account;
import com.bank.application.model.AccountModel;
import com.bank.application.repository.AccountRepository;
import com.bank.application.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountRepository accountRepository;

	@Override
	public AccountModel addAccount(AccountModel model) {
		Account entity = new Account();
		BeanUtils.copyProperties(model, entity);
		accountRepository.save(entity);
		BeanUtils.copyProperties(entity, model);
		return model;
	}

	@Override
	public AccountModel getAccount(Long id) {
		AccountModel model = new AccountModel();
		Optional<Account> entityOptional = accountRepository.findById(id);
		if(entityOptional.isPresent()) {
			Account entity = entityOptional.get();
			BeanUtils.copyProperties(entity, model);
		}
		return model;
	}

	@Override
	public List<AccountModel> getAll() {
		return null;
	}

	@Override
	public AccountModel updateAccount(AccountModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountModel deleteAccount(AccountModel model) {
		// TODO Auto-generated method stub
		return null;
	}

}
