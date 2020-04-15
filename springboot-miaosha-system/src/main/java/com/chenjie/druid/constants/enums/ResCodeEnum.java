package com.chenjie.druid.constants.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName ResCodeEnum
 * @Description (1)、code为0时：
 *                    0->请求成功，程序可以继续往下执行；
 *              (2)、code为正数时：
 *                    1到20->给tost提示，程序可以继续往下执行；
 *                    21到40：弹确认框，用户点击确认之后程序可以继续往下执行；
 *                    41到60：跳转业务逻辑页面。
 *              (3)、code为负数时：
 *                    -10到-1->弹窗错误提示框，并阻止程序继续往下执行；
 *                    -20到-11->跳转错误页面
 * @author zhigang.zhou
 * @Date 2018年10月26日 下午1:16:35
 * @version 1.0.0
 */
@Getter
@AllArgsConstructor
public enum ResCodeEnum {
    SUCCESS(0, "成功"),
    ERROR_SYSTEM(-1, "系统繁忙,请稍后再试"),
    ERROR_PARAMETER(-1, "参数错误"),
    ;
    public Integer code;

    public String msg;

}

