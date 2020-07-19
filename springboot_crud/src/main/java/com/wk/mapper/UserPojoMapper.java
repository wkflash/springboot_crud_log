package com.wk.mapper;

import com.wk.entity.UserPojo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserPojoMapper {
    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 添加用户
     * @param userPojo
     * @return
     */
    int insert(UserPojo userPojo);

    int insertSelective(UserPojo record);

    /**
     * 修改回显，根据id查询当前用户
     * @param id
     * @return
     */
    UserPojo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserPojo record);

    /**
     * 根据id修改当前用户
     * @param userPojo
     * @return
     */
    int updateByPrimaryKey(UserPojo userPojo);

    /**
     * 查询全部用户
     * @return
     */
    List<UserPojo> selectAll();
}