package com.example.mini_erp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "produkty")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produkt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String sku;

    @Column(nullable = false)
    private String nazwa;

    @Column(name = "jednostka_miary", nullable = false)
    private String jednostkaMiary;

    private String kategoria;
}