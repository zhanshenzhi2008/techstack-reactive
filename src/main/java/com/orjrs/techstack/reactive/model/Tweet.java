package com.orjrs.techstack.reactive.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Tweet
 *
 * @author liujun
 * @date 2023/3/6 22:24
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tweet implements Serializable {

    /** 描述 */
    private String desc;

    /** 用户名 */
    private String userName;
}
