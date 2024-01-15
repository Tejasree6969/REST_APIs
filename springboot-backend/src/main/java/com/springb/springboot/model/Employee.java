package com.springb.springboot.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employees")
public class Employee {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY) 
private Long id;

@Column(name="First_Name",nullable = false)
private String firstName;
@Column(name="Last_Name")
private String lastName;
@Column(name="Email_Address")
private String email;

}
