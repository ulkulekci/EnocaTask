package com.enoca.ulku.business.requests.employeeRequest;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateEmployeeRequest {
	private String name;
    private int companyId;
}
