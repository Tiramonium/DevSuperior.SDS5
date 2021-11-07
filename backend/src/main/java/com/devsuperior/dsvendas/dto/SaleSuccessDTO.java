package com.devsuperior.dsvendas.dto;

import java.io.Serializable;
import com.devsuperior.dsvendas.domain.Seller;

public class SaleSuccessDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    
    public String sellerName;
    public Long visited;
    public Long deals;

    public SaleSuccessDTO() {
    }

    public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
        this.sellerName = seller.name;
        this.visited = visited;
        this.deals = deals;
    }
}
