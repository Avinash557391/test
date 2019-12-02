/* 
 * Author ::. Sivateja Kandula | www.java4s.com 
 *
 */

package com.java4s.app;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java4s.model.Customer;
import com.java4s.model.Student;

@SpringBootApplication
@RestController
public class SpringBootApp {

	@GetMapping(path = "/get-cust-info",produces = MediaType.ALL_VALUE)
	public Customer customerInformation(@ModelAttribute Customer customer) {
		// Customer cust = new Customer();

		customer.setCustNo(100);
		customer.setName("Bank of America");
		customer.setCountry("United States");

		return customer;
	}

	@RequestMapping(path="/getstudentinfo", produces = "application/json")
	public Student studentInformation(@ModelAttribute Student student) {
		// Student std = new Student();

		student.setId(1);
		student.setName("vk");
		student.setStnd("10");

		return student;

	}
	@RequestMapping(path = "/gethealthcheckup",produces="application/json")
	public  String healthCheck(@ModelAttribute SimpleDateFormat formatter,@ModelAttribute Date date) {
		
		return formatter.format(date)+"  application:ok";
		
	}

	public static void main(String[] args) {

		SpringApplication.run(SpringBootApp.class, args);

	}
}