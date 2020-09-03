package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class ThymeleafController {

    @GetMapping("/first")
    public String first(Model model) {
        model.addAttribute("message", "Hello, Thymeleaf!");
        return "index1";
    }

    @GetMapping("/second")
    public String second(Model model) {
        List<User> list = new ArrayList<User>();

        User u1 = new User();
        u1.setId(1);
        u1.setName("优就业");
        u1.setAge(18);

        list.add(u1);

        User u2 = new User();
        u2.setId(2);
        u2.setName("中公教育");
        u2.setAge(28);

        list.add(u2);

        User u3 = new User();
        u3.setId(3);
        u3.setName("IT先锋");
        u3.setAge(38);

        list.add(u3);

        model.addAttribute("userList", list);
        model.addAttribute("flag", true);
        return "index2";
    }

    @GetMapping("/third")
    public String third() {
        return "index3";
    }

}
