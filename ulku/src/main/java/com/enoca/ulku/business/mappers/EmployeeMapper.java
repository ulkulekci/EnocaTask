package com.enoca.ulku.business.mappers;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.enoca.ulku.business.requests.employeeRequest.CreateEmployeeRequest;
import com.enoca.ulku.business.requests.employeeRequest.UpdateEmployeeRequest;
import com.enoca.ulku.business.responses.employeeResponse.CreateEmployeeResponse;
import com.enoca.ulku.business.responses.employeeResponse.GetAllEmployeeResponse;
import com.enoca.ulku.business.responses.employeeResponse.GetEmployeeResponse;
import com.enoca.ulku.business.responses.employeeResponse.UpdateEmployeeResponse;
import com.enoca.ulku.entities.concretes.Employee;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
	@Mapping(source = "company.name", target = "companyName")
    GetAllEmployeeResponse toGetAllEmployeeResponse(Employee employee);
    List<GetAllEmployeeResponse> toGetAllEmployeeResponse(List<Employee> employees);
    @Mapping(source = "company.name", target = "companyName")
    GetEmployeeResponse toEmployee(Employee employee);
    @Mapping(source = "companyId", target = "company.id")
    Employee toEmployee(CreateEmployeeRequest request);
    @Mapping(source = "company.id", target = "companyId")
    CreateEmployeeResponse toCreateEmployeeResponse(Employee employee);
    @Mapping(source = "companyId", target = "company.id")
    void update(@MappingTarget Employee employee, UpdateEmployeeRequest request);
    @Mapping(source = "company.id", target = "companyId")
    UpdateEmployeeResponse toUpdateEmployeeResponse(Employee employee);
}
