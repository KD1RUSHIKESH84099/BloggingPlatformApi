package com.example.BloggingPlatformAPI.demo.repository;

import com.example.BloggingPlatformAPI.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IUserRepo extends JpaRepository<User,Integer> {
    @Query(value = "select * from user_model where user_name=:userName",nativeQuery = true)
    List<User> findByUserName(String userName);


}
