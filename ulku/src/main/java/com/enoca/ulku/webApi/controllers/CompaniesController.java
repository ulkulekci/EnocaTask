package com.enoca.ulku.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enoca.ulku.business.abstracts.CompanyService;
import com.enoca.ulku.business.requests.companyRequest.CreateCompanyRequest;
import com.enoca.ulku.business.requests.companyRequest.DeleteCompanyRequest;
import com.enoca.ulku.business.requests.companyRequest.UpdateCompanyRequest;
import com.enoca.ulku.business.responses.companyResponse.GetAllCompaniesResponse;
import com.enoca.ulku.business.responses.companyResponse.UpdateCompanyResponse;

@RestController
@RequestMapping("/api/companies")
public class CompaniesController {
	private CompanyService companyService;

	@Autowired
	public CompaniesController(CompanyService companyService) {
		super();
		this.companyService = companyService;
	}
	@GetMapping("/getAll")
    public List<GetAllCompaniesResponse> getAll() {
  	  return companyService.getAll();
	}
    @PostMapping("/add")
    public void add(CreateCompanyRequest createCompanyRequest) {
  	  this.companyService.add(createCompanyRequest);
    }
    @DeleteMapping("/delete")
    public void delete(DeleteCompanyRequest deleteCompanyRequest) {
    	companyService.delete(deleteCompanyRequest);
    }

    @PutMapping("/update")
    public UpdateCompanyResponse update(UpdateCompanyRequest updateLanguageRequest) {
        return companyService.update(updateLanguageRequest);
    }
	
	

}
