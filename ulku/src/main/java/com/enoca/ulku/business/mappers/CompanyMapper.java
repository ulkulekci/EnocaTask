package com.enoca.ulku.business.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.enoca.ulku.business.requests.companyRequest.CreateCompanyRequest;
import com.enoca.ulku.business.requests.companyRequest.UpdateCompanyRequest;
import com.enoca.ulku.business.responses.companyResponse.CreateCompanyResponse;
import com.enoca.ulku.business.responses.companyResponse.GetAllCompanyResponse;
import com.enoca.ulku.business.responses.companyResponse.UpdateCompanyResponse;
import com.enoca.ulku.entities.concretes.Company;

@Mapper(componentModel = "spring")
public interface CompanyMapper {
	
	GetAllCompanyResponse toGetAllCompanyResponse(Company company);
    List<GetAllCompanyResponse> toGetAllCompanyResponse(List<Company> companies);

    Company toCompany(CreateCompanyRequest request);
    CreateCompanyResponse toCreateCompanyResponse(Company company);
    void update(@MappingTarget Company company, UpdateCompanyRequest request);
    UpdateCompanyResponse toUpdateCompanyResponse(Company company);
}
