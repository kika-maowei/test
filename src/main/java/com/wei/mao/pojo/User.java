package com.wei.mao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/3/22  上午11:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String duid;
    private String app_name;
    //private String tag;
    //private LocalDateTime update_time;
    //private LocalDate date;

    @Override
    public String toString() {
        return duid + "," + app_name;
    }

    public String getFields() {
        return "duid,app_name";
    }

}
