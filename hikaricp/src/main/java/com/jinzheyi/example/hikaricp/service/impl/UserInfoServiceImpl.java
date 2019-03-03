package com.jinzheyi.example.hikaricp.service.impl;

import com.jinzheyi.example.hikaricp.bean.UserInfo;
import com.jinzheyi.example.hikaricp.mapper.IUserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserInfoServiceImpl implements IUserInfoService {

    @Autowired
    IUserInfoMapper iUserInfoMapper;

    @Override
    public List<UserInfo> listAll() {
        return iUserInfoMapper.getAll();
    }

    /**
     *
     * @param userInfo
     */
    //使用@Transactional开启事务，出错时抛出RuntimeException
    @Transactional(rollbackFor = RuntimeException.class)
    @Override
    public void insertOne(UserInfo userInfo) {
        iUserInfoMapper.insert(userInfo);
    }
}
