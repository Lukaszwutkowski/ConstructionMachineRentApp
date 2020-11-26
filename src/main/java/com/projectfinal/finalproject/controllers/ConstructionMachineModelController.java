package com.projectfinal.finalproject.controllers;

import com.projectfinal.finalproject.models.ConstructionMachineModel;
import com.projectfinal.finalproject.services.ConstructionMachineModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ConstructionMachineModelController {

    @Autowired
    private ConstructionMachineModelService constructionMachineModelService;

    @GetMapping("constructionMachineModels")
    public String findAll(Model model){
        model.addAttribute("constructionMachineModels", constructionMachineModelService.findAll());
        return "constructionMachineModels";
    }

    @RequestMapping("constructionMachineModels/findById")
    @ResponseBody
    public Optional<ConstructionMachineModel> findById(Integer id)
    {
        return constructionMachineModelService.findById(id);
    }

    @PostMapping(value="constructionMachineModels/addNew")
    public String addNew(ConstructionMachineModel constructionMachineModel) {
        constructionMachineModelService.save(constructionMachineModel);
        return "redirect:/constructionMachineModels";
    }

    @RequestMapping(value="constructionMachineModels/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(ConstructionMachineModel constructionMachineModel) {
        constructionMachineModelService.save(constructionMachineModel);
        return "redirect:/constructionMachineModels";
    }

    @RequestMapping(value="constructionMachineModels/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        constructionMachineModelService.delete(id);
        return "redirect:/constructionMachineModels";
    }
}
