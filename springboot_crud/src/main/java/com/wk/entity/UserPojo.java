package com.wk.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.internal.NotNull;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
public class UserPojo {
    private Integer id;

    private String uanme;

    private String phonenum;

    private String idcard;

    private String province;

    private String city;

    private String email;

    private String remark;

    private Integer status;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date creatdate;

}