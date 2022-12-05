package com.enoca.ulku.business.responses.employeeResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetAllEmployeesResponse {
   
	private int id;
    private String name;
    private int companyId;
}
