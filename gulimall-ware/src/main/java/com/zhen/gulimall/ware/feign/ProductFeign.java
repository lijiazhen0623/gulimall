package com.zhen.gulimall.ware.feign;

import com.zhen.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LiJiaZhen
 * @date 2023/4/24 17:53
 */
@FeignClient("gulimall-product")
public interface ProductFeign {
    /**
     * 根据skuId查询sku信息
     * @param skuId
     * @return
     */
    @RequestMapping("/product/skuinfo/info/{skuId}")
    R info(@PathVariable("skuId") Long skuId);
}
