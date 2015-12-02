package com.zhaishifu.service;

import com.zhaishifu.service.db.model.ShopEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by shihaoking on 2015/12/1.
 */
@Component
@WebService(serviceName = "ShopService")
public class ShopServiceEndPoint {
    @Autowired
    private ShopService shopService;

    @WebMethod
    public String getShopName(int id){
        return shopService.getShopName(id);
    }

    @WebMethod
    public ShopEntity getShop(int id){
        return shopService.getShop(id);
    }
}
