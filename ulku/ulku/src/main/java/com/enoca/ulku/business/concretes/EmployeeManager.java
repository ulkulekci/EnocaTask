package com.enoca.ulku.business.concretes;
import java.util.List;
import java.util.Objects;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import com.enoca.ulku.business.abstracts.EmployeeService;
import com.enoca.ulku.business.mappers.EmployeeMapper;
import com.enoca.ulku.business.requests.employeeRequest.CreateEmployeeRequest;
import com.enoca.ulku.business.requests.employeeRequest.UpdateEmployeeRequest;
import com.enoca.ulku.business.responses.employeeResponse.CreateEmployeeResponse;
import com.enoca.ulku.business.responses.employeeResponse.GetAllEmployeeResponse;
import com.enoca.ulku.business.responses.employeeResponse.UpdateEmployeeResponse;
import com.enoca.ulku.dataAccess.EmployeeRepository;
import com.enoca.ulku.entities.concretes.Employee;


@AllArgsConstructor
@Service
public class EmployeeManager implements EmployeeService{
	  EmployeeRepository employeeRepository;
	  EmployeeMapper mapper;

	@Override
	public List<GetAllEmployeeResponse> getAll() {
		List<Employee> employees = employeeRepository.findAll();
        return mapper.toGetAllEmployeeResponse(employees);
	}

	@Override
	public CreateEmployeeResponse create(CreateEmployeeRequest request) {
		checkIfNameDuplicated(request.getName());
		checkIfNameIsEmptyOrNull(request.getName());
		checkIfIdExists(request.getCompanyId());
		Employee employee = mapper.toEmployee(request);
        employeeRepository.save(employee);
        return mapper.toCreateEmployeeResponse(employee);
	}


	@Override
	public UpdateEmployeeResponse update(UpdateEmployeeRequest request, int id) {
		checkIfIdExists(id);
		checkIfNameDuplicated(request.getName());
		checkIfNameIsEmptyOrNull(request.getName());
		Employee employee = employeeRepository.findById(id).get();
		mapper.update(employee, request);
        return mapper.toUpdateEmployeeResponse(employee);
	}

	@Override
	public void delete(int id) {
		checkIfIdExists(id);
		employeeRepository.deleteById(id);
		
	}
	private void checkIfIdExists(int id) {
		if(!this.employeeRepository.existsById(id)) {
			throw new RuntimeException("Id does not exist");
		}
	}
	private void checkIfNameDuplicated(String name){
		if(this.employeeRepository.existsByNameContainingIgnoreCase(name)) {
			throw new RuntimeException("Name already exists");
		}
	}

	private void checkIfNameIsEmptyOrNull(String name){
		if(name.isBlank() || name.isEmpty() || Objects.isNull(name)) {
			throw new RuntimeException("Name cannot be null or empty");
		}
	}


	
}
