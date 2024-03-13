package com.ssd.account;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/account")
public class Account {
	@Autowired
	public AccountService accountService;
	
	@RequestMapping("/msg")
	public String displayMsg() {
		System.out.println("hii this is right");
		return "home";
		
	}
	@PostMapping("/accounts")
    @ResponseBody
	public String createAccount(@RequestBody  AccountEntity account) {
		accountService.createAccount(account);
		return "succes";
	
	}
	@GetMapping("/accounts")
	@ResponseBody
	public List<AccountEntity> getAllAccounts(){
	return	accountService.getAllAccounts();
	}
	@GetMapping("/accounts/{accNo}")
	@ResponseBody
	public AccountEntity getAccountDetails(@PathVariable long accNo) {
		return accountService.getAccountDetails(accNo);
		
	}
	@PutMapping("/accounts/{accNo}")
	@ResponseBody
	public void updateAccount(@RequestBody AccountEntity account) {
		accountService.updateAccount(account);
	}
	@DeleteMapping("/accounts/{accNo}")
	@ResponseBody
	public String deleteAccount(@PathVariable long accNo) {
		 accountService.deleteAccount(accNo);
		 return "Delete Account";
		
	}
}
