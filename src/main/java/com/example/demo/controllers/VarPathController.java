package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;
 
//import org.o7planning.sbjsp.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class VarPathController {
	@RequestMapping("/api/v1/{company}/{department}/{team}")
	  public String documentView(Model model,
	          @PathVariable(value = "company") String company,
	          @PathVariable(value = "department") String department,
	          @PathVariable(value = "team") String team) {
		String leader = "Unknow !";
	      model.addAttribute("company", company);
	      model.addAttribute("department", department);
	      model.addAttribute("team", team);
	      if("auction".equals(team)) {
	    	  leader = "vkiet";
	      } else if("ticket".equals(team)) {
	    	  leader = "ttuan";
	      }
	      model.addAttribute("leader", leader);
	      return "varpath";
	  }
}
