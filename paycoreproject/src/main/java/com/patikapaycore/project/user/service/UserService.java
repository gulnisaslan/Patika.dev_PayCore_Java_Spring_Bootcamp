package com.patikapaycore.project.user.service;

import com.patikapaycore.project.user.model.dto.UserRequestDto;
import com.patikapaycore.project.user.model.dto.UserResponseDto;
import com.patikapaycore.project.user.model.entity.User;

import java.util.List;

public interface UserService {

        List<UserResponseDto> getAllUsers();

        UserResponseDto getByUserId(Integer id);
        User getByUserId1(Integer id);

        UserResponseDto addUser(UserRequestDto userRequestDto);

        UserResponseDto updateUser(Integer userId,UserRequestDto requestDto);

        boolean deleteUser(Integer id);

        UserResponseDto findByUsername(String username);

        boolean existsByUsername(String username);

        void deleteByUsername(String username);


}
