package com.ssd.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	@Autowired
	public AccountDao accountDao;
	public void createAccount(AccountEntity account) {
		 accountDao.createAccount(account);
	}
	public List<AccountEntity> getAllAccounts(){
		return accountDao.getAllAccounts();
		
	}
	public AccountEntity getAccountDetails(long accNo) {
		return accountDao.getAccountDetails(accNo);
	}
	public void updateAccount(AccountEntity account) {
		accountDao.updateAccount(account);
	}
	public void deleteAccount(long accNo) {
		accountDao.deleteAccount(accNo);
	}
}
