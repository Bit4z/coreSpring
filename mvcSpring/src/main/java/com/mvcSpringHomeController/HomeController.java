package com.mvcSpringHomeController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model)
	{
	model.addAttribute("name","Ziyaulhaq Khan");
	model.addAttribute("price",1200);
	List<String> friends=new ArrayList<String>();
	friends.add("shivang");
	friends.add("pooja");
	friends.add("ramzan");
	friends.add("updesh");
	model.addAttribute("f",friends);
		
		System.out.println("Home url is running...");
		return "index";
	}
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("abt url is running...");
		return "about";
	}
	
	
	@RequestMapping("/help")
	
	//ModelAndView controller
	public ModelAndView help()
	{ //creating mdel and view object
		ModelAndView modelandview=new ModelAndView();
		//setting the data
		modelandview.addObject("name","Faiz Khan");
		modelandview.addObject("roll",172400191);
		LocalDateTime now=LocalDateTime.now();
		modelandview.addObject("time",now);
		//setting the view name
		modelandview.setViewName("help");
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(50);
		list.add(89);
		list.add(55);
		list.add(67);
		modelandview.addObject("marks",list);
		System.out.println("This is help Controller...");
		return modelandview;
	}
}
