package com.enoca.ulku.business.concretes;
import java.util.List;

import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enoca.ulku.business.abstracts.EmployeeService;
import com.enoca.ulku.business.constants.Message;
import com.enoca.ulku.business.mappers.EmployeeMapper;
import com.enoca.ulku.business.requests.employeeRequest.CreateEmployeeRequest;
import com.enoca.ulku.business.requests.employeeRequest.UpdateEmployeeRequest;
import com.enoca.ulku.business.responses.employeeResponse.CreateEmployeeResponse;
import com.enoca.ulku.business.responses.employeeResponse.GetAllEmployeeResponse;
import com.enoca.ulku.business.responses.employeeResponse.GetEmployeeResponse;
import com.enoca.ulku.business.responses.employeeResponse.UpdateEmployeeResponse;
import com.enoca.ulku.dataAccess.EmployeeRepository;
import com.enoca.ulku.entities.concretes.Employee;



@Service
public class EmployeeManager implements EmployeeService{
	
	  EmployeeRepository employeeRepository;
	  @Autowired
	  EmployeeMapper employeemapper;

	@Override
	public List<GetAllEmployeeResponse> getAll() {
		List<Employee> employees = employeeRepository.findAll();
        return employeemapper.toGetAllEmployeeResponse(employees);
	}

	@Override
	public GetEmployeeResponse getById(int id) {
		 Employee employee = employeeRepository.findById(id).get();
	        return employeemapper.toEmployee(employee);
	}

	@Override
	public CreateEmployeeResponse create(CreateEmployeeRequest request) {
		Employee employee = employeemapper.toEmployee(request);

        if (checkEmployeeNameValid(employee)) {
            throw new RuntimeException(Message.COMPANY_NAME_IS_NOT_VALID);
        }

        if (isEmployeeExists(employee)) {
            throw new RuntimeException(Message.COMPANY_ALREADY_EXISTS);
        }

        employeeRepository.save(employee);

        return employeemapper.toCreateEmployeeResponse(employee);
	}


	@Override
	public UpdateEmployeeResponse update(UpdateEmployeeRequest request, int id) {
		Employee employee = employeeRepository.findById(id).get();
		employeemapper.update(employee, request);

        if (checkEmployeeNameValid(employee)) {
            throw new RuntimeException(Message.COMPANY_NAME_IS_NOT_VALID);
        }

        if (employee.getCompany().getId() == request.getCompanyId()) {
            if (isEmployeeExists(employee)) {
                throw new RuntimeException(Message.COMPANY_ALREADY_EXISTS);
            }
        }

        
        try {
            employeeRepository.save(employee);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            employeeRepository.save(employee);
        }

        return employeemapper.toUpdateEmployeeResponse(employee);
	}

	@Override
	public void delete(int id) {
		employeeRepository.deleteById(id);
		
	}
	public boolean isEmployeeExists(Employee employee) {
		 return employeeRepository.existsByName(employee.getName());
	}

	public boolean checkEmployeeNameValid(Employee employee) {
		 return employee.getName().isEmpty() || employee.getName().isBlank();
	}

	
}
