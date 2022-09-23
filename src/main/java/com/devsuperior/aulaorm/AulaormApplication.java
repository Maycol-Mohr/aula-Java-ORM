package com.devsuperior.aulaorm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.aulaorm.entities.Employee;
import com.devsuperior.aulaorm.repositories.EmployeeRepository;

@SpringBootApplication
public class AulaormApplication implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AulaormApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<Employee> result = repository.findAll();
		
		for(Employee emp : result) {
			System.out.println(emp);
		}
		
//		Department d1 = new Department(1L, "Vendas");
//		Department d2 = new Department(2L, "Marketing");
//		
//		Employee e1 = new Employee(1L, "Maria", 6000.00, d1);
//		
//		System.out.println(d1);
//		System.out.println(d2);
//		
//		System.out.println(e1);	
	}
}