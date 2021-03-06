package com.wei.mao.enumTest;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * @Author 毛伟
 * @Date 10/17/17  15:31
 */
@AllArgsConstructor
@Getter
public enum TypeEnumWithValue {
    TYPE1(1, "Type A11"), TYPE2(2, "Type B22");

    private int id;
    private String name;


//    @JsonValue
//    public String getName() {
//        return name;
//    }
}
