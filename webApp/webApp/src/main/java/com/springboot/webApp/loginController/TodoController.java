package com.springboot.webApp.loginController;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.webApp.Entity.Todo;
import com.springboot.webApp.service.TodoService;

@Controller
public class TodoController {

	private TodoService todoService;
	
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	@GetMapping("/list-todos")
	public String ListAllTodo(ModelMap modelMap) {
		List<Todo> byusername = todoService.findByusername("Shubham");
		modelMap.addAttribute("todos",byusername);
		return "todoList";
	}
}
