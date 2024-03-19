package com.springboot.webApp.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.webApp.Entity.Todo;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	static {
		todos.add(new Todo(1, "in28minutes", "Learn AWS", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(2, "in28minutes", "Learn DevOps", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(3, "in28minutes", "Learn Full Stack Development", LocalDate.now().plusYears(3), false));
	}
	
	public List<Todo> findByusername(String userName){
		return todos;
	}
}
