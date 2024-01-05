package edu.njnu.voiceassistantbe.mapper;

import edu.njnu.voiceassistantbe.pojo.entity.User;

import java.util.List;

public interface UserMapper {
    int insertUser(User user);
    int deleteUserById(Integer id);
    int updateUser(User user);
    User selectUserById(Integer id);
    User selectUserByUsername(String username);
    List<User> selectAllUsers();

}
