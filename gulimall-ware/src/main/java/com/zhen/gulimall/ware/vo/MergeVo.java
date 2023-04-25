package com.zhen.gulimall.ware.vo;

import lombok.Data;

import java.util.List;

/**
 * @author LiJiaZhen
 * @date 2023/4/23 21:32
 */
@Data
public class MergeVo {
    private Long purchaseId; //整单id
    private List<Long> items;//合并项集合
}
