package com.enoca.ulku.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.enoca.ulku.business.abstracts.EmployeeService;
import com.enoca.ulku.business.requests.employeeRequest.CreateEmployeeRequest;
import com.enoca.ulku.business.requests.employeeRequest.DeleteEmployeeRequest;
import com.enoca.ulku.business.requests.employeeRequest.UpdateEmployeeRequest;
import com.enoca.ulku.business.responses.employeeResponse.GetAllEmployeesResponse;
import com.enoca.ulku.business.responses.employeeResponse.UpdateEmployeeResponse;

@Service
public class EmployeeManager implements EmployeeService{

	@Override
	public List<GetAllEmployeesResponse> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(CreateEmployeeRequest createEmployeeRequest) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(DeleteEmployeeRequest deleteEmployeeRequest) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UpdateEmployeeResponse update(UpdateEmployeeRequest updateEmployeeRequest) {
		// TODO Auto-generated method stub
		return null;
	}
 
}
