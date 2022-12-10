package com.example.complaint_backend.controller;

import com.example.complaint_backend.dao.ComplaintDao;
import com.example.complaint_backend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController

public class UserController {

    @Autowired
    private ComplaintDao dao ;

    @CrossOrigin(origins = "*")

    @GetMapping("/")
    public String HomePage(){
        return "Welcome";
    }

    @CrossOrigin(origins = "*")

    @PostMapping(path = "/userreg",consumes = "application/json",produces = "application/json")
    public HashMap <String , String> UserReg(@RequestBody User um){
        dao .save(um);
        HashMap<String , String>map = new HashMap<>();
        map.put("status","success");
        return map;




    }
}
