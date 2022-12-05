package com.enoca.ulku.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enoca.ulku.business.abstracts.EmployeeService;
import com.enoca.ulku.business.requests.employeeRequest.CreateEmployeeRequest;
import com.enoca.ulku.business.requests.employeeRequest.DeleteEmployeeRequest;
import com.enoca.ulku.business.requests.employeeRequest.UpdateEmployeeRequest;
import com.enoca.ulku.business.responses.employeeResponse.GetAllEmployeesResponse;
import com.enoca.ulku.business.responses.employeeResponse.UpdateEmployeeResponse;

@RestController 
@RequestMapping("/api/employees")
public class EmployeesController {
    private EmployeeService employeeservice;
    
    @Autowired
	public EmployeesController(EmployeeService employeeservice) {
		super();
		this.employeeservice = employeeservice;
	}
    @GetMapping("/getAll")
    public List<GetAllEmployeesResponse> getAll(){
        return employeeservice.getAll();
    }

    @PostMapping("/add")
    public void add(CreateEmployeeRequest createEmployeeRequest) {
    	employeeservice.add(createEmployeeRequest);
    }

    @DeleteMapping("/delete")
    public void delete(DeleteEmployeeRequest deleteEmployeeRequest) {
    	employeeservice.delete(deleteEmployeeRequest);
    }

    @PutMapping("/update")
    public UpdateEmployeeResponse update(UpdateEmployeeRequest updateEmployeeRequest) {
        return employeeservice.update(updateEmployeeRequest);
    }
	
    
}
