package com.spring_repcap.spring_repcap.mappers;


import com.spring_repcap.spring_repcap.controller.dtos.InvoiceDto;
import com.spring_repcap.spring_repcap.persitance.entities.Invoice;
import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class InvoiceMapper {

    public InvoiceDto toDto(Invoice invoice) {
        InvoiceDto invoiceDto = new InvoiceDto();
        invoiceDto.setId(invoice.getId());
        invoiceDto.setDate(invoice.getDate());
        invoiceDto.setTotal(invoice.getTotal());
        invoiceDto.setItems(invoice.getItems().stream()
                .map(InvoiceItemMapper::toDto)
                .toList());
        return invoiceDto;
    }

    public Invoice toEntity(InvoiceDto invoiceDto) {
        Invoice invoice = new Invoice();
        invoice.setId(invoiceDto.getId());
        invoice.setDate(invoiceDto.getDate());
        invoice.setTotal(invoiceDto.getTotal());
        invoice.setItems(invoiceDto.getItems().stream()
                .map(item->InvoiceItemMapper.toEntity(item,invoice))
                .toList());
        return invoice;
    }


}
