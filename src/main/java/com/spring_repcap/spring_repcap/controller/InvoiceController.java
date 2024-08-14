package com.spring_repcap.spring_repcap.controller;

import com.spring_repcap.spring_repcap.controller.dtos.InvoiceDto;
import com.spring_repcap.spring_repcap.controller.dtos.ResponsePayLoad;
import com.spring_repcap.spring_repcap.mappers.InvoiceMapper;
import com.spring_repcap.spring_repcap.persitance.entities.Invoice;
import com.spring_repcap.spring_repcap.services.InvoiceServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/invoices")
@RequiredArgsConstructor
public class InvoiceController {

    private final InvoiceServices invoiceServices;

    @GetMapping
    public ResponseEntity<List<InvoiceDto>> getAllInvoices() {
        List<Invoice> allInvoices = invoiceServices.getAllInvoices();
        return ResponseEntity.ok(allInvoices.stream()
                .map(InvoiceMapper::toDto)
                .toList());

    }

    @PostMapping

    public ResponseEntity<ResponsePayLoad<InvoiceDto>> addInvoice(@RequestBody InvoiceDto invoiceDto) {
        Invoice invoice = invoiceServices.addInvoice(InvoiceMapper.toEntity(invoiceDto));
        return new ResponseEntity<>(new ResponsePayLoad<>(InvoiceMapper.toDto(invoice),
                "Invoice added successfully"),
                HttpStatus.CREATED);

    }

    @GetMapping("/{id}")
    public ResponseEntity<InvoiceDto> getInvoiceById(@PathVariable Long id) {
        Invoice invoice = invoiceServices.getInvoiceById(id);
        return ResponseEntity.ok(InvoiceMapper.toDto(invoice));
    }
}
