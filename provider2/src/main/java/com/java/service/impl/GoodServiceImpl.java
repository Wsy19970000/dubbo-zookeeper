package com.java.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.java.service.GoodService;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(version = "1.0.0")
public class GoodServiceImpl implements GoodService {
   /* @Override
    public List<Map<String, Object>> findGoods() {
        Map<String,Object> resultMap = new HashMap<String,Object>();
        resultMap.put("name","provider2");
        return Arrays.asList(resultMap);
    }*/
    public List<Map<String, Object>> findGoods(Long sortId) {
        return null;
    }

    public List<Map<String, Object>> findGoodSort() {
        return null;
    }

    public Map<String, Object> findGoodDetailByGoodId(Long goodId) {
        return null;
    }

    public boolean modifyGoodRemaining(Long goodId, Integer num) {
        return false;
    }
}
