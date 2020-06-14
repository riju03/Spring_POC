package org.study;

import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.study.model.Person;

// all the request will be handled by controller

@WebServlet("/")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Controller() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Person> staff = new ArrayList<>();
		staff.add(new Person("Riju",24));
		staff.add(new Person("Sumit",27));
		request.setAttribute("staff", staff);
		
		request.getRequestDispatcher("view.jsp").forward(request, response);
	}



}
