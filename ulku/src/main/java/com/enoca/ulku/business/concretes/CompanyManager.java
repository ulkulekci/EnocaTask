package com.enoca.ulku.business.concretes;

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
		
		
		
		return 	null;
	}


	@Override
	public void add(CreateCompanyRequest createCompanyRequest) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(DeleteCompanyRequest deleteCompanyRequest) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public UpdateCompanyResponse update(UpdateCompanyRequest updateCompanyRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
