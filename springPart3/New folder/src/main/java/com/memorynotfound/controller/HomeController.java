package com.memorynotfound.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * HomeController
 */
@Controller
@RequestMapping("/")
public class HomeController 
{
    
    
    public String add()
    {
        System.out.println("add");
        return "index";
    }

    
}