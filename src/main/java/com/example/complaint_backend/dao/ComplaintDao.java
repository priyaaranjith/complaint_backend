package com.example.complaint_backend.dao;

import com.example.complaint_backend.model.User;
import org.springframework.data.repository.CrudRepository;

public interface ComplaintDao extends CrudRepository<User,Integer> {


}
