package com.application.rest.api.repository;

import com.application.rest.api.model.Todo;
import org.springframework.data.repository.CrudRepository;


public interface TodoRepository extends CrudRepository<Todo, Integer> {
}
