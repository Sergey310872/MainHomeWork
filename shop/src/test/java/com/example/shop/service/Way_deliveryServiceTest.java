package com.example.shop.service;

import com.example.shop.dto.Way_deliveryCreateDto;
import com.example.shop.persistence.entity.Way_delivery;
import com.example.shop.persistence.repository.Way_deliveryRepository;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//@RunWith(SpringRunner.class)
////@WebMvcTest(PersonController.class)
//@AutoConfigureMockMvc(addFilters = false)

//@RunWith(SpringRunner.class)
//@DataJpaTest
//@ActiveProfiles("test")
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)



@Ignore
public class Way_deliveryServiceTest {
    private static Way_deliveryService way_deliveryService = new Way_deliveryService();
//    @MockBean
    @Autowired
    Way_deliveryRepository way_deliveryRepository;
//    private static Way_deliveryRepository  way_deliveryRepository = Mockito.mock(Way_deliveryRepository.class);
//    private static Way_deliveryCreateDto
    @Test
    public void createWay_delivery() {
        //given
        when(way_deliveryRepository.save(any())).thenReturn(null);
        //when
        way_deliveryService.createWay_delivery(new Way_deliveryCreateDto());
    }
}