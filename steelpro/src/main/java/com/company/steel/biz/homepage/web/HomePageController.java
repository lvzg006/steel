package com.company.steel.biz.homepage.web;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.company.steel.common.web.controller.BaseController;


@Controller

public class HomePageController extends BaseController {
	@RequestMapping("/home")
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		
		log.info("sss");
		log.info("git");
		return mav;
	}


}
