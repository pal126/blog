package com.pal.entity.enums;

/**
 * 订单状态
 * @author pal
 */
public enum OrderStatus {

    INIT("初始化"),

    PROCESS("处理中"),

    SUCCESS("成功"),

    FAIL("失败");

    private String desc;

    OrderStatus(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

}
