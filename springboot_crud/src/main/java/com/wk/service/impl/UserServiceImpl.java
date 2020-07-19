package com.wk.service.impl;

import com.wk.entity.UserPojo;
import com.wk.mapper.UserPojoMapper;
import com.wk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Wangkun
 * @date 2020/7/16
 * @description
 **/
@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserPojoMapper userPojoMapper;
    /**
     * 查询全部用户
     * @return
     */
    @Override
    public List<UserPojo> selectAll() {
        return userPojoMapper.selectAll();
    }
    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userPojoMapper.deleteByPrimaryKey(id);
    }
    /**
     * 添加用户
     * @param userPojo
     * @return
     */
    @Override
    public int insert(UserPojo userPojo) {
        return userPojoMapper.insert(userPojo);
    }

    @Override
    public UserPojo selectByPrimaryKey(Integer id) {
        return userPojoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(UserPojo userPojo) {
        return userPojoMapper.updateByPrimaryKey(userPojo);
    }
}

