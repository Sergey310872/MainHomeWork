package com.example.shop.persistence.repository;

import com.example.shop.persistence.entity.Way_delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Way_deliveryRepository extends JpaRepository <Way_delivery, Long> {
}
