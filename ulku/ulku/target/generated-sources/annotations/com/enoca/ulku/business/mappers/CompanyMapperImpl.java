package com.enoca.ulku.business.mappers;

import com.enoca.ulku.business.requests.companyRequest.CreateCompanyRequest;
import com.enoca.ulku.business.requests.companyRequest.UpdateCompanyRequest;
import com.enoca.ulku.business.responses.companyResponse.CreateCompanyResponse;
import com.enoca.ulku.business.responses.companyResponse.GetAllCompanyResponse;
import com.enoca.ulku.business.responses.companyResponse.UpdateCompanyResponse;
import com.enoca.ulku.business.responses.employeeResponse.EmployeeResponse;
import com.enoca.ulku.entities.concretes.Company;
import com.enoca.ulku.entities.concretes.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-14T14:32:47+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 18.0.2.1 (Oracle Corporation)"
)
@Component
public class CompanyMapperImpl implements CompanyMapper {

    @Override
    public GetAllCompanyResponse toGetAllCompanyResponse(Company company) {
        if ( company == null ) {
            return null;
        }

        GetAllCompanyResponse getAllCompanyResponse = new GetAllCompanyResponse();

        getAllCompanyResponse.setId( company.getId() );
        getAllCompanyResponse.setName( company.getName() );
        getAllCompanyResponse.setEmployees( employeeListToEmployeeResponseList( company.getEmployees() ) );

        return getAllCompanyResponse;
    }

    @Override
    public List<GetAllCompanyResponse> toGetAllCompanyResponse(List<Company> companies) {
        if ( companies == null ) {
            return null;
        }

        List<GetAllCompanyResponse> list = new ArrayList<GetAllCompanyResponse>( companies.size() );
        for ( Company company : companies ) {
            list.add( toGetAllCompanyResponse( company ) );
        }

        return list;
    }

    @Override
    public Company toCompany(CreateCompanyRequest request) {
        if ( request == null ) {
            return null;
        }

        Company.CompanyBuilder company = Company.builder();

        company.name( request.getName() );

        return company.build();
    }

    @Override
    public CreateCompanyResponse toCreateCompanyResponse(Company company) {
        if ( company == null ) {
            return null;
        }

        CreateCompanyResponse createCompanyResponse = new CreateCompanyResponse();

        createCompanyResponse.setId( company.getId() );
        createCompanyResponse.setName( company.getName() );
        createCompanyResponse.setEmployees( employeeListToEmployeeResponseList( company.getEmployees() ) );

        return createCompanyResponse;
    }

    @Override
    public void update(Company company, UpdateCompanyRequest request) {
        if ( request == null ) {
            return;
        }

        company.setName( request.getName() );
    }

    @Override
    public UpdateCompanyResponse toUpdateCompanyResponse(Company company) {
        if ( company == null ) {
            return null;
        }

        UpdateCompanyResponse updateCompanyResponse = new UpdateCompanyResponse();

        updateCompanyResponse.setId( company.getId() );
        updateCompanyResponse.setName( company.getName() );
        updateCompanyResponse.setEmployees( employeeListToEmployeeResponseList( company.getEmployees() ) );

        return updateCompanyResponse;
    }

    protected EmployeeResponse employeeToEmployeeResponse(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeResponse employeeResponse = new EmployeeResponse();

        employeeResponse.setId( employee.getId() );
        employeeResponse.setName( employee.getName() );

        return employeeResponse;
    }

    protected List<EmployeeResponse> employeeListToEmployeeResponseList(List<Employee> list) {
        if ( list == null ) {
            return null;
        }

        List<EmployeeResponse> list1 = new ArrayList<EmployeeResponse>( list.size() );
        for ( Employee employee : list ) {
            list1.add( employeeToEmployeeResponse( employee ) );
        }

        return list1;
    }
}
