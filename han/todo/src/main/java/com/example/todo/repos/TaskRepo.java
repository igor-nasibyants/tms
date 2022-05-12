package com.example.todo.repos;

import com.example.todo.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepo extends CrudRepository<Task, Long> {
}
