package com.zhaishifu.service.test;

import com.zhaishifu.service.ShopService;
import com.zhaishifu.service.db.model.ShopEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by shihaoking on 2015/11/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class ShopTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private ShopService shopService;

    @Test
    public void testGetShopInfo(){
       ShopEntity shopInfo =  shopService.getShop(22);
        System.out.println(shopInfo.getName());
    }
}
