package com.jinzheyi.example.hikaricp.controller;

import com.alibaba.fastjson.JSON;
import com.jinzheyi.example.hikaricp.bean.UserInfo;
import com.jinzheyi.example.hikaricp.service.impl.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
* @Description:    页面获取数据的控制器
* @Author:         jinzheyi
* @CreateDate:     2019/2/28 0028 上午 0:10
* @UpdateUser:     jinzheyi
* @UpdateDate:     2019/2/28 0028 上午 0:10
* @UpdateRemark:   [请填写修改内容]
* @Version:        1.0
*/
@RestController
public class UserInfoController {

    @Autowired
    @Qualifier("userInfoServiceImpl")
    IUserInfoService iUserInfoService;

    /**
    　* @description: 获取全部用户数据，不含分页
    　* @param ${tags}
    　* @return ${return_type}
    　* @throws
    　* @author jinzheyi
    　* @date 2019/2/28 0028 上午 0:10
    　*/
    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public List<UserInfo> getAll(){
        List<UserInfo> list = iUserInfoService.listAll();
        System.out.println("选出所有人："+ JSON.toJSONString(list));
        return list;
    }

    /**
    　* @description: 添加用户
    　* @param $tags}
    　* @return ${return_type}
    　* @throws
    　* @author jinzheyi
    　* @date 2019/2/28 0028 上午 0:17
    　*/
    @RequestMapping(value = "/saveUserInfo",method = RequestMethod.POST)
    public List<UserInfo> insertOne(UserInfo userInfo){
        System.out.println(userInfo.getId()+"and"+userInfo.getUsername());
        iUserInfoService.insertOne(userInfo);
        return getAll();
    }

}
