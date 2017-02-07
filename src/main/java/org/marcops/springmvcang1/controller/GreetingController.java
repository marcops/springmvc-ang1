package org.marcops.springmvcang1.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {

	@RequestMapping("/greeting")
	public String greeting(Principal principal, Model model) {
		model.addAttribute("name", principal.getName());
		return "greeting";
	}

}