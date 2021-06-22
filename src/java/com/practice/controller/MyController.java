/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author RND SOFTWARE
 */
@Controller
public class MyController {
    // It can be done by declaring variables one by one as arguments
    
//    @RequestMapping("/welcome/{series}/{name}")
//    protected ModelAndView display(@PathVariable("series") String series, @PathVariable("name") String name){
//        ModelAndView mav = new ModelAndView("welcome");
//        mav.addObject("msg", series + " from " + name);
//        return mav;
//    }
    
    
    
    // Instead of passing each pathvariable one by one, we can use map object
    
    @RequestMapping("/welcome/{series}/{name}")
    protected ModelAndView display(@PathVariable Map<String, String> map){
        ModelAndView mav = new ModelAndView("welcome");
        String value = map.get("series") + " from " + map.get("name") + " using map";
        mav.addObject("msg", value);
        return mav;
    }
}
