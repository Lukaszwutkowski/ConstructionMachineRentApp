package com.projectfinal.finalproject.controllers;


import com.projectfinal.finalproject.models.City;
import com.projectfinal.finalproject.services.CityService;
import com.projectfinal.finalproject.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class CityController {

    @Autowired
    private CityService cityService;

    @Autowired
    private StateService stateService;

    @GetMapping("cities")
    public String findAll(Model model){
        model.addAttribute("cities", cityService.findAll());
        model.addAttribute("states", stateService.findAll());
        return "cities";
    }

    @RequestMapping("cities/findById")
    @ResponseBody
    public Optional<City> findById(Integer id)
    {
        return cityService.findById(id);
    }

    @PostMapping(value="cities/addNew")
    public String addNew(City city) {
        cityService.save(city);
        return "redirect:/cities";
    }

    @RequestMapping(value="cities/update", method = {RequestMethod.POST, RequestMethod.GET})
    public String update(City city) {
        cityService.save(city);
        return "redirect:/cities";
    }

    @RequestMapping(value="cities/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        cityService.delete(id);
        return "redirect:/cities";
    }

}
