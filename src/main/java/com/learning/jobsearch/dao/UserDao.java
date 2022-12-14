package com.learning.jobsearch.dao;

import com.learning.jobsearch.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    void addUser(User user);
    User findByUserEmail(String email);
    User findUserById(String id);
    void updateUser(User user);
    void deleteUserById(String id);
    Integer uploadImageByUid(String id, String image);
}
