package com.testcursojava.testpring;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView index(@RequestParam String n) {
		return new ModelAndView("redirect:index2?n="+n);
	}
	
	@RequestMapping(value = "/index2", method = RequestMethod.GET)
	public String index2(HttpServletRequest request,Model model) {
		model.addAttribute("nombre", request.getParameter("n"));
		return "index2";
	}
}
