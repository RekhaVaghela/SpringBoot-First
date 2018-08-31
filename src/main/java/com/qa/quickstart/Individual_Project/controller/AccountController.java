package com.qa.quickstart.Individual_Project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.quickstart.Individual_Project.model.Account;
import com.qa.quickstart.Individual_Project.service.account.ServiceOperation;

@RestController
@RequestMapping("/")
public class AccountController {
	
	@Autowired
	private ServiceOperation serviceOperation;

	@Autowired
	public AccountController(ServiceOperation serviceOperation) {
		this.serviceOperation = serviceOperation;
	}
	
	@RequestMapping("/homepage")
	@ResponseBody
	public String homepage() {
		return "hello";
	}
	
	@RequestMapping ("/create")
	@ResponseBody
	public Account createAccount(@RequestBody Account account) {
		return serviceOperation.addAccount(account);
	}
	
	@PutMapping ("/update/{id}")
	@ResponseBody
	public Account updateAccount(@PathVariable Long id, @RequestBody Account account) {
		return serviceOperation.updateAccount(id, account);
	}
	
	@DeleteMapping ("/delete/{id}")
	@ResponseBody
	public Account deleteAccount(@RequestBody Long id,  @RequestBody Account account) {
		return serviceOperation.deleteAccount(id, account);
	}

	@RequestMapping ("/getAll")
	@ResponseBody
	public List<Account> getAllAccount() {
		return serviceOperation.getAllAccounts();		
	}

}
