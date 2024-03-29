package com.patikapaycore.project.user.service;


import com.patikapaycore.project.user.model.dto.UserRequestDto;
import com.patikapaycore.project.user.model.dto.UserResponseDto;
import com.patikapaycore.project.user.model.entity.User;

import com.patikapaycore.project.user.repository.UserRepository;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper mapper;


    public UserServiceImpl(UserRepository userRepository,ModelMapper mapper) {
        this.userRepository = userRepository;
        this.mapper =mapper;

    }


    @Override
    public List<UserResponseDto> getAllUsers() {
        List<User> allUsers = this.userRepository.findAll();
        return allUsers.stream()
                .map(user->mapper.map(user,UserResponseDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public UserResponseDto getByUserId(Integer id) {
        User getByUserId = this.userRepository.getById(id);
        return mapper.map(getByUserId,UserResponseDto.class);
    }

    @Override
    public User getByUserId1(Integer id) {
        return this.userRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }


    @Override
    public boolean deleteUser(Integer id) {
        User byId = this.userRepository.getById(id);
        this.userRepository.delete(byId);
        return true;
    }

    @Override
    public UserResponseDto findByUsername(String username) {

        User getByUsername = this.userRepository.findByUsername(username);
        return mapper.map(getByUsername,UserResponseDto.class);
    }

    @Override
    public boolean existsByUsername(String username) {

        return this.userRepository.existsByUsername(username);
    }

    @Override
    public void deleteByUsername(String username) {
        this.userRepository.deleteByUsername(username);

    }


    @Override
    public UserResponseDto addUser(UserRequestDto userRequestDto) {
        User saveUser = this.userRepository.save(mapper.map(userRequestDto, User.class));

        return mapper.map(saveUser, UserResponseDto.class);
    }


   


    @Override
    public UserResponseDto updateUser(Integer userId, UserRequestDto requestDto) {
        
        return null;
    }


}
