package com.bank.application.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.application.entity.Account;
import com.bank.application.entity.Customer;
import com.bank.application.model.AccountModel;
import com.bank.application.model.CustomerModel;
import com.bank.application.repository.CustomerRepository;
import com.bank.application.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public CustomerModel addCustomer(CustomerModel model) {
		Customer entity = new Customer();
		BeanUtils.copyProperties(model, entity);
		customerRepository.save(entity);
		BeanUtils.copyProperties(entity, model);
		return model;
	}

	@Override
	public CustomerModel getCustomer(Long id) {
		CustomerModel model = new CustomerModel();
		Optional<Customer> entityOptional = customerRepository.findById(id);
		if(entityOptional.isPresent()) {
			Customer entity = entityOptional.get();
			BeanUtils.copyProperties(entity, model);
		}
		return model;
	}

	@Override
	public List<CustomerModel> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerModel updateCustomer(CustomerModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerModel deleteCustomer(CustomerModel model) {
		// TODO Auto-generated method stub
		return null;
	}

}
