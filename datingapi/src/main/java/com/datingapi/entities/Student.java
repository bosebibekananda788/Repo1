package com.datingapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue (strategy=GenerationType.SEQUENCE)
	private Long studentId;
	private String firstName;
	private String lastName;
	@Column(name="email_id", nullable=false)
	private String emailId;
	private String guardianName;
	private String guardianEmail;
	private String guardianMobile;
	

}
