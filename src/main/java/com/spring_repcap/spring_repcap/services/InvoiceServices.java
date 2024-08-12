package com.spring_repcap.spring_repcap.services;

import com.spring_repcap.spring_repcap.exceptions.InvoiceNotFoundException;
import com.spring_repcap.spring_repcap.persitance.entities.Invoice;
import com.spring_repcap.spring_repcap.persitance.repositories.InvoiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InvoiceServices {

    private final InvoiceRepository invoiceRepository;


    public List<Invoice> getAllInvoices() {
        return (List<Invoice>) invoiceRepository.findAll();
    }

    public Invoice getInvoiceById(Long id) {
        return invoiceRepository.findById(id)
                .orElseThrow(() -> new InvoiceNotFoundException("Invoice with id " + id + " not found"));


    }

    public Invoice addInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }
}
