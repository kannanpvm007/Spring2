package com.memorynotfound.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/sec")
public class Sec {
    
    //@RequestMapping (value = "/add",method =RequestMethod.GET)
    @RequestMapping(method = RequestMethod.GET) 
    // @ResponseBody //(to print hear(broswer) )

    public String ok() {
        System.out.println("2nd b ");

        System.out.println("2nd ");
        return "ok";



    }
    @RequestMapping(method = RequestMethod.GET)
//@ResponseBody
    String print(){
        return "@rsponseBody";

    }

    
}