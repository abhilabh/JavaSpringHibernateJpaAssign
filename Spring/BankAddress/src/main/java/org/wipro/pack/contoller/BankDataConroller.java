package org.wipro.pack.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.wipro.pack.beans.*;
import org.wipro.pack.repo.*;

@Controller
public class BankDataConroller {

    private final BankRepository bankRepository;
    private final BranchRepository branchRepository;
    private final ServiceRepository serviceRepository;

    public BankDataConroller(BankRepository bankRepository, BranchRepository branchRepository, ServiceRepository serviceRepository) {
        this.bankRepository = bankRepository;
        this.branchRepository = branchRepository;
        this.serviceRepository = serviceRepository;
    }

    @GetMapping("/branches")
    public String displayBranches(Model model) {
        Bank bank = bankRepository.findById(1L).orElse(null); // Assuming Bank with ID 1 exists
        model.addAttribute("bankName", bank.getName());
        model.addAttribute("branches", bank.getBranches());

        return "branches";
    }

    @GetMapping("/services")
    public String displayServices(Model model) {
        Bank bank = bankRepository.findById(1L).orElse(null); // Assuming Bank with ID 1 exists
        model.addAttribute("bankName", bank.getName());
        model.addAttribute("services", bank.getServices());

        return "services";
    }
}

