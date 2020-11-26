package com.projectfinal.finalproject.controllers;


import com.projectfinal.finalproject.models.ConstructionMachineHire;
import com.projectfinal.finalproject.services.ClientService;
import com.projectfinal.finalproject.services.ConstructionMachineHireService;
import com.projectfinal.finalproject.services.ConstructionMachineService;
import com.projectfinal.finalproject.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ConstructionMachineHireController {

    @Autowired
    private ConstructionMachineHireService constructionMachineHireService;

    @Autowired
    private ClientService clientService;

    @Autowired
    private LocationService locationService;

    @Autowired
    private ConstructionMachineService constructionMachineService;

    @GetMapping("constructionMachineHires")
    public String findAll(Model model){
        model.addAttribute("constructionMachineHires", constructionMachineHireService.findAll());
        model.addAttribute("clients", clientService.findAll());
        model.addAttribute("locations", locationService.findAll());
        model.addAttribute("constructionMachines", constructionMachineService.findAll());

        return "constructionMachineHires";
    }

    @RequestMapping("constructionMachineHires/findById")
    @ResponseBody
    public Optional<ConstructionMachineHire> findById(Integer id)
    {
        return constructionMachineHireService.findById(id);
    }

    @PostMapping(value="constructionMachineHires/addNew")
    public String addNew(ConstructionMachineHire constructionMachineHire) {
        constructionMachineHireService.save(constructionMachineHire);
        return "redirect:/constructionMachineHires";
    }

    @RequestMapping(value="constructionMachineHires/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(ConstructionMachineHire constructionMachineHire) {
        constructionMachineHireService.save(constructionMachineHire);
        return "redirect:/constructionMachineHires";
    }

    @RequestMapping(value="constructionMachineHires/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        constructionMachineHireService.delete(id);
        return "redirect:/constructionMachineHires";
    }
}
