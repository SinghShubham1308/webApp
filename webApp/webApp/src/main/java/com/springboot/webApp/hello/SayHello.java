package com.springboot.webApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHello {

	@GetMapping("/hello")
	@ResponseBody
	public String sayHello() {
		return "What are you learning";
	}
	@GetMapping("/hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("<html lang=\"en\">");
		stringBuffer.append("<head>");
		stringBuffer.append("<title>Hello HTML</title>");
		stringBuffer.append("</head>");
		stringBuffer.append("<body>");
		stringBuffer.append("<h1>Hello, HTML!</h1>");
		stringBuffer.append("</body>");
		stringBuffer.append("</html>");
		return stringBuffer.toString();
	}
	@GetMapping("/helloJSP")

	public String sayHelloJsp() {
		return "SayHelloJSP";
	}
}
