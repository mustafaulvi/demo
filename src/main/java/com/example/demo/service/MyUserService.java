package com.example.demo.service;

import com.example.demo.dto.MyUserDto;
import com.example.demo.repository.MyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

 //configuration bean
public interface MyUserService {

    List<MyUserDto> getAllMyUsers();
}
