package com.spring_repcap.spring_repcap.mappers;

import com.spring_repcap.spring_repcap.controller.dtos.InvoiceItemDto;
import com.spring_repcap.spring_repcap.persitance.entities.Invoice;
import com.spring_repcap.spring_repcap.persitance.entities.InvoiceItem;
import lombok.experimental.UtilityClass;

@UtilityClass
public class InvoiceItemMapper {

    public InvoiceItem toEntity(InvoiceItemDto invoiceItemDto, Invoice invoice){
        InvoiceItem invoiceItem=new InvoiceItem();
        invoiceItem.setId(invoiceItemDto.id());
        invoiceItem.setName(invoiceItemDto.name());
        invoiceItem.setPrice(invoiceItemDto.price());
        invoiceItem.setQuantity(invoiceItemDto.quantity());
        invoiceItem.setInvoice(invoice);
        return invoiceItem;
    }

    public InvoiceItemDto toDto(InvoiceItem invoiceItem){
        return new InvoiceItemDto(invoiceItem.getId(),
                invoiceItem.getPrice(),
                invoiceItem.getQuantity(),
                invoiceItem.getName());
    }
}
