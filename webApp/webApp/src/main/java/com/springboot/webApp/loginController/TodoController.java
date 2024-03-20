package com.springboot.webApp.loginController;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springboot.webApp.Entity.Todo;
import com.springboot.webApp.service.TodoService;

@Controller
@SessionAttributes("name")
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
	@GetMapping("Add_todo")
	public String ShowAddTodo() {
		return "addTodo";
	}
	@PostMapping("Add_todo")
	public String AddTodo(@RequestParam String description,@RequestParam LocalDate date,@RequestParam Boolean isdone,ModelMap modelMap) {
//		List<Todo> byusername = todoService.findByusername("Shubham");
		modelMap.addAttribute("description",description);
		modelMap.addAttribute("targetdate",date);
		modelMap.addAttribute("isDone",isdone);
		return "todoList";
	}
}
