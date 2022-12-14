package com.enoca.ulku.business.mappers;

import com.enoca.ulku.business.requests.employeeRequest.CreateEmployeeRequest;
import com.enoca.ulku.business.requests.employeeRequest.UpdateEmployeeRequest;
import com.enoca.ulku.business.responses.employeeResponse.CreateEmployeeResponse;
import com.enoca.ulku.business.responses.employeeResponse.GetAllEmployeeResponse;
import com.enoca.ulku.business.responses.employeeResponse.UpdateEmployeeResponse;
import com.enoca.ulku.entities.concretes.Company;
import com.enoca.ulku.entities.concretes.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-14T14:32:19+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 18.0.2.1 (Oracle Corporation)"
)
@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public GetAllEmployeeResponse toGetAllEmployeeResponse(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        GetAllEmployeeResponse getAllEmployeeResponse = new GetAllEmployeeResponse();

        getAllEmployeeResponse.setCompanyName( employeeCompanyName( employee ) );
        getAllEmployeeResponse.setId( employee.getId() );
        getAllEmployeeResponse.setName( employee.getName() );

        return getAllEmployeeResponse;
    }

    @Override
    public List<GetAllEmployeeResponse> toGetAllEmployeeResponse(List<Employee> employees) {
        if ( employees == null ) {
            return null;
        }

        List<GetAllEmployeeResponse> list = new ArrayList<GetAllEmployeeResponse>( employees.size() );
        for ( Employee employee : employees ) {
            list.add( toGetAllEmployeeResponse( employee ) );
        }

        return list;
    }

    @Override
    public Employee toEmployee(CreateEmployeeRequest request) {
        if ( request == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setCompany( createEmployeeRequestToCompany( request ) );
        employee.setName( request.getName() );

        return employee;
    }

    @Override
    public CreateEmployeeResponse toCreateEmployeeResponse(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        CreateEmployeeResponse createEmployeeResponse = new CreateEmployeeResponse();

        createEmployeeResponse.setCompanyId( employeeCompanyId( employee ) );
        createEmployeeResponse.setId( employee.getId() );
        createEmployeeResponse.setName( employee.getName() );

        return createEmployeeResponse;
    }

    @Override
    public void update(Employee employee, UpdateEmployeeRequest request) {
        if ( request == null ) {
            return;
        }

        if ( employee.getCompany() == null ) {
            employee.setCompany( Company.builder().build() );
        }
        updateEmployeeRequestToCompany( request, employee.getCompany() );
        employee.setName( request.getName() );
    }

    @Override
    public UpdateEmployeeResponse toUpdateEmployeeResponse(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        UpdateEmployeeResponse updateEmployeeResponse = new UpdateEmployeeResponse();

        updateEmployeeResponse.setCompanyId( employeeCompanyId( employee ) );
        updateEmployeeResponse.setId( employee.getId() );
        updateEmployeeResponse.setName( employee.getName() );

        return updateEmployeeResponse;
    }

    private String employeeCompanyName(Employee employee) {
        if ( employee == null ) {
            return null;
        }
        Company company = employee.getCompany();
        if ( company == null ) {
            return null;
        }
        String name = company.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    protected Company createEmployeeRequestToCompany(CreateEmployeeRequest createEmployeeRequest) {
        if ( createEmployeeRequest == null ) {
            return null;
        }

        Company.CompanyBuilder company = Company.builder();

        company.id( createEmployeeRequest.getCompanyId() );

        return company.build();
    }

    private int employeeCompanyId(Employee employee) {
        if ( employee == null ) {
            return 0;
        }
        Company company = employee.getCompany();
        if ( company == null ) {
            return 0;
        }
        int id = company.getId();
        return id;
    }

    protected void updateEmployeeRequestToCompany(UpdateEmployeeRequest updateEmployeeRequest, Company mappingTarget) {
        if ( updateEmployeeRequest == null ) {
            return;
        }

        mappingTarget.setId( updateEmployeeRequest.getCompanyId() );
    }
}
