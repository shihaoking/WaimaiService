package com.zhaishifu.service.db.service;

import com.zhaishifu.service.db.model.ShopEntity;

import java.util.List;


/**
 * Created by shihaoking on 2015/11/30.
 */
public interface ShopDBService {
    ShopEntity getShop(int id);

    List<ShopEntity> getShops(ShopEntity shopEntity);
}
