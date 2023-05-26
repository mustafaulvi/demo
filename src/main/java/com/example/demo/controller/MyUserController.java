package com.example.demo.controller;

import com.example.demo.dto.MyUserDto;
import com.example.demo.service.MyUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MyUserController {

    private final MyUserService myUserService;

    @GetMapping("/myusers")
    public List<MyUserDto> getAllMyUser(){

        return myUserService.getAllMyUsers();

    }
}
