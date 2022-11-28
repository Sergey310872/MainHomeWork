package com.example.shop.dto;

import com.example.shop.persistence.entity.Way_delivery;

public class CreatedWay_deliveryDto {
    private Long id;

    public CreatedWay_deliveryDto(Way_delivery way_delivery) {
        this.id = way_delivery.getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
