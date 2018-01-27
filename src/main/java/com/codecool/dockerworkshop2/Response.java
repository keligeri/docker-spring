package com.codecool.dockerworkshop2;

import lombok.Data;

@Data
public class Response {

    private Boolean success;
    private String message;

    public static Response buildSuccess(String msg){
        Response response = new Response();
        response.setSuccess(true);
        response.setMessage(msg);
        return response;
    }

}
