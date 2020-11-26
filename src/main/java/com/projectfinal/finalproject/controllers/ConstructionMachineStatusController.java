package com.projectfinal.finalproject.controllers;


import com.projectfinal.finalproject.models.ConstructionMachineStatus;
import com.projectfinal.finalproject.services.ConstructionMachineStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ConstructionMachineStatusController {

    @Autowired
    private ConstructionMachineStatusService constructionMachineStatusService;

    @GetMapping("constructionMachineStatuses")
    public String findAll(Model model){
        model.addAttribute("constructionMachineStatuses", constructionMachineStatusService.findAll());
        return "constructionMachineStatuses";
    }

    @RequestMapping("constructionMachineStatuses/findById")
    @ResponseBody
    public Optional<ConstructionMachineStatus> findById(Integer id)
    {
        return constructionMachineStatusService.findById(id);
    }

    @PostMapping(value="constructionMachineStatuses/addNew")
    public String addNew(ConstructionMachineStatus constructionMachineStatus) {
        constructionMachineStatusService.save(constructionMachineStatus);
        return "redirect:/constructionMachineStatuses";
    }

    @RequestMapping(value="constructionMachineStatuses/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(ConstructionMachineStatus constructionMachineStatus) {
        constructionMachineStatusService.save(constructionMachineStatus);
        return "redirect:/constructionMachineStatuses";
    }

    @RequestMapping(value="constructionMachineStatuses/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        constructionMachineStatusService.delete(id);
        return "redirect:/constructionMachineStatuses";
    }
}
