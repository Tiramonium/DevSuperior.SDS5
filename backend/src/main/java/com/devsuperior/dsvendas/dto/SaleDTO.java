package com.devsuperior.dsvendas.dto;

import java.time.LocalDate;
import com.devsuperior.dsvendas.domain.Sale;

public class SaleDTO {
    public Long id;
    public Integer visited;
    public Integer deals;
    public Double amount;
    public LocalDate date;

    public SellerDTO seller;

    public SaleDTO() {}

    public SaleDTO(Long id, Integer visited, Integer deals, Double amount, LocalDate date, SellerDTO seller) {
        this.id = id;
        this.visited = visited;
        this.deals = deals;
        this.amount = amount;
        this.date = date;
        this.seller = seller;
    }

    public SaleDTO(Sale sale) {
        this.id = sale.id;
        this.visited = sale.visited;
        this.deals = sale.deals;
        this.amount = sale.amount;
        this.date = sale.date;
        this.seller = new SellerDTO(sale.seller);
    }
}
