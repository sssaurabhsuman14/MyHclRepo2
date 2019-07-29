package com.bank.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bank.application.model.CustomerModel;

@Service
public interface CustomerService {
	
	public CustomerModel addCustomer(CustomerModel model);
	public CustomerModel getCustomer(Long id);
	public List<CustomerModel> getAll();
	public CustomerModel updateCustomer(CustomerModel model);
	public CustomerModel deleteCustomer(CustomerModel model);
}
