package com.patikapaycore.project.services.abstracts;

import com.patikapaycore.project.dtos.request.UserRequestDto;
import com.patikapaycore.project.dtos.response.UserResponseDto;
import com.patikapaycore.project.models.entities.User;

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
