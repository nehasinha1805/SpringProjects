package practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import practice.bean.Welcome;

@RestController
public class WelcomeController {

	private static final String WELCOME_MSG = "Welcome Mr./Mrs. %s!";
	
	@GetMapping("/welcome/user")
	public Welcome welcomeUser(@RequestParam(name = "name", required = false, defaultValue = "Java Fan") String name) {
		return new Welcome(String.format(WELCOME_MSG, name));
	}
	
}
