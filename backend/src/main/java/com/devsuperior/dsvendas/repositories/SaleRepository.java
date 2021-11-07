package com.devsuperior.dsvendas.repositories;

import com.devsuperior.dsvendas.domain.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<Sale, String> {
    
}