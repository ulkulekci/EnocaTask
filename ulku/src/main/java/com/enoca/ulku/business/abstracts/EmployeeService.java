package com.enoca.ulku.business.abstracts;

import java.util.List;


import com.enoca.ulku.business.requests.employeeRequest.CreateEmployeeRequest;
import com.enoca.ulku.business.requests.employeeRequest.UpdateEmployeeRequest;
import com.enoca.ulku.business.responses.employeeResponse.CreateEmployeeResponse;
import com.enoca.ulku.business.responses.employeeResponse.GetAllEmployeeResponse;
import com.enoca.ulku.business.responses.employeeResponse.GetEmployeeResponse;
import com.enoca.ulku.business.responses.employeeResponse.UpdateEmployeeResponse;

public interface EmployeeService {
	List<GetAllEmployeeResponse> getAll();
    GetEmployeeResponse getById(int id);
    CreateEmployeeResponse create(CreateEmployeeRequest request);
    UpdateEmployeeResponse update(UpdateEmployeeRequest request, int id);
    void delete(int id);
}
