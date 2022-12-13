package com.enoca.ulku.entities.concretes;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name="companies")
public class Company {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)	
	  private int id;
	  private String name;
	  
	  @OneToMany(mappedBy = "company", cascade = CascadeType.DETACH)
	   
	    private List<Employee> employees;
}
