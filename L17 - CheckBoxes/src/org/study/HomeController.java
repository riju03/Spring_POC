package org.study;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.study.model.*;

@Controller
public class HomeController {

	@GetMapping("/")
	public ModelAndView home() {
		//this object can contain model and view, model is a class which contains the data
		ModelAndView modelAndView = new ModelAndView("userFormView");
		User user = new User();
		Map<String,String>  gender = new HashMap<String,String>();
		gender.put("male", "Male");
		gender.put("female", "Female");
		
		Map<String,String> countryMap = new HashMap<String,String>();
		countryMap.put("India", "India");
		countryMap.put("USA", "The United States");
		countryMap.put("Australia", "Australia");
		countryMap.put("Ireland", "Ireland");
		
		modelAndView.addObject("countryMap", countryMap);
		modelAndView.addObject("gender", gender);
		modelAndView.addObject("user", user);
		return modelAndView;
	}

	@PostMapping("/displayUserInfo")
	/*
	 * we need to receive object of user, this object is model attribute, form returns model of user
	 * @ModelAttribute is optional
	 */
	public ModelAndView displayUserInfo(User user) {
		ModelAndView modelAndView = new ModelAndView("displayUserInfo");
		
		modelAndView.addObject("user", user);
		return modelAndView;
	}

}
