package com.example.complaint_backend.dao;

import com.example.complaint_backend.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ComplaintDao extends CrudRepository<User,Integer> {
    @Query(value = "SELECT `id`, `address`, `email`, `mobile`, `name`, `password`, `username` FROM `user_reg` WHERE `username` = :username AND `password` = :password",nativeQuery = true)
    List<User> UserLogin(@Param("username") String username , @Param("password") String password);

    @Query(value = "SELECT `id`, `address`, `email`, `mobile`, `name`, `password`, `username` FROM `user_reg` WHERE `username`= :username",nativeQuery = true)
    List<User> FindUser(@Param("username") String username);


}
