package com.example.springboot01.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Description
 * @Author 周凯
 * @Data 2023/11/10 21:45
 */
@Data
@TableName("user")
public class User {
    private Long id;
    private String username;
    private Integer age;
    private String password;
    private Integer isDeleted;
    private Integer version;

}
