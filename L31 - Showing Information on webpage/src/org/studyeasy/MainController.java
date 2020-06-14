package org.studyeasy;


import java.util.ArrayList;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import java.util.*;
import org.studyeasy.model.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.studyeasy.DAO.AppDAOImpl;


@Controller
public class MainController {

	@RequestMapping("/")
	public ModelAndView homepage() {
		ModelAndView model = new ModelAndView("home");
		List<User> users = new ArrayList<User>();
		// reading configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/org/studyeasy/DAO/Spring-AppDAOConfig.xml");
		
		AppDAOImpl DAO = context.getBean("DAOBean", AppDAOImpl.class);
		users = DAO.listUsers();
		System.out.println(users);
		return model;
	}
	

}
