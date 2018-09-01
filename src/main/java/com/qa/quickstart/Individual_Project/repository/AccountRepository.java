package com.qa.quickstart.Individual_Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.quickstart.Individual_Project.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long>{
	
	public void deleteById(Long id);
	public Account getById(Long id);


}
