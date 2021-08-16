package com.mvcSpringHomeController;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvcSpringModel.User;
@Controller
public class contactController {
	
	
	@ModelAttribute
	public String commonMethodModel(Model model) {
		model.addAttribute("common","this is a common for all and calling commonMethodModel");
		return "";
	}
	
	@RequestMapping("/contact")
	public String showForm(Model model)
	{
		System.out.println("this is a contac form");
		model.addAttribute("Header","Registration form");
		return "contact";
	}
	@RequestMapping(path="/abc", method=RequestMethod.POST)
	public String handlerForm(@RequestParam("name")  String n, @RequestParam("email")String em, @RequestParam("password") String  pas, Model model)// we can 
	{
		/*
		System.out.println("this is a name="+n);
		System.out.println("this is a email="+em);
		System.out.println("this is a email="+pas);
		*/
		model.addAttribute("name",n);
		model.addAttribute("email",em);
		model.addAttribute("password",pas);
		
		User user=new User();
		user.setName(n);
		user.setEmail(em);
		user.setPassword(pas);
		model.addAttribute("User",user);
		System.out.println("this is a data="+user);
		return "success";
	}
	
	@RequestMapping(path="/abc1", method=RequestMethod.POST)
	public String modelHandler(@ModelAttribute User user, Model model)//here User is a class name 
	{
		
		System.out.println("this is a data="+user);
		return "modelAndView";
		
	}
	
	

}
