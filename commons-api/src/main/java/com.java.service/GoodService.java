package com.java.service;

import java.util.List;
import java.util.Map;

public interface GoodService {
    List<Map<String,Object>> findGoods(Long sortId);

    List<Map<String,Object>> findGoodSort();

    Map<String,Object> findGoodDetailByGoodId(Long goodId);

    boolean modifyGoodRemaining(Long goodId,Integer num);


}
