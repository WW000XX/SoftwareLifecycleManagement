package com.example.softwarelifecyclemanagement.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateService {
    private String previous = "0";

    public Integer calculate(String text) {
        previous = text;
        int res = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != '0') {
                res++;
            }
        }
        return res;
    }

    public String getPrevious() {
        return previous;
    }
}
