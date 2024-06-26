package com.nowcoder.mapper;

import com.nowcoder.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User selectById(Integer id);

    User selectByUserName(String username);

    User selectByEmail(String email);

    void insert(User user);
}
