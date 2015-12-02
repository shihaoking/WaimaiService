package com.zhaishifu.service;

import com.zhaishifu.service.db.model.ShopEntity;

import java.util.List;

/**
 * Created by shihaoking on 2015/11/30.
 */
public interface ShopService {
    ShopEntity getShop(int shopId);

    List<ShopEntity> getShops(ShopEntity shopEntity);

    String getShopName(int shopId);
}
