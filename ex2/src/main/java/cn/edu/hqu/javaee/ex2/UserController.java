package cn.edu.hqu.javaee.ex2;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping
    public String Register(@ModelAttribute("form")User user, Model model){

        model.addAttribute("user",user);

        return "success";
    }
}
