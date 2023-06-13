package com.patikapaycore.project.controllers;

import com.patikapaycore.project.dtos.request.UserRequestDto;
import com.patikapaycore.project.dtos.response.UserResponseDto;
import com.patikapaycore.project.services.abstracts.UserService;

import org.springframework.data.repository.query.Param;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;



@Validated
@RestController

@RequestMapping( "/api/users")
public class UsersController {
    private final UserService userService;


    public UsersController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping(value = "/getalluser")
    public List<UserResponseDto> getAll(){
        return this.userService.getAllUsers();

    }

    @GetMapping(value = "/getbyuserid/{id}")
    public UserResponseDto getById(@PathVariable @Min(1) @Param("{id}") Integer id){
        return this.userService.getByUserId(id);
    }

    @PostMapping(value = "/createuser",consumes ={"application/json"})
    public UserResponseDto add(@Valid @RequestBody UserRequestDto userRequestDto){
        return this.userService.addUser(userRequestDto);
    }



    @DeleteMapping(value = "/deleteuser/{id}")
    public boolean delete(@PathVariable @Min(1) @Param("{id}") Integer id){
        this.userService.deleteUser(id);
        return true;
    }

}
