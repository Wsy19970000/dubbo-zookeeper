package com.java.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.java.service.GoodService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/consumer")
public class GoodController {


    @Reference(version="goodServiceImpl")
    private GoodService goodService;

    /**
     * 获取商品信息列表
     * @param sortId
     * @return
     */
    @RequestMapping("/getGoodList")
    public @ResponseBody
    List<Map<String,Object>> getGoodList(@RequestParam(defaultValue = "0") Long sortId){
        return goodService.findGoods(sortId);
    }

    /**
     * 获取商品分类
     * @return
     */
    @RequestMapping("/getGoodSort")
    public @ResponseBody List<Map<String,Object>> getGoodSort(){
        return goodService.findGoodSort();
    }

    /**
     * 根据商品id获取商品的详情
     * @param goodId
     * @return
     */
    @RequestMapping("/getGoodDetailByGoodId")
    public @ResponseBody Map<String,Object> getGoodDetailByGoodId(Long goodId){
        //接收goodId查询商品详情
        return goodService.findGoodDetailByGoodId(goodId);
    }

    /**
     * 修改商品的库存数量
     * @param goodId
     * @param num
     * @return
     */
    @RequestMapping("/updateGoodKuCun")
    public @ResponseBody boolean updateGoodKuCun(Long goodId,Integer num){
        return goodService.modifyGoodRemaining(goodId,num);
    }

}
