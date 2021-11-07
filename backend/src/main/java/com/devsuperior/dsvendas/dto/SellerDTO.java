package com.devsuperior.dsvendas.dto;

import java.io.Serializable;
import com.devsuperior.dsvendas.domain.Seller;

public class SellerDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    public Long id;
    public String name;

    public SellerDTO() {
    }

    public SellerDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public SellerDTO(Seller seller) {
        this.id = seller.id;
        this.name = seller.name;
    }
}
