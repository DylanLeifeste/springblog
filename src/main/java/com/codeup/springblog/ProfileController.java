package com.codeup.springblog;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProfileController {

    @GetMapping("/profile/{username}")
    public String profilePage(@PathVariable String username, Model model){
        model.addAttribute("user", username);
        return "profile";
    }

}
