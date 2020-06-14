package org.studyeasy;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.studyeasy.model.User;

@Controller
public class MainController {
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("userFormView");
		User user = new User();
		Map<String,String> genderMap = new HashMap<String, String>();
		genderMap.put("male", "Male");
		genderMap.put("female", "Female");
		
		Map<String,String> countryMap = new HashMap<String, String>();
		countryMap.put("India", "India");
		countryMap.put("USA", "The United states");
		countryMap.put("Ireland", "Ireland");
		countryMap.put("Thailand", "Thailand");
		
		modelAndView.addObject("countryMap", countryMap);
		modelAndView.addObject("genderMap",genderMap);
		modelAndView.addObject("user",user);
		return modelAndView;
	}
	
	@PostMapping("/displayUserInfo")
	public ModelAndView displayUserInfo(@Valid User user, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView("displayUserInfo");
		modelAndView.addObject("user",user);
		if(result.hasErrors()) {
			ModelAndView repopulatingModelAndView = new ModelAndView("userFormView", "user", user);
			
			Map<String,String> genderMap = new HashMap<String, String>();
			genderMap.put("male", "Male");
			genderMap.put("female", "Female");
			
			Map<String,String> countryMap = new HashMap<String, String>();
			countryMap.put("India", "India");
			countryMap.put("USA", "The United states");
			countryMap.put("Ireland", "Ireland");
			countryMap.put("Thailand", "Thailand");
			
			repopulatingModelAndView.addObject("countryMap", countryMap);
			repopulatingModelAndView.addObject("genderMap",genderMap);
			repopulatingModelAndView.addObject("user",user);
			System.out.println("Has Errors!!");
			return repopulatingModelAndView;
		
		}else {
			System.out.println("All good!!");
			return modelAndView;
		}
		
		
	}
	


}
