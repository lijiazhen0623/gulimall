package com.zhen.gulimall.product.vo;

import lombok.Data;

/**
 * @author LiJiaZhen
 * @date 2023/4/20 21:14
 */
@Data
public class AttrRespVo extends AttrVo {
    /**
     * "groupName": "主体", //所属分组名字
     * "catelogName": "手机/数码/手机", //所属分类名字
     */
    private String groupName;
    private String catelogName;
    //分类完整路径
    private Long[] catelogPath;
}
