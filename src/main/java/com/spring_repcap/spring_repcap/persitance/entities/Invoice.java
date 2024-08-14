package com.spring_repcap.spring_repcap.persitance.entities;

import jakarta.persistence.*;
import jdk.dynalink.linker.LinkerServices;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime date;

    private Double total;



    @OneToMany(mappedBy = "invoice",
    cascade = CascadeType.ALL,
    fetch =FetchType.EAGER)
    private List<InvoiceItem> items;
}
