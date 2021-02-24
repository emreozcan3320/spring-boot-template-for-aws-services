package com.application.rest.api.service;

import com.application.rest.api.model.Todo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TodoService {

	private HashMap<String, Todo> mockDb = new HashMap<>();

	public Collection<Todo> getAll() {
		return mockDb.values();
	}

	public Optional<Todo> getById(String id) {
		return Optional.ofNullable(mockDb.get(id));
	}

	public void save(Todo todo) {
		String id = UUID.randomUUID().toString();
		todo.setId(id);
		mockDb.put(id, todo);
	}

	public void deleteById(String id) {
		mockDb.remove(id);
	}

}
