package com.wk.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Alias("LogPojo")
public class LogPojo {
    private Integer lid;

    private String ip;

    private String url;

    private String desc;

    private String classFunction;

    private String accordParameters;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time;

    private String lremark;

}