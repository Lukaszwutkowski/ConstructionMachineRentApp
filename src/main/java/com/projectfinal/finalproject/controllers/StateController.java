package com.projectfinal.finalproject.controllers;

import com.projectfinal.finalproject.models.State;
import com.projectfinal.finalproject.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class StateController {

    @Autowired
    private StateService stateService;

    @GetMapping("states")
    public String findAll(Model model) {
        model.addAttribute("states", stateService.findAll());
        return "states";
    }

    @RequestMapping("states/findById")
    @ResponseBody
    public Optional<State> findById(Integer id)
    {
        return stateService.findById(id);
    }

    @PostMapping(value="states/addNew")
    public String addNew(State state) {
        stateService.save(state);
        return "redirect:/states";
    }

    @RequestMapping(value="states/update", method = {RequestMethod.POST, RequestMethod.GET})
    public String update(State state) {
        stateService.findById(state.getId());
        stateService.save(state);
        return "redirect:/states";
    }

    @RequestMapping(value="states/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        stateService.delete(id);
        return "redirect:/states";
    }
}
