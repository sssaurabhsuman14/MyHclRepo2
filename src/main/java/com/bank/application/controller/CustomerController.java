package com.bank.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.application.model.CustomerModel;
import com.bank.application.model.ResponseData;
import com.bank.application.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@PostMapping
	public ResponseEntity<ResponseData> add(@RequestBody CustomerModel model) {
		CustomerModel response = customerService.addCustomer(model);
		ResponseData data = new ResponseData("Ok", "Customer entity saved", response);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ResponseData> get(@PathVariable("id") Long id) {
		CustomerModel response = customerService.getCustomer(id);
		ResponseData data = new ResponseData("Ok", "Customer entity fetched", response);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<ResponseData> update(@RequestBody CustomerModel model) {
		CustomerModel response = customerService.updateCustomer(model);
		ResponseData data = new ResponseData("Ok", "Customer entity updated", response);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@DeleteMapping
	public ResponseEntity<ResponseData> delete(@RequestBody CustomerModel model) {
		CustomerModel response = customerService.deleteCustomer(model);
		ResponseData data = new ResponseData("Ok", "Customer entity deleted", response);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	
}
