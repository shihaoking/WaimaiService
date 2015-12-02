package com.zhaishifu.service.db.service.impl;

import com.zhaishifu.service.db.dao.ShopMapper;
import com.zhaishifu.service.db.model.ShopEntity;
import com.zhaishifu.service.db.service.ShopDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shihaoking on 2015/11/30.
 */
@Service("shopDBService")
public class ShopDBServiceImpl implements ShopDBService {

    @Autowired
    private ShopMapper shopMapper;

    public ShopEntity getShop(int id) {
        return shopMapper.getShop(id);
    }
}
