package com.example.mini_erp.repository;

import com.example.mini_erp.model.Produkt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduktRepository extends JpaRepository<Produkt, Long> {
}