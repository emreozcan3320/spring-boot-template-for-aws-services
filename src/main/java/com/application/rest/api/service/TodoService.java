package com.application.rest.api.service;

import com.application.rest.api.model.Todo;
import com.application.rest.api.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TodoService {

	private final TodoRepository todoRepository;

	public Iterable<Todo> getAll() {
		return todoRepository.findAll();
	}

	public Optional<Todo> getById(int id) {
		return todoRepository.findById(id);
	}

	public void save(Todo todo) {
		todoRepository.save(todo);
	}

	public void deleteById(int id) {
		todoRepository.deleteById(id);
	}

}
