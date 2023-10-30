package com.example.demoFirst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class baseController {

    @RequestMapping(value = "/coll-params")
    public String carBrands(Model model){
        List<String> cars = List.of("Renault","mercedes","audi");
        model.addAttribute("cars",cars);
        return "base";
    }

}
