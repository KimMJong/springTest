package com.kmj.springtest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@Autowired
	private M mDAO;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest request) {
		
		mDAO.getAllShoes(request);
		
		return "index";
	}
	@RequestMapping(value = "/shoes.reg.go", method = RequestMethod.GET)
	public String regShoes() {
		
		return "input";
	}
	@RequestMapping(value = "/shoes.reg.do", method = RequestMethod.POST)
	public String doregShoes(ShoesDTO s, HttpServletRequest request) {
		
		mDAO.regShoes(s, request);
		
		mDAO.getAllShoes(request);
		return "index";
	}
	@RequestMapping(value = "/detail.shoes.go", method = RequestMethod.GET)
	public String detailShoes(ShoesDTO s, HttpServletRequest request) {
		
		mDAO.getShoes(s, request);
		
		return "detail";
	}
	@RequestMapping(value = "/update.shoes.go", method = RequestMethod.GET)
	public String updateShoes(ShoesDTO s, HttpServletRequest request) {
		
		mDAO.getShoes(s, request);
		return "update";
	}
	@RequestMapping(value = "/shoes.update.do", method = RequestMethod.POST)
	public String updateDOShoes(ShoesDTO2 s, HttpServletRequest request) {
		
		mDAO.doUpdate(s, request);
		
		mDAO.getAllShoes(request);
		return "index";
	}
	@RequestMapping(value = "/shoes.delete", method = RequestMethod.GET)
	public String deleteShoes(ShoesDTO s, HttpServletRequest request) {
		
		mDAO.deleteShoes(s);
		
		mDAO.getAllShoes(request);
		return "index";
	}
	
}
