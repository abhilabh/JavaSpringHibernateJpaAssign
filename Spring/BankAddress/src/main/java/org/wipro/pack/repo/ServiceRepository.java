package org.wipro.pack.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wipro.pack.beans.Service;

public interface ServiceRepository extends JpaRepository<Service, Long> {

}
