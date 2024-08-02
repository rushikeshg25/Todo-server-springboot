package com.todo.todo_server.controller;


import com.todo.todo_server.entity.Todo;
import com.todo.todo_server.service.TodoImpl;
import com.todo.todo_server.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin("http://localhost:3000")
@RequiredArgsConstructor
@RestController
@RequestMapping("/v1")
public class TodoController {

    private final TodoImpl todoimpl;
    public static  class TodoRequest{
        private String title;
        private String description;
    }

    @GetMapping("/headers")
    public String hello(@RequestHeader Map<String,String> headers){
        headers.forEach((key,value)->{
            System.out.println(key+" "+value);
        });
        return "hello World";
    }

    @PostMapping("/addTodo")
    public ResponseEntity<Todo> createTodo(@RequestBody TodoRequest todoRequest){
        Todo todo=new Todo(123L,todoRequest.title);

        return new ResponseEntity<>(todo, HttpStatus.CREATED);
    }

}
