package com.enoca.ulku.business.requests.employeeRequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateEmployeeRequest {
	private String name;
    private int companyId;
}
