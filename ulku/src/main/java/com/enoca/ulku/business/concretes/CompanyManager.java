package com.enoca.ulku.business.concretes;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enoca.ulku.business.abstracts.CompanyService;
import com.enoca.ulku.business.requests.companyRequest.CreateCompanyRequest;
import com.enoca.ulku.business.requests.companyRequest.DeleteCompanyRequest;
import com.enoca.ulku.business.requests.companyRequest.UpdateCompanyRequest;
import com.enoca.ulku.business.responses.companyResponse.GetAllCompaniesResponse;
import com.enoca.ulku.business.responses.companyResponse.UpdateCompanyResponse;
import com.enoca.ulku.dataAccess.CompanyRepository;
import com.enoca.ulku.entities.concretes.Company;

@Service
public class CompanyManager implements CompanyService{
    private CompanyRepository companyRepository;
    
    

    @Autowired
	public CompanyManager(CompanyRepository companyRepository) {

		super();
		this.companyRepository = companyRepository;
	}


	@Override
	public List<GetAllCompaniesResponse> getAll() {
		List<Company> companies = companyRepository.findAll();
		List<GetAllCompaniesResponse> companiesResponse = new ArrayList<GetAllCompaniesResponse>();

		for (Company company : companies) {
			GetAllCompaniesResponse ResponseItem = new GetAllCompaniesResponse();
			ResponseItem.setId(company.getId());
			ResponseItem.setName(company.getName());
			companiesResponse.add(ResponseItem); 
		}
		
		return 	companiesResponse;
	}


	@Override
	public void add(CreateCompanyRequest createCompanyRequest) {
		Company company = new Company();
		company.setName(createCompanyRequest.getName());
		this.companyRepository.save(company);
		
	}


	@Override
	public void delete(DeleteCompanyRequest deleteCompanyRequest) {
		Company company = new Company();

		company.setId(deleteCompanyRequest.getId());
		companyRepository.delete(company);
		
	}


	@Override
	public UpdateCompanyResponse update(UpdateCompanyRequest updateCompanyRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
