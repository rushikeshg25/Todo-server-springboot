package com.todo.todo_server.service;

import com.todo.todo_server.entity.Todo;
import com.todo.todo_server.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoImpl implements  TodoService{

    private final TodoRepository todoRepository;

    @Autowired
    public TodoImpl(TodoRepository todoRepository){
        this.todoRepository=todoRepository;
    }

    @Override
    public Todo addTodo(Todo todo) {
        return null;
    }

    @Override
    public List<Todo> getTodos() {
        return List.of();
    }

    @Override
    public Todo updateTodo(Todo todo, Long id) {
        return null;
    }

    @Override
    public Todo getTodoById(Long id) {
        return null;
    }

    @Override
    public void deleteTodo(Long id) {

    }
}
