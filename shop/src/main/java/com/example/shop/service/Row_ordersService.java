package com.example.shop.service;

import com.example.shop.dto.Row_ordersCreateDto;
import com.example.shop.persistence.entity.Row_orders;
import com.example.shop.persistence.repository.Row_ordersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Row_ordersService {
    @Autowired
    Row_ordersRepository row_ordersRepository;

    public Row_orders createRow_orders(Row_ordersCreateDto dto) {
        Row_orders ro = new Row_orders(dto.getId(), dto.getOrder_id(), dto.getGoods_id(), dto.getQuantity());
        return row_ordersRepository.save(ro);
    }
}
