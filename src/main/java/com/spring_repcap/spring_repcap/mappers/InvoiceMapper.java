package com.spring_repcap.spring_repcap.mappers;


import com.spring_repcap.spring_repcap.controller.dtos.InvoiceDto;
import com.spring_repcap.spring_repcap.persitance.entities.Invoice;
import lombok.experimental.UtilityClass;

@UtilityClass
public class InvoiceMapper {

    public InvoiceDto toDto(Invoice invoice) {
        InvoiceDto invoiceDto = new InvoiceDto();
        invoiceDto.setId(invoice.getId());
        invoiceDto.setDate(invoice.getDate());
        invoiceDto.setTotal(invoice.getTotal());
        return invoiceDto;
    }

    public Invoice toEntity(InvoiceDto invoiceDto) {
        Invoice invoice = new Invoice();
        invoice.setId(invoiceDto.getId());
        invoice.setDate(invoiceDto.getDate());
        invoice.setTotal(invoiceDto.getTotal());
        return invoice;
    }


}
