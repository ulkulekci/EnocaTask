package com.enoca.ulku.business.concretes;

import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Service;

import com.enoca.ulku.business.abstracts.CompanyService;
import com.enoca.ulku.business.mappers.CompanyMapper;
import com.enoca.ulku.business.requests.companyRequest.CreateCompanyRequest;
import com.enoca.ulku.business.requests.companyRequest.UpdateCompanyRequest;
import com.enoca.ulku.business.responses.companyResponse.CreateCompanyResponse;
import com.enoca.ulku.business.responses.companyResponse.GetAllCompanyResponse;
import com.enoca.ulku.business.responses.companyResponse.UpdateCompanyResponse;
import com.enoca.ulku.dataAccess.CompanyRepository;
import com.enoca.ulku.entities.concretes.Company;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
public class CompanyManager implements CompanyService{
    CompanyRepository companyRepository;
    CompanyMapper mapper;

	@Override
	public List<GetAllCompanyResponse> getAll() {
		List<Company> Companies = companyRepository.findAll();
        return mapper.toGetAllCompanyResponse(Companies);
	}


	@Override
	public CreateCompanyResponse create(CreateCompanyRequest request) {
		checkIfNameDuplicated(request.getName());
		checkIfNameIsEmptyOrNull(request.getName());
		Company company = mapper.toCompany(request);
        companyRepository.save(company);
        return mapper.toCreateCompanyResponse(company);
	}


	@Override
	public UpdateCompanyResponse update(UpdateCompanyRequest request, int id) {
		checkIfIdExists(id);
		checkIfNameDuplicated(request.getName());
		checkIfNameIsEmptyOrNull(request.getName());
		Company company = companyRepository.findById(id).get();
		mapper.update(company, request);
        companyRepository.save(company);
        return mapper.toUpdateCompanyResponse(company);
	}


	@Override
	public void delete(int id) {
		checkIfIdExists(id);
		companyRepository.deleteById(id);
		
	}
	private void checkIfIdExists(int id) {
		if(!this.companyRepository.existsById(id)) {
			throw new RuntimeException("Id does not exist");
		}
    }
	private void checkIfNameDuplicated(String name){
		if(this.companyRepository.existsByNameContainingIgnoreCase(name)) {
			throw new RuntimeException("Name already exists");
		}
	}

	private void checkIfNameIsEmptyOrNull(String name){
		if(name.isBlank() || name.isEmpty() || Objects.isNull(name)) {
			throw new RuntimeException("Name cannot be null or empty");
		}
	}


}
