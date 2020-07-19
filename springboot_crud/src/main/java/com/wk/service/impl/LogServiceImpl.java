package com.wk.service.impl;

import com.wk.entity.LogPojo;
import com.wk.mapper.LogPojoMapper;
import com.wk.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Wangkun
 * @date 2020/7/18
 * @description
 **/
@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogPojoMapper logPojoMapper;
    /**
     * 插入日志
     * @param logPojo
     * @return
     */
    @Override
    public int insert(LogPojo logPojo) {
        return logPojoMapper.insert(logPojo);
    }

    /**
     * 查询全部日志
     * @return
     */
    @Override
    public List<LogPojo> selectAll() {
        return logPojoMapper.selectAll();
    }

    /**
     * 删除日志
     * @param lid
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Integer lid) {
        return logPojoMapper.deleteByPrimaryKey(lid);
    }
}
