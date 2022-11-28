package com.example.shop.service;

import com.example.shop.Demo2Application;
import com.example.shop.dto.Way_deliveryCreateDto;
import com.example.shop.persistence.entity.Way_delivery;
import com.example.shop.persistence.repository.Way_deliveryRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.ArgumentMatchers.any;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Demo2Application.class)
//@SpringApplicationConfiguration(classes = Demo2Application.class)
public class UserServiceUnitTest {

    @Autowired
    private Way_deliveryRepository way_deliveryRepository;

    @Autowired
    private Way_deliveryService way_deliveryService;

    @Test
    public void whenUserIdIsProvided_thenRetrievedNameIsCorrect() {
        Way_delivery testWay_delivery = new Way_delivery(1L, "test name of way");
        Way_deliveryCreateDto way_deliveryCreateDto = new Way_deliveryCreateDto();

//        Mockito.when(nameService.getUserName("SomeId")).thenReturn("Mock user name");
        Mockito.when(way_deliveryRepository.save(any())).thenReturn(testWay_delivery);
        Way_delivery realWay_delivery = way_deliveryService.createWay_delivery(way_deliveryCreateDto);
        Assert.assertEquals(testWay_delivery, realWay_delivery);
    }
}