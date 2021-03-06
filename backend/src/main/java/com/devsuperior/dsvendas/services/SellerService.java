package com.devsuperior.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;
import com.devsuperior.dsvendas.domain.Seller;
import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {
    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll() {
        List<Seller> lista = repository.findAll();
        return lista.stream().map(seller -> new SellerDTO(seller)).collect(Collectors.toList());
    }
}
