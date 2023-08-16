package com.example.webapiexamples;

import com.example.webapiexamples.dao.ICustomerRepository;
import com.example.webapiexamples.models.Customer;
import com.example.webapiexamples.services.CustomerService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class WebApiExamplesApplicationTests {
	@Autowired
	CustomerService customerService;

	@Test
	void contextLoads() {
	}

	@Test
	void findCustomerById(){
		Customer targetCustomer = Customer.builder()
				.customerNumber(103L)
				.customerName("Atelier graphique")
				.contactLastName("Schmitt")
				.contactFirstName("Carine ")
				.phone("40.32.2555")
				.addressLine1("54, rue Royale")
				.addressLine2(null)
				.city("Nantes")
				.state(null)
				.postalCode("44000")
				.country("France")
				.salesRepEmployeeNumber(1370)
				.creditLimit(21000L)
				.build();
		Customer customer = customerService.findByCustomerNumber(103L);
		assertEquals(customer, targetCustomer);
	}

	@Test
	public void findAllCustomers(){
		List<Customer> customers = customerService.findAll();
		assertEquals(122, customers.size());
	}

}
