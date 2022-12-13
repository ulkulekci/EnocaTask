package com.enoca.ulku.business.responses.employeeResponse;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEmployeeResponse {
   
	private int id;
    private int CompanyId;
    private String name;
}
