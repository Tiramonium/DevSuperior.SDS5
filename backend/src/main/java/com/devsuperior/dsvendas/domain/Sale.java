package com.devsuperior.dsvendas.domain;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sales")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public Integer visited;
    public Integer deals;
    public Double amount;
    public LocalDate date;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    public Seller seller;

    public Sale() {}

    public Sale(Long id, Integer visited, Integer deals, Double amount, LocalDate date, Seller seller) {
        this.id = id;
        this.visited = visited;
        this.deals = deals;
        this.amount = amount;
        this.date = date;
        this.seller = seller;
    }
}
