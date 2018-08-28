package com.qa.quickstart.Individual_Project.service.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qa.quickstart.Individual_Project.model.Account;
import com.qa.quickstart.Individual_Project.repository.AccountRepository;

@Component 
public class RegisterAccountServiceOperation {
	
	private final AccountRepository accountRepository;
	
	@Autowired
	public RegisterAccountServiceOperation(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
		
	}
	public Account execute(Account account) {
		accountRepository.save(account);
		return account;
	}

}
