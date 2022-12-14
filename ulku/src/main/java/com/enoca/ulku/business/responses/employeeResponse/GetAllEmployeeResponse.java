package com.enoca.ulku.business.responses.employeeResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllEmployeeResponse {
   
	private int id;
    private String name;
    private String companyName;
}
