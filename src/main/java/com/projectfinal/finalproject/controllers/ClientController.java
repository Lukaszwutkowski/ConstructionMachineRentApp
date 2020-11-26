package com.projectfinal.finalproject.controllers;

import com.projectfinal.finalproject.models.Client;
import com.projectfinal.finalproject.services.CityService;
import com.projectfinal.finalproject.services.ClientService;
import com.projectfinal.finalproject.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ClientController {

    @Autowired
    private StateService stateService;

    @Autowired
    private CityService cityService;

    @Autowired
    private ClientService clientService;

    @GetMapping("clients")
    public String findAll(Model model){
        model.addAttribute("states", stateService.findAll());
        model.addAttribute("cities", cityService.findAll());
        model.addAttribute("clients", clientService.findAll());
        return "clients";
    }

    @RequestMapping("clients/findById")
    @ResponseBody
    public Optional<Client> findById(Integer id) {
        return clientService.findById(id);
    }

    @PostMapping(value = "clients/addNew")
    public String addNew(Client client){
        clientService.save(client);
        return "redirect:/clients";
    }

    @RequestMapping(value = "clients/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Client client) {
        clientService.save(client);
        return "redirect:/clients";
    }

    @RequestMapping(value = "clients/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        clientService.delete(id);
        return "redirect:/clients";
    }
}
