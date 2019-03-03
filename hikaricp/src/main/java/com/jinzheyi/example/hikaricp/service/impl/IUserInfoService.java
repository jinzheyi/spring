package com.jinzheyi.example.hikaricp.service.impl;

import com.jinzheyi.example.hikaricp.bean.UserInfo;
import java.util.List;

/**
* @Description:    获取用户数据的接口类
* @Author:         jinzheyi
* @CreateDate:     2019/2/28 0028 上午 0:15
* @UpdateUser:     jinzheyi
* @UpdateDate:     2019/2/28 0028 上午 0:15
* @UpdateRemark:   [请填写修改内容]
* @Version:        1.0
*/
public interface IUserInfoService {

    /**
    　* @description: 获取全部用户数据的接口
    　* @param $tags}
    　* @return ${return_type}
    　* @throws
    　* @author jinzheyi
    　* @date 2019/2/28 0028 上午 0:15
    　*/
    List<UserInfo> listAll();

    /**
    　* @description: 添加用户数据，插入单条记录
    　* @param $tags}
    　* @return ${return_type}
    　* @throws
    　* @author jinzheyi
    　* @date 2019/2/28 0028 上午 0:16
    　*/
    void insertOne(UserInfo userInfo);

}
