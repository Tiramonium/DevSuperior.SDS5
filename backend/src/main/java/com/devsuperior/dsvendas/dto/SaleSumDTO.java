package com.devsuperior.dsvendas.dto;

import java.io.Serializable;
import com.devsuperior.dsvendas.domain.Seller;

public class SaleSumDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    public String sellerName;
    public Double sum;

    public SaleSumDTO() {}

    public SaleSumDTO(Seller seller, Double sum) {
        this.sellerName = seller.name;
        this.sum = sum;
    }
}
