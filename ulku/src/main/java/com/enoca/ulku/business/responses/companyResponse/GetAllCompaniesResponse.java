package com.enoca.ulku.business.responses.companyResponse;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCompaniesResponse {
     
	  private int id;   
	  private String name;
	  private List<String> employees;
}
