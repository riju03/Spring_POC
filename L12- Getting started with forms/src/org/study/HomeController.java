package org.study;


import org.springframework.ui.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.*;


@Controller
public class HomeController {

	//RequestMapping annotation is used to map web requests onto specific handler classes and/or handler methods. 
	
	@RequestMapping(value="/",method= RequestMethod.GET)
	public String homepage() {
		return "home";
	}
	@RequestMapping
	@GetMapping("displayname")
	public ModelAndView displayName(@RequestParam("firstName") String firstName ) {
	
	// here we can pass the view name directly
		
	ModelAndView modelAndView = new ModelAndView("displayName");
	Date date = new Date();
	List<String> names = new ArrayList<>();
	names.add("Riju");
	names.add("Rishabh");
	names.add("Rashi");
	names.add("Apeksha");
	
	modelAndView.addObject("firstName", firstName);
	modelAndView.addObject("date", date);
	modelAndView.addObject("names", names);
		return modelAndView;
	}
	
}
