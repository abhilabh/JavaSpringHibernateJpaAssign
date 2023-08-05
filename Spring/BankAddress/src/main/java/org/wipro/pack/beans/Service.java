package org.wipro.pack.beans;

import jakarta.persistence.*;

@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;

	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Service(Long id, String name, String description, Bank bank) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.bank = bank;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "Service [id=" + id + ", name=" + name + ", description=" + description + ", bank=" + bank.getId() + "]";
	}

    // Constructors, getters, and setters
}
