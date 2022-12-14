package com.enoca.ulku.webApi.controllers;

import java.util.List;


import org.springframework.web.bind.annotation.*;

import com.enoca.ulku.business.abstracts.CompanyService;
import com.enoca.ulku.business.requests.companyRequest.CreateCompanyRequest;
import com.enoca.ulku.business.requests.companyRequest.UpdateCompanyRequest;
import com.enoca.ulku.business.responses.companyResponse.CreateCompanyResponse;
import com.enoca.ulku.business.responses.companyResponse.GetAllCompanyResponse;
import com.enoca.ulku.business.responses.companyResponse.UpdateCompanyResponse;

@RestController
@RequestMapping("/api/companies")
public class CompaniesController {
	private final CompanyService companyService;

	public CompaniesController(CompanyService companyService) {
		this.companyService = companyService;
	}
	@GetMapping("/getAll")
    public List<GetAllCompanyResponse> getAll() {
        return companyService.getAll();
    }
    @PostMapping("add")
    @ResponseStatus(code = org.springframework.http.HttpStatus.CREATED)
    public CreateCompanyResponse create(@RequestBody CreateCompanyRequest company) {
        return companyService.create(company);
    }

    @PutMapping("/update{id}")
    public UpdateCompanyResponse update(@RequestBody UpdateCompanyRequest company, @PathVariable int id) {
        return companyService.update(company, id);
    }

    @DeleteMapping("/delete{id}")
    @ResponseStatus(code = org.springframework.http.HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id) {
    	companyService.delete(id);
    }
	
	

}
