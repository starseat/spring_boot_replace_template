package spring.boot.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {
	@GetMapping("/myblogmain")
	public void myblogmain(Model model) {	
	}	

	@GetMapping("/footer")
	public void footer(Model model) {		
	}	
	
	@GetMapping("/header")
	public void header(Model model) {		
	}	
	
	@GetMapping("/")
	public String mainIndex(Model model) {
		return "index";
	}	
	
	@GetMapping("/blog/detail")
	public void blogDetail(Model model) {
	}
}
