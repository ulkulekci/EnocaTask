package com.enoca.ulku.business.concretes;

import java.util.List;
import org.springframework.stereotype.Service;

import com.enoca.ulku.business.abstracts.CompanyService;
import com.enoca.ulku.business.constants.Message;
import com.enoca.ulku.business.mappers.CompanyMapper;
import com.enoca.ulku.business.requests.companyRequest.CreateCompanyRequest;
import com.enoca.ulku.business.requests.companyRequest.UpdateCompanyRequest;
import com.enoca.ulku.business.responses.companyResponse.CreateCompanyResponse;
import com.enoca.ulku.business.responses.companyResponse.GetAllCompanyResponse;
import com.enoca.ulku.business.responses.companyResponse.GetCompanyResponse;
import com.enoca.ulku.business.responses.companyResponse.UpdateCompanyResponse;
import com.enoca.ulku.dataAccess.CompanyRepository;
import com.enoca.ulku.entities.concretes.Company;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Service
public class CompanyManager implements CompanyService{
	
    CompanyRepository companyRepository;
    CompanyMapper companymapper;
    

	@Override
	public List<GetAllCompanyResponse> getAll() {
		List<Company> Companies =companyRepository.findAll();
        return companymapper.toGetAllCompanyResponse(Companies);
	}


	@Override
	public GetCompanyResponse getById(int id) {
		Company company = companyRepository.findById(id).get();
        return companymapper.toGetCompanyResponse(company);
	}


	@Override
	public CreateCompanyResponse create(CreateCompanyRequest request) {
		Company company = companymapper.toCompany(request);
        if (checkCompanyNameValid(company)) {
            throw new RuntimeException(Message.COMPANY_NAME_IS_NOT_VALID);
        }

        if (isCompanyExists(company)) {
            throw new RuntimeException(Message.COMPANY_ALREADY_EXISTS);
        }

        companyRepository.save(company);

        return companymapper.toCreateCompanyResponse(company);
	}


	@Override
	public UpdateCompanyResponse update(UpdateCompanyRequest request, int id) {
		Company company = companyRepository.findById(id).get();
		companymapper.update(company, request);

        if (checkCompanyNameValid(company)) {
            throw new RuntimeException(Message.COMPANY_NAME_IS_NOT_VALID);
        }

        if (isCompanyExists(company)) {
            throw new RuntimeException(Message.COMPANY_ALREADY_EXISTS);
        }

        companyRepository.save(company);

        return companymapper.toUpdateCompanyResponse(company);
	}


	@Override
	public void delete(int id) {
		companyRepository.deleteById(id);
		
	}
	public boolean isCompanyExists(Company company) {
		return companyRepository.existsByName(company.getName());
	}


	public boolean checkCompanyNameValid(Company company) {
		return company.getName().isEmpty() || company.getName().isBlank();
	}

	
}
