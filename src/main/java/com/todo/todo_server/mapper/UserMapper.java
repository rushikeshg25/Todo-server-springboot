package com.todo.todo_server.mapper;

import com.todo.todo_server.dto.UserDto;
import com.todo.todo_server.entity.User;

public class UserMapper {

    public static UserDto mapToUserDto(User user){
        return new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getFirstName(),
                user.getEmail()
        );
    }

    public static User mapToUser(UserDto userDto){
        return new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getEmail(),
                userDto.getLastName()
        );
    }

}
