package com.java.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.java.mapper.GoodMapper;
import com.java.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@Service(version = "goodServiceImpl")
public class GoodServiceImpl implements GoodService {
    @Autowired
    private GoodMapper goodMapper;

    @Override
    public List<Map<String, Object>> findGoods(Long sortId) {
        return goodMapper.selectGoods(sortId);
    }

    @Override
    public List<Map<String, Object>> findGoodSort() {
        return goodMapper.selectGoodSort();
    }

    @Override
    public Map<String, Object> findGoodDetailByGoodId(Long goodId) {
        return goodMapper.selectGoodDetailByGoodId(goodId);
    }

    @Override
    public boolean modifyGoodRemaining(Long goodId, Integer num) {
        return goodMapper.updateGoodRemainging(goodId,num)>=1;
    }
}
