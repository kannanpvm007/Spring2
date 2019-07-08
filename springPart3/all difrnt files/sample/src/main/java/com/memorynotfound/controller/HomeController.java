package com.memorynotfound.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * HomeController
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(value="/add", method = RequestMethod.GET)
    public String add()
    {
        System.out.println("add");
        return "viewpage";
    }

    
}