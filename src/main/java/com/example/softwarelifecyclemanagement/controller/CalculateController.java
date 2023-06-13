package com.example.softwarelifecyclemanagement.controller;

import com.example.softwarelifecyclemanagement.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalculateController {
    @Autowired
    CalculateService calculateService;

    @RequestMapping("/api/hamming")
    @ResponseBody
    public Integer calculateHamming(String string) {
        return calculateService.calculate(string);
    }

    @RequestMapping("/api/hamming/previous")
    @ResponseBody
    public String getPrevious() {
        return calculateService.getPrevious();
    }
}
