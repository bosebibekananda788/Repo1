package com.datingapi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

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
public class Department {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long departmentId;
	
	@NotBlank(message="Please add department Name")
	private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
