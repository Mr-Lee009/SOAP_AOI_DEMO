package com.edu.mta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarController {
    @RequestMapping(value = "/car", method = RequestMethod.GET)
    public String Hello(HttpServletRequest request) {
        request.setAttribute("hello","Hello Le Anh Duc");
        return "car";
    }
}
