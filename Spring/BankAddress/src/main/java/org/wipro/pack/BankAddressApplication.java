package org.wipro.pack;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.wipro.pack.beans.*;
import org.wipro.pack.repo.*;

@SpringBootApplication
public class BankAddressApplication implements CommandLineRunner {
    @Autowired
    private BankRepository bankRepository;
    @Autowired
    private BranchRepository branchRepository;
    @Autowired
    private ServiceRepository serviceRepository;

    public static void main(String[] args) {
    	ApplicationContext ctx =SpringApplication.run(BankAddressApplication.class, args);

//        // Display all default beans created by Spring Boot
//        String[] beanNames = ctx.getBeanDefinitionNames();
//        System.out.println("============Default Beans:================");
//        for (String beanName : beanNames) {
//            System.out.println(beanName);
//        }
    }

    @Override
    public void run(String... args) {
    	Bank bank = new Bank();
        bank.setName("SBI");
        
        List<Branch> branches = new ArrayList<>();
        List<Service> services = new ArrayList<>();
        
		// Create branches and add them to the bank
		for (int i = 0; i < 10; i++) {
			Branch branch = new Branch();
			branch.setName("Koramangala " + i+1);
			branch.setCity("Bangalore");
			branch.setBank(bank);
			bank.getBranches().add(branch);
			branches.add(branch);
			
			Service service1 = new Service();
	        service1.setName("Service "+ i + 1);
	        service1.setDescription("Description "+ i + 1);
	        service1.setBank(bank);
	        bank.getServices().add(service1);
	        services.add(service1);
		}

//        branch = new Branch();
//        branch.setName("Koramanagala 2");
//        branch.setCity("Bangalore");
//        branch.setBank(bank);
//        bank.getBranches().add(branch);
//        
//        branch = new Branch();
//        branch.setName("Koramanagala 2");
//        branch.setCity("Bangalore");
//        branch.setBank(bank);
//        bank.getBranches().add(branch);

        // Save the bank and its branches to the database
        bankRepository.save(bank);
        for (Branch branch : branches) {
        	branchRepository.save(branch);
        }
        for (Service service: services) {
        	serviceRepository.save(service);
        }
    }
}
