package com.enoca.ulku.business.abstracts;

import java.util.List;


import com.enoca.ulku.business.requests.employeeRequest.CreateEmployeeRequest;
import com.enoca.ulku.business.requests.employeeRequest.DeleteEmployeeRequest;
import com.enoca.ulku.business.requests.employeeRequest.UpdateEmployeeRequest;
import com.enoca.ulku.business.responses.employeeResponse.GetAllEmployeesResponse;
import com.enoca.ulku.business.responses.employeeResponse.UpdateEmployeeResponse;

public interface EmployeeService {
	List<GetAllEmployeesResponse> getAll();
    void add(CreateEmployeeRequest createEmployeeRequest);
    void delete(DeleteEmployeeRequest deleteEmployeeRequest);
    UpdateEmployeeResponse update(UpdateEmployeeRequest updateEmployeeRequest);
}
