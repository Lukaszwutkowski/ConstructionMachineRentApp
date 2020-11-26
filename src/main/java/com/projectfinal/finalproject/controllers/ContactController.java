package com.projectfinal.finalproject.controllers;


import com.projectfinal.finalproject.models.Contact;
import com.projectfinal.finalproject.services.CityService;
import com.projectfinal.finalproject.services.ContactService;
import com.projectfinal.finalproject.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ContactController {

    @Autowired
    private StateService stateService;

    @Autowired
    private CityService cityService;

    @Autowired
    private ContactService contactService;

    @GetMapping("/contacts")
    public String findAll(Model model){
        model.addAttribute("cities", cityService.findAll());
        model.addAttribute("states", stateService.findAll());
        model.addAttribute("contacts", contactService.findAll());
        return "contacts";
    }

    @RequestMapping("contacts/findById")
    @ResponseBody
    public Optional<Contact> findById(Integer id)
    {
        return contactService.findById(id);
    }

    @PostMapping(value="contacts/addNew")
    public String addNew(Contact contact) {
        contactService.save(contact);
        return "redirect:/contacts";
    }

    @RequestMapping(value="contacts/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Contact contact) {
        contactService.save(contact);
        return "redirect:/contacts";
    }

    @RequestMapping(value="contacts/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        contactService.delete(id);
        return "redirect:/contacts";
    }
}
