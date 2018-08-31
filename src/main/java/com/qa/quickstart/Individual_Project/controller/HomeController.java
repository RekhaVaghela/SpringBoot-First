package com.qa.quickstart.Individual_Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.qa.quickstart.Individual_Project.model.Account;
import com.qa.quickstart.Individual_Project.service.account.AccountService;
import com.qa.quickstart.Individual_Project.service.account.RegisterAccountServiceOperation;

@Controller 
public class HomeController {
	
	/*public final AccountService accountService;
	
	@Autowired
	public HomeController(AccountService accountService) {
		this.accountService = accountService;		
	}
	
	@RequestMapping ("/home")
	@ResponseBody 
	public String home() {
		return "accounts";
	}
	
	@RequestMapping ("/create")
	@ResponseBody 
	public Account createAccount(@RequestBody Account account) {
		return RegisterAccountServiceOperation.addAccount(account);
	}
	
	// TODO move and create to account controller class
	@RequestMapping ("/register")
	@ResponseBody 
	public Account register(@RequestBody String account) {
		
		return accountService.register(new Gson().fromJson(account, Account.class));
		
	}*/
	

}
