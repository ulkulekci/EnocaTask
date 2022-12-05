package com.enoca.ulku.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.enoca.ulku.entities.concretes.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
