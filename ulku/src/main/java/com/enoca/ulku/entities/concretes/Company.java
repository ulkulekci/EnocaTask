package com.enoca.ulku.entities.concretes;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="companies")
@Builder
public class Company {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)	
	  private int id;
	  private String name;
	  
	  @OneToMany(mappedBy = "company", fetch = FetchType.EAGER)
	    @JsonIgnore
	    private List<Employee> employees;
}