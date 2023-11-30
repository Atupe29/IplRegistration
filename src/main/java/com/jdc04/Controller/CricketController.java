package com.jdc04.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jdc04.Service.CricektService;
import com.jdc04.entity.Cricket;

@Controller
public class CricketController {
	@Autowired
	private CricektService cricektService;

	@GetMapping("/")
	public String registerplayer(Model model) {
		Cricket cricket = new Cricket();
		model.addAttribute(cricket);
		return "register";
	}

	@PostMapping("/registerteam")
	public String registerteam(@ModelAttribute("cricket") Cricket cricket) {
		System.out.println(cricket);
		cricektService.registerTeam(cricket);

		return "registerteam";
	}
}
