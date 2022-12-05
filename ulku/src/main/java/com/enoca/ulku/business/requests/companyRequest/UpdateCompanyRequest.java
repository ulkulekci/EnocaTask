package com.enoca.ulku.business.requests.companyRequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UpdateCompanyRequest {
	private int id;
	private String name;
}
