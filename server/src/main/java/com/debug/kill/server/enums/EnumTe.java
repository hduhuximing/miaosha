package com.debug.kill.server.enums;

import lombok.Getter;


/**
 * @author ming
 * @version 1.0
 * @date 2020/4/17 10:09 上午
 * @description
 */
@Getter
public enum EnumTe {
    ONE("String", 1);
    private String string;
    private int i;

    EnumTe(String string, int i) {
        this.string = string;
        this.i = i;
    }

}
