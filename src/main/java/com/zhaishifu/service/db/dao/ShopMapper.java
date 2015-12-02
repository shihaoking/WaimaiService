package com.zhaishifu.service.db.dao;

import com.zhaishifu.service.db.model.ShopEntity;

import java.util.List;

/**
 * Created by shihaoking on 2015/11/30.
 */
public interface ShopMapper {
    ShopEntity getShop(int id);

    List<ShopEntity> getShops(ShopEntity shopEntity);
}
