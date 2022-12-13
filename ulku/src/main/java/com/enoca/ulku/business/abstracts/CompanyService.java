package com.enoca.ulku.business.abstracts;

import java.util.List;

import com.enoca.ulku.business.requests.companyRequest.CreateCompanyRequest;
import com.enoca.ulku.business.requests.companyRequest.UpdateCompanyRequest;
import com.enoca.ulku.business.responses.companyResponse.CreateCompanyResponse;
import com.enoca.ulku.business.responses.companyResponse.GetAllCompanyResponse;
import com.enoca.ulku.business.responses.companyResponse.GetCompanyResponse;
import com.enoca.ulku.business.responses.companyResponse.UpdateCompanyResponse;


public interface CompanyService {
	List<GetAllCompanyResponse> getAll();
    GetCompanyResponse getById(int id);
    CreateCompanyResponse create(CreateCompanyRequest request);
    UpdateCompanyResponse update(UpdateCompanyRequest request, int id);
    void delete(int id);
}

