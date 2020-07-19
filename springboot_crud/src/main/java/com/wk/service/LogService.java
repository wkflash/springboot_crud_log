package com.wk.service;

import com.wk.entity.LogPojo;

import java.util.List;

/**
 * @author Wangkun
 * @date 2020/7/18
 * @description
 **/
public interface LogService {
    /**
     * 插入日志
     * @param logPojo
     * @return
     */
    int insert(LogPojo logPojo);

    /**
     * 查询全部日志
     * @return
     */
    List<LogPojo> selectAll();

    /**
     * 删除日志
     * @param lid
     * @return
     */
    int deleteByPrimaryKey(Integer lid);
}
