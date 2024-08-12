package com.spring_repcap.spring_repcap.persitance.repositories;

import com.spring_repcap.spring_repcap.persitance.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice,Long> {
}
