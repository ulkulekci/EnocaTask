package com.enoca.ulku.webApi.controllers;

import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.enoca.ulku.business.abstracts.CompanyService;
import com.enoca.ulku.business.requests.companyRequest.CreateCompanyRequest;
import com.enoca.ulku.business.requests.companyRequest.UpdateCompanyRequest;
import com.enoca.ulku.business.responses.companyResponse.CreateCompanyResponse;
import com.enoca.ulku.business.responses.companyResponse.GetAllCompanyResponse;
import com.enoca.ulku.business.responses.companyResponse.GetCompanyResponse;
import com.enoca.ulku.business.responses.companyResponse.UpdateCompanyResponse;

@RestController
@RequestMapping("/api/companies")
public class CompaniesController {
	private final CompanyService companyService;

	public CompaniesController(CompanyService companyService) {
		this.companyService = companyService;
	}
	@GetMapping
    public List<GetAllCompanyResponse> getAll() {
        return companyService.getAll();
    }

    @GetMapping("/{id}")
    public GetCompanyResponse getById(@PathVariable int id) {
        return companyService.getById(id);
    }

    @PostMapping
    @ResponseStatus(code = org.springframework.http.HttpStatus.CREATED)
    public CreateCompanyResponse create(@RequestBody CreateCompanyRequest company) {
        return companyService.create(company);
    }

    @PutMapping("/{id}")
    public UpdateCompanyResponse update(@RequestBody UpdateCompanyRequest company, @PathVariable int id) {
        return companyService.update(company, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = org.springframework.http.HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id) {
    	companyService.delete(id);
    }
	
	

}
