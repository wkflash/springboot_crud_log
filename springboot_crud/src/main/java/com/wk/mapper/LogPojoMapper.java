package com.wk.mapper;

import com.wk.entity.LogPojo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogPojoMapper {
    /**
     * 删除日志
     * @param lid
     * @return
     */
    int deleteByPrimaryKey(Integer lid);

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

    int insertSelective(LogPojo record);

    LogPojo selectByPrimaryKey(Integer lid);

    int updateByPrimaryKeySelective(LogPojo record);

    int updateByPrimaryKey(LogPojo record);


}