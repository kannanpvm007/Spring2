package com.memorynotfound.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * HomeController
 */
@Controller
@RequestMapping("/")
public class HomeController 
{   
    @RequestMapping(method = RequestMethod.GET)
    public String add(ModelMap mp )
    {
mp.addAttribute("hi", "attributeValue");
        System.out.println("add");
        return "index";
    }
    

    
}