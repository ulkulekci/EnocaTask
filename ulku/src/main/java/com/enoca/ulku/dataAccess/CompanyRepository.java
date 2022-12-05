package com.enoca.ulku.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.enoca.ulku.entities.concretes.Company;


@Repository
public interface CompanyRepository extends JpaRepository<Company,Integer> {
	
 
}
