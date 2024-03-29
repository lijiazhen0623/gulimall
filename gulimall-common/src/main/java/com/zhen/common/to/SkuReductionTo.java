package com.zhen.common.to;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author LiJiaZhen
 * @date 2023/4/22 23:14
 */
@Data
public class SkuReductionTo {
    private Long skuId;
    private int fullCount;
    private BigDecimal discount;
    private int countStatus;
    private BigDecimal fullPrice;
    private BigDecimal reducePrice;
    private int priceStatus;
    private List<MemberPrice> memberPrice;
}
