package com.projectfinal.finalproject.controllers;

import com.projectfinal.finalproject.models.ConstructionMachineMaintenance;
import com.projectfinal.finalproject.services.ConstructionMachineMaintenanceService;
import com.projectfinal.finalproject.services.ConstructionMachineService;
import com.projectfinal.finalproject.services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ConstructionMachineMaintenanceController {

    @Autowired
    private ConstructionMachineMaintenanceService constructionMachineMaintenanceService;

    @Autowired
    private ConstructionMachineService constructionMachineService;

    @Autowired
    private SupplierService supplierService;

    @GetMapping("constructionMachineMaintenances")
    public String findAll(Model model){
        model.addAttribute("constructionMachineMaintenances", constructionMachineMaintenanceService.findAll());
        model.addAttribute("constructionMachines", constructionMachineService.findAll());
        model.addAttribute("suppliers", supplierService.findAll());

        return "constructionMachineMaintenances";
    }

    @RequestMapping("constructionMachineMaintenances/findById")
    @ResponseBody
    public Optional<ConstructionMachineMaintenance> findById(Integer id)
    {
        return constructionMachineMaintenanceService.findById(id);
    }

    @PostMapping(value="constructionMachineMaintenances/addNew")
    public String addNew(ConstructionMachineMaintenance constructionMachineMaintenance) {
        constructionMachineMaintenanceService.save(constructionMachineMaintenance);
        return "redirect:/constructionMachineMaintenances";
    }

    @RequestMapping(value="constructionMachineMaintenances/update", method = {RequestMethod.POST, RequestMethod.GET})
    public String update(ConstructionMachineMaintenance constructionMachineMaintenance) {
        constructionMachineMaintenanceService.save(constructionMachineMaintenance);
        return "redirect:/constructionMachineMaintenances";
    }

    @RequestMapping(value="constructionMachineMaintenances/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        constructionMachineMaintenanceService.delete(id);
        return "redirect:/constructionMachineMaintenances";
    }
}
