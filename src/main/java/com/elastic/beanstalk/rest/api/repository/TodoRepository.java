package com.elastic.beanstalk.rest.api.repository;

import com.elastic.beanstalk.rest.api.model.Todo;
import org.springframework.data.repository.CrudRepository;


public interface TodoRepository extends CrudRepository<Todo, Integer> {
}
