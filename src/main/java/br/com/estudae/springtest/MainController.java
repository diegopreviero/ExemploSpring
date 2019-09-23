/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estudae.springtest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author khaemhat
 */
@Controller
public class MainController {
    @RequestMapping("/")
    //@ResponseBody
    public ModelAndView index(@RequestParam("name") String name){
        Map<String, Object> model = new HashMap<>();
        model.put("name", name);
    	return new ModelAndView("/index", model);
    }
    
}
