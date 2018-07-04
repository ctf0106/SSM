package com.ctf.controller;

import java.util.List;

import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ctf.entity.User;
import com.ctf.service.UserService;

@Controller  
@RequestMapping("/user")  
public class UserController {  
    private static Logger log=Logger.getLogger(UserController.class);
    
    @Resource
    UserService userService;
    
    @RequestMapping(value="/getUser",method=RequestMethod.GET)  
    public String test(Model model){
    	User user = userService.selectUserByID(1);
        model.addAttribute("user", user);
        log.info(user);
        return "index";  
    }
    
    @RequestMapping("/list")
    public ModelAndView list() {
    	ModelAndView mav=new ModelAndView();
        List<User> list =userService.findAllUser();
        mav.addObject("userList", list);
        mav.setViewName("list");
        return mav;
    }
}  