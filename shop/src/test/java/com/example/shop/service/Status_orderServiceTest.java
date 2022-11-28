package com.example.shop.service;

import com.example.shop.dto.Status_orderCreateDto;
import com.example.shop.persistence.entity.Status_order;
import com.example.shop.persistence.repository.Status_orderRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Status_orderServiceTest {
    private static Status_orderCreateDto status_orderCreateDto = mock(Status_orderCreateDto.class);
    private static Status_orderService status_orderService = new Status_orderService();
    private static Status_orderRepository status_orderRepository = mock(Status_orderRepository.class);
    @Test
    public void createStatus_order() {
        //given

//        when(scannerHW.scannerInt()).thenReturn(2, 2, 1, 1);
        //when
        //then//
        Status_order status_order = status_orderService.createStatus_order(status_orderCreateDto);
        System.out.println(status_order);
    }
}