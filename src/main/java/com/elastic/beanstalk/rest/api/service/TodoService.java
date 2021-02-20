package com.elastic.beanstalk.rest.api.service;

import com.elastic.beanstalk.rest.api.model.Todo;
import com.elastic.beanstalk.rest.api.repository.TodoRepository;
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
