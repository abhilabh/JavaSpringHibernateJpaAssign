package org.wipro.pack.repo;

import org.wipro.pack.beans.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Long> {
}