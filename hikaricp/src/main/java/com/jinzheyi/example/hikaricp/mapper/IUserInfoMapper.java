package com.jinzheyi.example.hikaricp.mapper;

import com.jinzheyi.example.hikaricp.bean.UserInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IUserInfoMapper {

    @Select("SELECT id, username FROM userinfo WHERE id = #{id}")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "username", column = "username")
    })
    UserInfo findById(@Param(value = "id") String id);

    @Select("SELECT * FROM userinfo")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "username", column = "username")
    })
    List<UserInfo> getAll();

    @Insert("INSERT INTO userinfo(id,username) VALUES(#{id}, #{username})")
    void insert(UserInfo user);

    @Update("UPDATE userinfo SET username=#{username} WHERE id =#{id}")
    void update(UserInfo user);

    @Delete("DELETE FROM userinfo WHERE id =#{id}")
    void delete(Integer id);


}
