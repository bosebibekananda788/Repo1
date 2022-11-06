package com.datingapi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor 
@NoArgsConstructor
public class UserAccount {
	
	@Id
	@GeneratedValue
	private int id;
	private String userName;
	private String password;
	private int age;
	private String gender;
	private String phoneNumber;
	private String City;
	private String email;
	private String country;
	
	@OneToOne(mappedBy="userAccount")
	private Interest interest;

}
