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
import com.enoca.ulku.business.responses.employeeResponse.UpdateEmployeeResponse;

@RestController 
@RequestMapping("/api/employees")
public class EmployeesController {
    private final EmployeeService employeeService;

    public EmployeesController( EmployeeService employeeService){
       this.employeeService=  employeeService;
    }



    @GetMapping("GetAllEmployees")
    public List<GetAllEmployeeResponse> getAll() {
        return employeeService.getAll();
    }

    @PostMapping(name = "CreateEmployee",path = ("/add"))
    @ResponseStatus(code = HttpStatus.CREATED)
    public CreateEmployeeResponse create(@RequestBody CreateEmployeeRequest employee) {
        return employeeService.create(employee);
    }

    @PutMapping(name = "UpdateEmployee", path = "/update{id}")
    public UpdateEmployeeResponse update(@RequestBody UpdateEmployeeRequest employee, @PathVariable int id) {
        return employeeService.update(employee, id);
    }

    @DeleteMapping(name = "DeleteEmployee", path = "/delete{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id) {
        employeeService.delete(id);
    }
    
}
