package com.projectfinal.finalproject.controllers;


import com.projectfinal.finalproject.models.Supplier;
import com.projectfinal.finalproject.services.CityService;
import com.projectfinal.finalproject.services.StateService;
import com.projectfinal.finalproject.services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class SupplierController<CountryService> {

    @Autowired
    private StateService stateService;

    @Autowired
    private CityService cityService;

    @Autowired
    private SupplierService supplierService;

    @GetMapping("suppliers")
    public String findAll(Model model){
        model.addAttribute("cities", cityService.findAll());
        model.addAttribute("states", stateService.findAll());
        model.addAttribute("suppliers", supplierService.findAll());
        return "suppliers";
    }

    @RequestMapping("suppliers/findById")
    @ResponseBody
    public Optional<Supplier> findById(Integer id)
    {
        return supplierService.findById(id);
    }

    @PostMapping(value="suppliers/addNew")
    public String addNew(Supplier supplier) {
        supplierService.save(supplier);
        return "redirect:/suppliers";
    }

    @RequestMapping(value="suppliers/update", method = {RequestMethod.POST, RequestMethod.GET})
    public String update(Supplier supplier) {
        supplierService.save(supplier);
        return "redirect:/suppliers";
    }

    @RequestMapping(value="suppliers/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        supplierService.delete(id);
        return "redirect:/suppliers";
    }
}
