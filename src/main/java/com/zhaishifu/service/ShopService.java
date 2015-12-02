package com.zhaishifu.service;

import com.zhaishifu.service.db.model.ShopEntity;

/**
 * Created by shihaoking on 2015/11/30.
 */
public interface ShopService {
    ShopEntity getShop(int shopId);

    String getShopName(int shopId);
}
