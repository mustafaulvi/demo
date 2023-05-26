package com.example.demo.service;

import com.example.demo.dto.MyUserDto;
import com.example.demo.entity.MyUser;
import com.example.demo.repository.MyUserRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MyUserServiceImpl implements MyUserService{

    private final MyUserRepository myUserRepository;

    @Override
    public List<MyUserDto> getAllMyUsers() {
        List<MyUser> myusers = (List<MyUser>)myUserRepository.findAll();

        List<MyUserDto> myUserDtos = new ArrayList<>();
        for (MyUser m :
             myusers) {
            myUserDtos.add(new MyUserDto(m.getName(),m.getSurName()));

        }

        return myUserDtos;
    }
}
