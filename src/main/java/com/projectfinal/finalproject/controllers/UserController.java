package com.projectfinal.finalproject.controllers;


import com.projectfinal.finalproject.models.User;
import com.projectfinal.finalproject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("users")
    public String findAll(Model model){
        return "users";
    }

    @RequestMapping("users/findById")
    @ResponseBody
    public Optional<User> findById(Integer id)
    {
        return userService.findById(id);
    }

    @PostMapping(value="users/addNew")
    public String addNew(User user) {
        userService.save(user);
        return "redirect:/users";
    }

    @RequestMapping(value="users/update", method = {RequestMethod.POST, RequestMethod.GET})
    public String update(User user) {
        userService.save(user);
        return "redirect:/users";
    }

    @RequestMapping(value="users/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        userService.delete(id);
        return "redirect:/users";
    }
}
