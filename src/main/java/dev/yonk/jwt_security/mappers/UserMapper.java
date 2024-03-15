package dev.yonk.jwt_security.mappers;

import dev.yonk.jwt_security.dtos.UserDto;
import dev.yonk.jwt_security.models.User;

public class UserMapper {

    public static UserDto mapToUserDto(User user){
        return UserDto.builder()
                .id(user.getId())
                .email(user.getEmail())
                .username(user.getUsername())
                .password(user.getPassword())
                .build();
    }

    public static User mapToUser(UserDto userDto){
        return User.builder()
                .id(userDto.getId())
                .email(userDto.getEmail())
                .username(userDto.getUsername())
                .password(userDto.getPassword())
                .build();
    }
}
