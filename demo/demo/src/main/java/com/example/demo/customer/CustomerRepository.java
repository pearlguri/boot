package com.example.demo.customer;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
//<"어떤테이블", "무슨타입">
public interface CustomerRepository extends CrudRepository<Customer, Long> {
	
	List<Customer> findByName(String name);
	
}
