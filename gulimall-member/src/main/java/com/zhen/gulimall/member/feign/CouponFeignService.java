package com.zhen.gulimall.member.feign;

import com.zhen.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author LiJiaZhen
 * @date 2023/4/10 22:50
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("coupon/coupon/list")
    public R list(@RequestParam Map<String, Object> params);
}
