package com.tianji.learning.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tianji.common.enums.BaseEnum;
import lombok.Getter;

@Getter
public enum PlanStatus implements BaseEnum {
    NO_PLAN(0, "没有计划"),
    PLAN_RUNNING(1, "计划进行中"),
    ;

    // 指定JSON序列化枚举时用的值
    @JsonValue
    // 指定与数据库交互时要做类型转换的值
    @EnumValue
    int value;
    String desc;

    PlanStatus(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }


    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)    // 指定JSON反序列化时使用的函数
    public static PlanStatus of(Integer value){
        if (value == null) {
            return null;
        }
        for (PlanStatus status : values()) {
            if (status.equalsValue(value)) {
                return status;
            }
        }
        return null;
    }
}
