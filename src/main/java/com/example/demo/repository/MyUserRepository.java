package com.example.demo.repository;

import com.example.demo.entity.MyUser;
import org.springframework.data.repository.CrudRepository;

public interface  MyUserRepository extends CrudRepository<MyUser,Integer> {
}
