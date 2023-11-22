package com.zhen.gulimall.ware.vo;

import lombok.Data;

/**
 * @author LiJiaZhen
 * @date 2023/4/24 17:04
 */
@Data
public class PurchaseDetailVo {
    //itemId:1,status:4,reason:""
    /**
     * 采购项id
     */
    private Long itemId;
    /**
     * 采购项状态
     */
    private int status;
    /**
     * 如果有异常的，则异常原因
     */
    private String reason;
}
