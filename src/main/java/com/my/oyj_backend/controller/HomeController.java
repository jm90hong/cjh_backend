package com.my.oyj_backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	
	
	
	
	
	
	@GetMapping("getUser/{code}")
	public String getUser(
				@PathVariable(value="code") String userCode,
				Model model
			) {
		
		
		String id = "hello1234";
		String nick = "코딩1324";
		String tel = "01099361422"; 
		
		
		model.addAttribute("user_id",id);
		model.addAttribute("user_nick",nick);
		model.addAttribute("user_tel",tel);
		
		
		return "detail-user";
	}
	
	
	@PostMapping("saveUser")
	@ResponseBody
	public String saveUser(
				@RequestParam(value="uid",defaultValue="") String id,
				@RequestParam(value="upw") String pw
			) {
		
		
		System.out.println(id);
		
		return "ok";
	}
	
	
	
	@GetMapping("")
	@ResponseBody
	public String home() {
		
		
		return "ok";	
	}
	
}
