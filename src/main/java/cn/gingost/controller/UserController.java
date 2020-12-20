package cn.gingost.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.gingost.pojo.User;
import cn.gingost.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/golog")
    public String log(User user, Model model) {
        User u = userService.findOne(user);
        model.addAttribute("user", u);
        if (u != null) {
            return "logok";
        } else
            return "logno";
    }

    @RequestMapping("/goreg")
    public String reg(User user) {
        User u = userService.checkReg(user.getUsername());
        if (u == null) {
            userService.addOne(user);
            return "regok";
        }
        return "regno";
    }

    @RequestMapping("/chaxun")
    public String query(ModelMap model){
        model.put("userList",userService.findall());
        return "chaxun";
    }
}

