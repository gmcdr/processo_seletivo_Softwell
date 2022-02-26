package com.softwell.soft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.softwell.soft.model.Client;
import com.softwell.soft.service.ServiceClient;

@Controller
public class ClientController {
	
	@Autowired
	private ServiceClient service;;
	
	@GetMapping("/")
	public ModelAndView index(Client client) {
		ModelAndView  mv = new ModelAndView();
		mv.setViewName("home/index");
		mv.addObject("salvar", new Client());
		return mv;
	}
	
	@PostMapping("/")
	public ModelAndView enviar(Client client) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("success/successUser");
		service.salvarClient(client);
		return mv;	
	}
	
}
