package com.enoca.ulku.business.responses.companyResponse;


import java.util.List;

import com.enoca.ulku.business.responses.employeeResponse.EmployeeResponse;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCompanyResponse {
   
	  private int id;   
	  private String name;
	  private List<EmployeeResponse> employees;
	 
}
