package com.example.demo.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.CustomLog;
import lombok.Data;

@Data
@Entity
//클래스 명이 테이블명
public class Customer { 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, length = 30)
	private String name;
	private String phone;
}
