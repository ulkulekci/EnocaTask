package com.enoca.ulku.entities.concretes;

import java.util.List;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="companies")
public class Company {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "id")
	  private int id;

	  @Column(name = "name")
	  private String name;
	  
	  @OneToMany(mappedBy = "company", cascade = CascadeType.DETACH)
	    private List<Employee> employees;
}
