package org.study;

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
		//this object can contain model and view, model is data object
		ModelAndView modelAndView = new ModelAndView("userFormView");
		User user = new User();
		// now we have user object also so we can use modelAttribute in form
		modelAndView.addObject("user", user);
		return modelAndView;
	}

	@PostMapping("/displayUserInfo")
	// we need to receive object of user, this object is model attribute, form returns model of user
	public ModelAndView displayUserInfo(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView("displayUserInfo");
		System.out.println(user);
		modelAndView.addObject("user", user);
		return modelAndView;
	}

}
