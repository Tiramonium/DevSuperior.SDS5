package com.devsuperior.dsvendas.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sellers")
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;

    @OneToMany(mappedBy = "seller")
    public List<Sale> sales = new ArrayList<Sale>();

    public Seller() {}

    public Seller(Long id, String name, List<Sale> sales) {
        this.id = id;
        this.name = name;
        this.sales = sales;
    }
}
