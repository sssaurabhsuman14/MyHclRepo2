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

import com.bank.application.model.AccountModel;
import com.bank.application.model.ResponseData;
import com.bank.application.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	AccountService accountService;

	@PostMapping
	public ResponseEntity<ResponseData> add(@RequestBody AccountModel model) {
		AccountModel response = accountService.addAccount(model);
		ResponseData data = new ResponseData("Ok", "Account entity saved", response);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ResponseData> get(@PathVariable("id") Long id) {
		AccountModel response = accountService.getAccount(id);
		ResponseData data = new ResponseData("Ok", "Account entity fetched", response);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<ResponseData> update(@RequestBody AccountModel model) {
		AccountModel response = accountService.updateAccount(model);
		ResponseData data = new ResponseData("Ok", "Account entity updated", response);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@DeleteMapping
	public ResponseEntity<ResponseData> delete(@RequestBody AccountModel model) {
		AccountModel response = accountService.deleteAccount(model);
		ResponseData data = new ResponseData("Ok", "Account entity deleted", response);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

}
