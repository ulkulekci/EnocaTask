package com.enoca.ulku.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import com.enoca.ulku.entities.concretes.Company;

public interface CompanyRepository extends JpaRepository<Company,Integer> {
	boolean existsByNameContainingIgnoreCase(String name);
	boolean existsById(int id);
}
