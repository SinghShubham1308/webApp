package com.springboot.webApp.loginController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.webApp.service.Authentitcation;

@Controller
public class LoginController {
	private Authentitcation authentitcation;
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	/// login => com.springboot.webApp.LoginController => loginJsp.jsp

	// http://localhost:8080/login?name=Ranga
	// Model
	@GetMapping("/login")
	public String login(@RequestParam(required = false) String name, ModelMap model) {
		if (name != null) {
			model.put("name", name);
			System.out.println("Name: " + name);
		}
		logger.debug("[LoginController][login] RequestParam param name is " + name);
		return "loginJsp";
	}

	@PostMapping("/login")
	public String loginsuccess(@RequestParam String username, @RequestParam String password, ModelMap modelMap) {
		if (authentitcation.authenticate(username, password)) {
			modelMap.put("username", username);
//			modelMap.put("passsword", password);
			return "loginProcess";
		}
		modelMap.put("errorMessage","Invalid Credentials");
		return "loginJsp";
	}

	public LoginController(Authentitcation authentitcation) {
		super();
		this.authentitcation = authentitcation;
	}

}
