package com.zhen.gulimall.ware.vo;

import lombok.Data;

import java.util.List;

/**
 * @author LiJiaZhen
 * @date 2023/4/24 17:03
 */
@Data
public class DoneVo {
    /**
     * 采购单id
     */
    private Long id;
    /**
     * 采购项
     */
    private List<PurchaseDetailVo> items;
}
