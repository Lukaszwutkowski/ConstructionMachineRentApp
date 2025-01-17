package com.projectfinal.finalproject.controllers;


import com.projectfinal.finalproject.models.InvoiceStatus;
import com.projectfinal.finalproject.services.InvoiceStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class InvoiceStatusController {

    @Autowired
    private InvoiceStatusService invoiceStatusService;

    @GetMapping("invoiceStatuses")
    public String findAll(Model model){
        model.addAttribute("invoiceStatuses", invoiceStatusService.findAll());
        return "invoiceStatuses";
    }

    @RequestMapping("invoiceStatuses/findById")
    @ResponseBody
    public Optional<InvoiceStatus> findById(Integer id)
    {
        return invoiceStatusService.findById(id);
    }

    @PostMapping(value="invoiceStatuses/addNew")
    public String addNew(InvoiceStatus invoiceStatus) {
        invoiceStatusService.save(invoiceStatus);
        return "redirect:/invoiceStatuses";
    }

    @RequestMapping(value="invoiceStatuses/update", method = {RequestMethod.POST, RequestMethod.GET})
    public String update(InvoiceStatus invoiceStatus) {
        invoiceStatusService.save(invoiceStatus);
        return "redirect:/invoiceStatuses";
    }

    @RequestMapping(value="invoiceStatuses/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        invoiceStatusService.delete(id);
        return "redirect:/invoiceStatuses";
    }
}
