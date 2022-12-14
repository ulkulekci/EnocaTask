package com.enoca.ulku.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import com.enoca.ulku.entities.concretes.Employee;


public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	boolean existsByNameContainingIgnoreCase(String name);
	boolean existsById(int id);
}
