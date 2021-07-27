 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.controller;

import com.spring.entity.stentity;
import com.spring.inter.stinterf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author shyam
 */
@Controller
public class control {

    @Autowired
    stinterf dao;

    @RequestMapping("/")
    public String index() {
        return "index";

    }

    @RequestMapping("/register")
    public String register(@ModelAttribute("stentity") stentity st, Model md) {
        if (dao.register(st)) {
            md.addAttribute("msg", "register sucessfully");
            return "redirect:/";
        } else {
            md.addAttribute("msg", "register failed");
            return "redirect:/";
        }

    }

    @RequestMapping("/list")
    public String select(Model md) {
        md.addAttribute("lis", dao.alldata());
        return "select";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam("id") int id, Model md) {
        if (dao.delete(id)) {
        md.addAttribute("lis",dao.alldata());
            return "select";
        } else {
          md.addAttribute("lis",dao.alldata());
            return "select";

        }

    }
    @RequestMapping("/edit")
    public String editdata(@RequestParam("id") int id,Model md){
       stentity se=dao.getById(id);
       md.addAttribute("st", se);
        return "edit";
    }
    @RequestMapping("/update")
    public String updatedata(@ModelAttribute("stentity") stentity se,Model md){
     
        if(dao.update(se)){
            md.addAttribute("msg", "update sucessfully");
           return "redirect:/list"; 
        }else{
             md.addAttribute("msg", "update failed");
            return "redirect:/list";
        }
     
        
        
    }
}
