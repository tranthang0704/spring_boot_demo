package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;
 
//import org.o7planning.sbjsp.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {
        String message = "Hello World with Spring Boot & JSP";
        model.addAttribute("message", message);
        return "index";
    }

}
