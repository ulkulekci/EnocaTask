package com.enoca.ulku.webApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.enoca.ulku.business.abstracts.EmployeeService;
import com.enoca.ulku.business.requests.employeeRequest.CreateEmployeeRequest;
import com.enoca.ulku.business.requests.employeeRequest.UpdateEmployeeRequest;
import com.enoca.ulku.business.responses.employeeResponse.CreateEmployeeResponse;
import com.enoca.ulku.business.responses.employeeResponse.GetAllEmployeeResponse;
import com.enoca.ulku.business.responses.employeeResponse.GetEmployeeResponse;
import com.enoca.ulku.business.responses.employeeResponse.UpdateEmployeeResponse;

@RestController 
@RequestMapping("/api/employees")
public class EmployeesController {
    private final EmployeeService employeeservice;
    
	public EmployeesController(EmployeeService employeeservice) {
		this.employeeservice = employeeservice;
	}
    @GetMapping(name = "GetAllEmployees")
    public List<GetAllEmployeeResponse> getAll() {
        return employeeservice.getAll();
    }

    @GetMapping(name = "GetEmployeeById", path = "/{id}")
    public GetEmployeeResponse getById(@PathVariable int id) {
        return employeeservice.getById(id);
    }

    @PostMapping(name = "CreateEmployee")
    @ResponseStatus(code = HttpStatus.CREATED)
    public CreateEmployeeResponse create(@RequestBody CreateEmployeeRequest employee) {
        return employeeservice.create(employee);
    }

    @PutMapping(name = "UpdateEmployee", path = "/{id}")
    public UpdateEmployeeResponse update(@RequestBody UpdateEmployeeRequest employee, @PathVariable int id) {
        return employeeservice.update(employee, id);
    }

    @DeleteMapping(name = "DeleteEmployee", path = "/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id) {
    	employeeservice.delete(id);
    }
    
}
