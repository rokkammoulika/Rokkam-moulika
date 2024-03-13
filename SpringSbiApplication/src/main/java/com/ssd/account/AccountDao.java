package com.ssd.account;

import java.util.List;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public class AccountDao {
	@Autowired
	public HibernateTemplate hibernateTemplate;
	
	public void createAccount(AccountEntity account) {
		hibernateTemplate.save(account);
		
	}
	
	public List<AccountEntity> getAllAccounts(){
		return hibernateTemplate.loadAll(AccountEntity.class);
		
	}
	public AccountEntity getAccountDetails(long accNo) {
		return hibernateTemplate.get(AccountEntity.class, accNo);
		
	}
	
	public void updateAccount(AccountEntity account) {
		hibernateTemplate.update(account);
	}
	public void deleteAccount(long accNo) {
		AccountEntity ac=hibernateTemplate.get(AccountEntity.class, accNo);
		hibernateTemplate.delete(ac);
	}
}
