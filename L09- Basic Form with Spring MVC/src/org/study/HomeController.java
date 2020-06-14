package org.study;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {

	//RequestMapping annotation is used to map web requests onto specific handler classes and/or handler methods. 
	
	@RequestMapping(value="/",method= RequestMethod.GET)
	public String homepage() {
		return "home";
	}
	@RequestMapping("displayname")
	public String displayName(HttpServletRequest request) {
	String firstName = request.getParameter("firstName");
	request.setAttribute("firstName", firstName);
		
		return "displayName";
	}
	
}
