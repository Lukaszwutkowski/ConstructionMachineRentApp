package com.projectfinal.finalproject.controllers;


import com.projectfinal.finalproject.models.ConstructionMachine;
import com.projectfinal.finalproject.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ConstructionMachineController {

    @Autowired
    private ConstructionMachineService constructionMachineService;

    @Autowired
    private ConstructionMachineTypeService constructionMachineTypeService;

    @Autowired
    private ConstructionMachineMakeService constructionMachineMakeService;

    @Autowired
    private ConstructionMachineModelService constructionMachineModelService;

    @Autowired
    private LocationService locationService;

    @Autowired
    private EmployeeService employeeService ;

    @Autowired
    private ConstructionMachineStatusService constructionMachineStatusService;

    @GetMapping("constructionMachines")
    public String findAll(Model model){
        model.addAttribute("constructionMachines", constructionMachineService.findAll());
        model.addAttribute("constructionMachineTypes", constructionMachineTypeService.findAll());
        model.addAttribute("constructionMachineModels", constructionMachineModelService.findAll());
        model.addAttribute("constructionMachineMakes", constructionMachineMakeService.findAll());
        model.addAttribute("locations", locationService.findAll());
        model.addAttribute("employees", employeeService.findAll());
        model.addAttribute("constructionMachineStatuses", constructionMachineStatusService.findAll());

        return "constructionMachines";
    }

    @RequestMapping("constructionMachines/findById")
    @ResponseBody
    public Optional<ConstructionMachine> findById(Integer id)
    {
        return constructionMachineService.findById(id);
    }

    @PostMapping(value="constructionMachines/addNew")
    public String addNew(ConstructionMachine constructionMachine) {
        constructionMachineService.save(constructionMachine);
        return "redirect:/constructionMachines";
    }

    @RequestMapping(value="constructionMachines/update", method = {RequestMethod.POST, RequestMethod.GET})
    public String update(ConstructionMachine constructionMachine) {
        constructionMachineService.save(constructionMachine);
        return "redirect:/constructionMachines";
    }

    @RequestMapping(value="constructionMachines/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        constructionMachineService.delete(id);
        return "redirect:/constructionMachines";
    }
}
