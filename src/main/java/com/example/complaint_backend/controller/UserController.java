package com.example.complaint_backend.controller;

import com.example.complaint_backend.dao.ComplaintDao;
import com.example.complaint_backend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

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
        HashMap<String , String>map = new HashMap<>();
        List<User> result = dao.FindUser(um.getUsername());
        if (result.size()!=0){
            map.put("status","failed");
        }else{
            dao .save(um);
            map.put("status","success");
        }

        return map;

    }

    @CrossOrigin(origins = "*")

    @PostMapping(path = "/userlogin",consumes = "application/json",produces = "application/json")
    public HashMap<String , String > UserLogin (@RequestBody User um){
        List<User> result = dao.UserLogin(um.getUsername(), um.getPassword());
        HashMap<String , String>map = new HashMap<>();
        if (result.size()==0){
            map.put("status","failed");

        }else{
            map.put("status","success");

        }

        return map;
    }
}




