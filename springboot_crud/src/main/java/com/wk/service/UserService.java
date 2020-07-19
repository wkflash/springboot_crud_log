package com.wk.service;

import com.wk.annotation.AspectAnnotation;
import com.wk.entity.UserPojo;

import java.util.List;

/**
 * @author Wangkun
 * @date 2020/7/16
 * @description
 **/
public interface UserService {
    /**
     * 查询全部用户
     * @return
     */
    List<UserPojo> selectAll();
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

    /**
     * 修改回显，根据id查询当前用户
     * @param id
     * @return
     */

    UserPojo selectByPrimaryKey(Integer id);

    /**
     * 根据id修改当前用户
     * @param userPojo
     * @return
     */
    int updateByPrimaryKey(UserPojo userPojo);
}
