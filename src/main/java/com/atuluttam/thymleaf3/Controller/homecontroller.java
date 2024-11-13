package com.atuluttam.thymleaf3.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homecontroller {

    @GetMapping("/")
    public String homepage(Model model)
    {
        model.addAttribute("msg", "Welcome to JAVA!!!");
        return "home";
    }
    @GetMapping("/elvis")
public String elvisexample(Model model)
{
    model.addAttribute("isAdmin", true);
   //model.addAttribute("Role", "Admin");
    model.addAttribute("Role", "Guest");
    return "elvis";
}
    /*
Elvis operator     ? :
    **/

}
