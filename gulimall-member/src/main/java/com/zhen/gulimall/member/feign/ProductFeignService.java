package com.zhen.gulimall.member.feign;

import com.zhen.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LiJiaZhen
 * @date 2023/4/10 23:33
 */
@FeignClient("gulimall-product")
public interface ProductFeignService {
    @RequestMapping("/product/brand/info/{brandId}")
    public R info(@PathVariable("brandId") Long brandId);
}
