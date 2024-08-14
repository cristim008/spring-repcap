package com.spring_repcap.spring_repcap.persitance.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class InvoiceItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;

    private Double price;

    private Integer quantity;


    @ManyToOne
    @JoinColumn(name="invoice_id")
    private Invoice invoice;

}
