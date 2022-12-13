package com.enoca.ulku.business.responses.companyResponse;

import java.util.List;

import com.enoca.ulku.business.responses.employeeResponse.EmployeeResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetCompanyResponse {
	  private int id;   
	  private String name;
	  private List<EmployeeResponse> employees;
}
