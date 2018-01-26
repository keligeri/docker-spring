package com.codecool.dockerworkshop2;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @CrossOrigin
    @RequestMapping(value = "/sayhello", method = RequestMethod.GET)
    public Response hello(@RequestParam(value = "name", required = false) String name){
        String msg = "Hello";
        if(!StringUtils.isEmpty(name)){
            msg += " " + name;
        }
        return Response.buildSuccess(msg);
    }

}
