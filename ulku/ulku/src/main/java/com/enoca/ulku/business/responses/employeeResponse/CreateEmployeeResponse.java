package com.enoca.ulku.business.responses.employeeResponse;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateEmployeeResponse {
	private int id;
    private int companyId;
    private String name;
}
