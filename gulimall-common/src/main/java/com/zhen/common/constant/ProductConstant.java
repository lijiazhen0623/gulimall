package com.zhen.common.constant;

/**
 * @author LiJiaZhen
 * @date 2023/4/21 14:56
 */
public class ProductConstant {

    /**
     * 属性类型
     */
    public enum AttrEnum{
        ATTR_TYPE_BASE(1,"基本属性"),ATTR_TYPE_SALE(0,"销售属性");
        private final int code;
        private final String msg;

        AttrEnum(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public int getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }
    }
}
