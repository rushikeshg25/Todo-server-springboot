package com.todo.todo_server.service;

import com.todo.todo_server.entity.Todo;

import java.util.List;

public interface TodoService {
    Todo addTodo(Todo todo);

    List<Todo>getTodos();

    Todo updateTodo(Todo todo, Long id);

    Todo getTodoById(Long id);

    void deleteTodo(Long id);

}
