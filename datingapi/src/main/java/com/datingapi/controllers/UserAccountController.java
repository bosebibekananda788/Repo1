package com.datingapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datingapi.entities.Interest;
import com.datingapi.entities.UserAccount;
import com.datingapi.repos.InterestRepository;
import com.datingapi.repos.UserAccountRepository;

@RestController
@RequestMapping("/api/")
public class UserAccountController {

	@Autowired
	private UserAccountRepository userRepo;
	@Autowired
	private InterestRepository interestRepo;
	
	
	
	@PostMapping("users/register-user")
	public UserAccount registerUser(@RequestBody UserAccount userAccount)
	{
		
		return userRepo.save(userAccount);
	}
	
	
	@PostMapping("interests/update")
	public Interest updateInterest(@RequestBody Interest interest)
	{
		
	UserAccount userAccount=	userRepo.findById(interest.getUserAccountId()).get();
		
	interest.setUserAccount(userAccount);
	
	
	return interestRepo.save(interest);
	}
	
	@GetMapping("users/get/all")
	public List<UserAccount> getUsers()
	{
		return userRepo.findAll();
	}
	
	
	@GetMapping("users/get/specific/user/{userName}")
	public List<UserAccount> getSpecificUser(@PathVariable("userName") String userName)
	{
		return userRepo.findSpecificName(userName);
	}
	
	
	@DeleteMapping("users/delete/{interestId}")
	public void deleteInterest(@PathVariable("interestId")int id)
	
	{
		interestRepo.deleteById(id);
		
	}
	
	@GetMapping("users/matches/{id}")
	public List<UserAccount> findMatches(@PathVariable("id") int id)
	{
		
		UserAccount userAccount= userRepo.findById(id).get();
		return userRepo.findMatches(userAccount.getAge(),userAccount.getCity(),userAccount.getCountry(),userAccount.getId());
		
		
	}
	
	
	
	
	
}
