/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estudae.springtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author khaemhat
 */
@Controller
public class MainController {
    @RequestMapping("/")
    @ResponseBody
    public ModelAndView index(@RequestParam("name") String name){
        return "My Quick Blog";
    }
    
}
