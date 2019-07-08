package com.memorynotfound.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/sec/")
public class Sec {
    
@RequestMapping (method =RequestMethod.GET)
   @ResponseBody //(to print hear(broswer) )
    public String ok()
    {
        System.out.println("2nd b ");

        //System.out.println("2nd ");
        return "okwelll....";
    }
   // @RequestMapping(method = RequestMethod.GET)
    @ResponseBody

     public String Sec(){
System.out.print("cons");

        return "ok...const";

     }
}