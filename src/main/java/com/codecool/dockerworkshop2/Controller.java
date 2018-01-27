package com.codecool.dockerworkshop2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private UserRepository userRepository;

    @CrossOrigin
    @RequestMapping(value = "/sayhello", method = RequestMethod.GET)
    public Response hello(@RequestParam(value = "name", required = false) String name){
        String msg = "Hello";
        if(!StringUtils.isEmpty(name)){
            msg += " " + name;
        }
        return Response.buildSuccess(msg);
    }

    @CrossOrigin
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> list(){
        return userRepository.findAll();
    }

}
