package com.devsuperior.dsvendas.repositories;

import java.util.List;
import com.devsuperior.dsvendas.domain.Sale;
import com.devsuperior.dsvendas.dto.SaleSuccessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<Sale, String> {
    @Query("SELECT new com.devsuperior.dsvendas.dto.SaleSumDTO(sale.seller, SUM(sale.amount)) FROM Sale AS sale GROUP BY sale.seller")
    public List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.devsuperior.dsvendas.dto.SaleSuccessDTO(sale.seller, SUM(sale.visited), SUM(sale.deals)) FROM Sale AS sale GROUP BY sale.seller")
    public List<SaleSuccessDTO> successGroupedBySeller();
}
