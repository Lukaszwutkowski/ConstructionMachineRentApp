package com.projectfinal.finalproject.controllers;


import com.projectfinal.finalproject.models.ConstructionMachineType;
import com.projectfinal.finalproject.services.ConstructionMachineTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ConstructionMachineTypeController {

    @Autowired
    private ConstructionMachineTypeService constructionMachineTypeService;

    @GetMapping("constructionMachineTypes")
    public String findAll(Model model){
        model.addAttribute("constructionMachineTypes", constructionMachineTypeService.findAll());
        return "constructionMachineTypes";
    }

    @RequestMapping("constructionMachineTypes/findById")
    @ResponseBody
    public Optional<ConstructionMachineType> findById(Integer id)
    {
        return constructionMachineTypeService.findById(id);
    }

    //Add VehicleType
    @PostMapping(value="constructionMachineTypes/addNew")
    public String addNew(ConstructionMachineType constructionMachineType) {
        constructionMachineTypeService.save(constructionMachineType);
        return "redirect:/constructionMachineTypes";
    }

    @RequestMapping(value="constructionMachineTypes/update", method = {RequestMethod.POST, RequestMethod.GET})
    public String update(ConstructionMachineType constructionMachineType) {
        constructionMachineTypeService.save(constructionMachineType);
        return "redirect:/constructionMachineTypes";
    }

    @RequestMapping(value="constructionMachineTypes/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        constructionMachineTypeService.delete(id);
        return "redirect:/constructionMachineTypes";
    }

}
