package com.projectfinal.finalproject.controllers;


import com.projectfinal.finalproject.models.EmployeeType;
import com.projectfinal.finalproject.services.EmployeeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class EmployeeTypeController {

    @Autowired
    private EmployeeTypeService employeeTypeService;

    @GetMapping("employeeTypes")
    public String findAll(Model model){
        model.addAttribute("employeeTypes", employeeTypeService.findAll());
        return "employeeTypes";
    }

    @RequestMapping("employeeTypes/findById")
    @ResponseBody
    public Optional<EmployeeType> findById(Integer id)
    {
        return employeeTypeService.findById(id);
    }

    @PostMapping(value="employeeTypes/addNew")
    public String addNew(EmployeeType employeeType) {
        employeeTypeService.save(employeeType);
        return "redirect:/employeeTypes";
    }

    @RequestMapping(value="employeeTypes/update", method = {RequestMethod.POST, RequestMethod.GET})
    public String update(EmployeeType employeeType) {
        employeeTypeService.save(employeeType);
        return "redirect:/employeeTypes";
    }

    @RequestMapping(value="employeeTypes/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        employeeTypeService.delete(id);
        return "redirect:/employeeTypes";
    }
}
