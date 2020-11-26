package com.projectfinal.finalproject.controllers;


import com.projectfinal.finalproject.models.Location;
import com.projectfinal.finalproject.services.CityService;
import com.projectfinal.finalproject.services.LocationService;
import com.projectfinal.finalproject.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/locations")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @Autowired
    private CityService cityService;

    @Autowired
    private StateService stateService;

    @GetMapping("")
    public String findAll(Model model){
        model.addAttribute("locations", locationService.findAll());
        model.addAttribute("cities", cityService.findAll());
        model.addAttribute("states", stateService.findAll());

        return "locations";
    }

    @GetMapping("/findById")
    @ResponseBody
    public Optional<Location> findById(Integer id) {
        return locationService.findById(id);
    }

    @GetMapping("/findByDescriptionContaining/{description}")
    public List<Location> findByDescriptionContaining(@PathVariable("description") String description) {
        return locationService.findByDescriptionContaining(description);
    }

    @PostMapping("/addNew")
    public String save(Location location) {
        locationService.save(location);
        return "redirect:/locations";
    }

    @RequestMapping(value="/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Location location) {
        locationService.save(location);
        return "redirect:/locations";
    }

    @RequestMapping(value="/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteById(Integer id) {
        locationService.deleteById(id);
        return "redirect:/locations";
    }

}
