package com.qa.quickstart.Individual_Project.service.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qa.quickstart.Individual_Project.model.Account;
import com.qa.quickstart.Individual_Project.repository.AccountRepository;

@Component 
public class RegisterAccountServiceOperation {
	
	/*@Autowired
	private final AccountRepository accountRepository;
	
	public List<Account>getallAccounts(){
		return accountRepository.findAll();
	}
	
	public Account addAccount(Account account) {
		return accountRepository.save(account);
	}
	
	public Account updateAccount(Account account) {
		return accountRepository.save(account);
	}
	
	public Account deleteAccount(Account account) {
		accountRepository.delete(account);
		return account;
	}
	
	public RegisterAccountServiceOperation(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
		
	}*/
	

}
