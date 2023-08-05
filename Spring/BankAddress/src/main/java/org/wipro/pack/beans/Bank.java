package org.wipro.pack.beans;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Branch> branches = new ArrayList<>();
    
    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Service> services = new ArrayList<>();

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(Long id, String name, List<Branch> branches, List<Service> services) {
		super();
		this.id = id;
		this.name = name;
		this.branches = branches;
		this.services = services;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Branch> getBranches() {
		return branches;
	}

	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", branches=" + branches + ", services=" + services + "]";
	}

    // Constructors, getters, and setters
    
}