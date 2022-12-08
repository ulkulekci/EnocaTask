package com.enoca.ulku.business.abstracts;

import java.util.List;



import com.enoca.ulku.business.requests.companyRequest.CreateCompanyRequest;
import com.enoca.ulku.business.requests.companyRequest.DeleteCompanyRequest;
import com.enoca.ulku.business.requests.companyRequest.UpdateCompanyRequest;
import com.enoca.ulku.business.responses.companyResponse.GetAllCompaniesResponse;
import com.enoca.ulku.business.responses.companyResponse.UpdateCompanyResponse;


public interface CompanyService {
	 List<GetAllCompaniesResponse> getAll(); //bu bir respons method 
	 void add(CreateCompanyRequest createCompanyRequest); 
	 void delete(DeleteCompanyRequest deleteCompanyRequest);
	 UpdateCompanyResponse update(UpdateCompanyRequest updateCompanyRequest);
}

