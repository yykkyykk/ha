package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController{
@RequestMapping("hello")
	public ModelAndView handleRequest() throws Exception {

		 ModelAndView modelView = new ModelAndView();
	        //������ request.setAttribute()
	        modelView.addObject("name","����");
	        modelView.setViewName("/index");
		return modelView;
	}

}
