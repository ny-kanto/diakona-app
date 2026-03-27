package com.diakona.badge.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.diakona.badge.services.BaseService;


@Controller
@RequestMapping("/base")
public class BaseController {
    @Autowired
    private BaseService baseService;

    @GetMapping("/init")
    public String initBase() {
        baseService.initBase();
        return "redirect:/personnes";
    }
}
