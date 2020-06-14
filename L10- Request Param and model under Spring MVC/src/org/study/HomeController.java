package org.study;


import org.springframework.ui.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

	//RequestMapping annotation is used to map web requests onto specific handler classes and/or handler methods. 
	
	@RequestMapping(value="/",method= RequestMethod.GET)
	public String homepage() {
		return "home";
	}
	@RequestMapping("displayname")
	public String displayName(@RequestParam("firstName") String firstName , Model model) {
	/*
	 *  here we are doing the same thing taking request parameter and putting it in variable firstName
	 *  model object help us to contain data
	 */
	 model.addAttribute("firstName", firstName);
		
		return "displayName";
	}
	
}
