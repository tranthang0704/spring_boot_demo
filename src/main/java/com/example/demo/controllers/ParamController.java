package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;
 
//import org.o7planning.sbjsp.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamController {
    @RequestMapping(value = { "/param" }, method = RequestMethod.GET)
    public String index(Model model, @RequestParam(value = "name", defaultValue = "tthang") String name,
    		@RequestParam(value = "role", defaultValue = "tthang") String role
    		) {
        String message = "Hello "+  name + " ! You are " + role + " !";
        model.addAttribute("message", message);
        return "param";
    }
}
