package com.zhaishifu.service.impl;

import com.zhaishifu.service.ShopService;
import com.zhaishifu.service.db.model.ShopEntity;
import com.zhaishifu.service.db.service.ShopDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by shihaoking on 2015/11/30.
 */

@Service("shopService")
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopDBService shopDBService;

    public ShopEntity getShop(int shopId) {
        return shopDBService.getShop(shopId);
    }

    public List<ShopEntity> getShops(ShopEntity shopEntity){
        return shopDBService.getShops(shopEntity);
    }

    public String getShopName(int shopId) {
        ShopEntity shopEntity = getShop(shopId);
        if(shopEntity == null){
            return null;
        }else{
            return shopEntity.getName();
        }
    }
}
