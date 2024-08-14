package com.spring_repcap.spring_repcap.controller.dtos;


import lombok.Data;


public record InvoiceItemDto(Long id,Double price,Integer quantity,String name) {
}
