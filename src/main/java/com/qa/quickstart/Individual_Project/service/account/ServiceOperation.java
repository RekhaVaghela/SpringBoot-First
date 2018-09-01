package com.qa.quickstart.Individual_Project.service.account;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.qa.quickstart.Individual_Project.model.Account;
import com.qa.quickstart.Individual_Project.repository.AccountRepository;

@Component
public class ServiceOperation {
	@Autowired
	private final AccountRepository accountRepository;
	
	public List<Account>getAllAccounts(){
		return accountRepository.findAll();
	}
	
	public Account addAccount(Account account) {
		return accountRepository.save(account);
	}
	
	public Account updateAccount(Long id, Account account) {
		return accountRepository.save(account);
	}
	
	public Account deleteAccount(Long id) {
		Account account = accountRepository.getById(id);
		accountRepository.deleteById(id);
		return account;
	}
	
	public ServiceOperation(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
		
	}

}
