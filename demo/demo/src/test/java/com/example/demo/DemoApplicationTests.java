package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.customer.Customer;
import com.example.demo.customer.CustomerRepository;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	CustomerRepository customerRepo;
	
	@Test
	void findByName() {
		List<Customer> list = customerRepo.findByName("이순신");
		System.out.println(list);
		assertEquals("이순신", list.get(0).getName());
	}
	
	@Test
	void findAll() {
		Iterable<Customer> list = customerRepo.findAll();
//		list.forEach(cust -> System.out.println(cust.getName()));
		Iterator<Customer> iter = list.iterator();
		while (iter.hasNext()) {
			Customer cust = iter.next();
			System.out.println(cust.getName());
			
		}
	}
	
	//@Test
	void save() {
			Customer cust = new Customer();
			//기본키없으면 등록, 있으면 수정
			
			cust.setName("잔다르크");
			cust.setPhone("011-1111");
			Customer result = customerRepo.save(cust);
			assertEquals(cust.getName(), result.getName());
	}

}
