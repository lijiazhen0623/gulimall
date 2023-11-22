package com.zhen.gulimall.product.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.zhen.gulimall.product.entity.AttrEntity;
import lombok.Data;

import java.util.List;

/**
 * @author LiJiaZhen
 * @date 2023/4/22 15:52
 */
@Data
public class AttrGroupWithAttrsVo {
    /**
     * 分组id
     */
    private Long attrGroupId;
    /**
     * 组名
     */
    private String attrGroupName;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 描述
     */
    private String descript;
    /**
     * 组图标
     */
    private String icon;
    /**
     * 所属分类id
     */
    private Long catelogId;

    /**
     * 关联的属性
     */
    private List<AttrEntity> attrs;
}
