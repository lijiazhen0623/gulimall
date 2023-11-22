package com.zhen.gulimall.product.feign;

import com.zhen.common.to.SkuReductionTo;
import com.zhen.common.to.SpuBoundsTo;
import com.zhen.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author LiJiaZhen
 * @date 2023/4/22 23:06
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    /**
     * 调用保存积分信息
     * @param spuBoundsTo
     * @return
     */
    @PostMapping("/coupon/spubounds/save")
    R saveSpuBounds(@RequestBody SpuBoundsTo spuBoundsTo);

    /**
     * 调用保存优惠、满减等信息
     * @param skuReductionTo
     * @return
     */
    @PostMapping("coupon/skufullreduction/saveinfo")
    R saveSkuReduction(@RequestBody SkuReductionTo skuReductionTo);
}
