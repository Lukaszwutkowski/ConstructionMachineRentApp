package com.projectfinal.finalproject.controllers;

import com.projectfinal.finalproject.models.ConstructionMachineMake;
import com.projectfinal.finalproject.services.ConstructionMachineMakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ConstructionMachineMakeController {

    @Autowired
    private ConstructionMachineMakeService constructionMachineMakeService;

    @GetMapping("constructionMachineMakes")
    public String findAll(Model model){
        model.addAttribute("constructionMachineMakes", constructionMachineMakeService.findAll());
        return "constructionMachineMakes";
    }

    @RequestMapping("constructionMachineMakes/findById")
    @ResponseBody
    public Optional<ConstructionMachineMake> findById(Integer id)
    {
        return constructionMachineMakeService.findById(id);
    }

    @PostMapping(value="constructionMachineMakes/addNew")
    public String addNew(ConstructionMachineMake constructionMachineMake) {
        constructionMachineMakeService.save(constructionMachineMake);
        return "redirect:/constructionMachineMakes";
    }

    @RequestMapping(value="constructionMachineMakes/update", method = {RequestMethod.POST, RequestMethod.GET})
    public String update(ConstructionMachineMake constructionMachineMake) {
        constructionMachineMakeService.save(constructionMachineMake);
        return "redirect:/constructionMachineMakes";
    }

    @RequestMapping(value="constructionMachineMakes/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        constructionMachineMakeService.delete(id);
        return "redirect:/constructionMachineMakes";
    }
}
