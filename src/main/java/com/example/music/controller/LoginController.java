package com.example.music.controller;

import com.example.music.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Administrator on 2018/4/7 0007.
 */
@Controller
public class LoginController {

    @RequestMapping("login")
    public String login(Model model){
        model.addAttribute("user", new User());
        return "login";
    }

    @RequestMapping(value = "loginValid",method = RequestMethod.POST)
    public  @ResponseBody User index(@Valid User user, BindingResult result, Model model){
        System.out.println(" user.getPassowrd()"+ user.getPassowrd()+":"+ user.getUserName());
        if (result.hasErrors()) {
            List<ObjectError> error = result.getAllErrors();
            for (ObjectError e : error) {
                System.out.println(e);
            }
            return null;
        }
        return user;
    }

    @RequestMapping("index")
    public String index(){
        return "index";
    }

}
