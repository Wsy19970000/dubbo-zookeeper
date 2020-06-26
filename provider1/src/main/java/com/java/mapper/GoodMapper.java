package com.java.mapper;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

public interface GoodMapper {
    /**
     * 根据文具id查询出指定的信息
     * @return
     */
    List<Map<String,Object>> selectGoods(Long sortId);

    /**
     * 获取商品分类
     * @return
     */
    @Select("SELECT * FROM good_sort")
    List<Map<String,Object>> selectGoodSort();

    /**
     * 根据商品id查询某个商品的详情
     * @param goodId
     * @return
     */
    @Select("SELECT gs.name AS sortName,gd.* FROM good_sort gs INNER JOIN good_detail gd\n" +
            "ON gs.`id`=gd.`sortId` WHERE gd.`id`=#{arg0}")
    Map<String,Object> selectGoodDetailByGoodId(Long goodId);

    /**
     * 修改商品库存数量
     * @param goodId
     * @param num
     * @return
     */
    @Update("UPDATE good_detail SET remaining=remaining-#{arg1} WHERE id=#{arg0}")
    int updateGoodRemainging(Long goodId,Integer num);


}
