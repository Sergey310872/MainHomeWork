package com.example.shop.service;

//import com.example.shop.ShopApplication;
import com.example.shop.dto.listOrdersByStatusDto;
import com.example.shop.persistence.entity.Goods;
import com.example.shop.persistence.entity.Person;
import com.example.shop.persistence.repository.GoodsRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.matchers.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
@ActiveProfiles("test")
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = ShopApplication.class)
public class CommonServiceTest {
    private  static CommonService commonService = new CommonService();

    @MockBean
    private  static GoodsRepository goodsRepository = mock(GoodsRepository.class);
//    private GoodsRepository goodsRepository;

    @Ignore
    @Test
    public void listGoods() {
        //given
        List<Goods> listGoods = new ArrayList<>();
        listGoods.add(new Goods(1L, "Товар-тест", 1L, false, 7L));

        when(goodsRepository.findAll()).thenReturn(listGoods);
        //when
        commonService.listGoods();
        //then
        verify(goodsRepository,times(1)).findAll();

    }

    @Test
    public void connect() {
        commonService.connect();
    }

    @Test
    public void getReportOrders() {
        commonService.getReportOrders();
    }

    @Test
    public void listGoodsForSail() {
        commonService.listGoodsForSail();
    }

    @Test
    public void listOrdersByStatus() {
        //given
//       JdbcTemplate jdbcTemplate = mock(JdbcTemplate.class);
//        when(commonService.connect()).thenReturn(null);
//        when(jdbcTemplate.query("",new BeanPropertyRowMapper(listOrdersByStatusDto.class))).thenReturn(null);
        //when
        List<listOrdersByStatusDto> reply = commonService.listOrdersByStatus();
        //then
        for (listOrdersByStatusDto l:reply) {
            System.out.println("reply"+l.getOrder_id()+" Клиент: "+l.getPerson_name());
        }
    }
}