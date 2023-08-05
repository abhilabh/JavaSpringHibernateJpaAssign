package org.wipro.pack.beans;

import jakarta.persistence.*;

@Entity
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String city;

    @ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;

	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Branch(Long id, String name, String city, Bank bank) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "Branch [id=" + id + ", name=" + name + ", city=" + city + ", bank=" + bank.getId() + "]";
	}
    
    // Constructors, getters, and setters
}