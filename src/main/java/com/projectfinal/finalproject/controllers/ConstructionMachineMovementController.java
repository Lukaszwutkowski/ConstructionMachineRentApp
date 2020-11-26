package com.projectfinal.finalproject.controllers;


import com.projectfinal.finalproject.models.ConstructionMachineMovement;
import com.projectfinal.finalproject.services.ConstructionMachineMovementService;
import com.projectfinal.finalproject.services.ConstructionMachineService;
import com.projectfinal.finalproject.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ConstructionMachineMovementController {

    @Autowired
    private ConstructionMachineMovementService constructionMachineMovementService;

    @Autowired
    private LocationService locationService;

    @Autowired
    private ConstructionMachineService constructionMachineService;

    @GetMapping("constructionMachineMovements")
    public String findAll(Model model){
        model.addAttribute("constructionMachineMovements", constructionMachineMovementService.findAll());
        model.addAttribute("locations", locationService.findAll());
        model.addAttribute("constructionMachines", constructionMachineService.findAll());

        return "constructionMachineMovements";
    }

    @RequestMapping("constructionMachineMovements/findById")
    @ResponseBody
    public Optional<ConstructionMachineMovement> findById(Integer id)
    {
        return constructionMachineMovementService.findById(id);
    }

    @PostMapping(value="constructionMachineMovements/addNew")
    public String addNew(ConstructionMachineMovement constructionMachineMovement) {
        constructionMachineMovementService.save(constructionMachineMovement);
        return "redirect:/constructionMachineMovements";
    }

    @RequestMapping(value="constructionMachineMovements/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(ConstructionMachineMovement constructionMachineMovement) {
        constructionMachineMovementService.save(constructionMachineMovement);
        return "redirect:/constructionMachineMovements";
    }

    @RequestMapping(value="constructionMachineMovements/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        constructionMachineMovementService.delete(id);
        return "redirect:/constructionMachineMovements";
    }
}
