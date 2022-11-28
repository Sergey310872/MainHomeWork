package com.example.shop.persistence.repository;

import com.example.shop.persistence.entity.Status_order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Status_orderRepository extends JpaRepository<Status_order,Long> {
}
