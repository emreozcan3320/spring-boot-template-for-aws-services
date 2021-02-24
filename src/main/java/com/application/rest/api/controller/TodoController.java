package com.application.rest.api.controller;

import com.application.rest.api.model.Todo;
import com.application.rest.api.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Optional;


@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = {"*"})
@RequestMapping("api/v1/todos")
public class TodoController {

	private final TodoService todoService;

	@GetMapping
	public Collection<Todo> getAllTodos() {
		return todoService.getAll();
	}

	@GetMapping("/{id}")
	public Optional<Todo> getTodoById(@PathVariable String id) {
		return todoService.getById(id);
	}

	@PostMapping
	public void saveTodo(@RequestBody Todo todo) {
		todoService.save(todo);
	}

	@DeleteMapping("{id}")
	public void deleteTodo(@PathVariable String id) {
		todoService.deleteById(id);
	}
}

