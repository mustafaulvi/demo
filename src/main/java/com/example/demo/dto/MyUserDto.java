package com.example.demo.dto;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MyUserDto {

    private int id;
    private String name;
    private String surName;

    public MyUserDto(String name, String surname){
        this(-1,name, surname);
    }

}
