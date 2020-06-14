package org.studyeasy;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {

	@RequestMapping("/")
	public ModelAndView homepage() {
		ModelAndView model = new ModelAndView("home");
		return model;
	}
	

}
