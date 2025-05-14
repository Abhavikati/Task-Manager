package com.task_manager.api.task_manager_api.controller;


import com.task_manager.api.task_manager_api.entities.Task;
import com.task_manager.api.task_manager_api.service.TaskService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class TaskController {

    private final TaskService taskService;

    // Create a new task
    @PostMapping("/task")
    public Task createTask(@Valid @RequestBody Task task) {

        return taskService.createTask(task);
    }

    // get all tasks
    @GetMapping("/task")
    public List<Task> getAllTask() {
        return taskService.getAllTask();
    }

//    //get a specific task by ID
//    @GetMapping("/task/{taskId}")
//    public Task getTask(@PathVariable ("taskId") String taskId) {
//        return taskService.createTask(task);
//    }
//
//    //get specific task by priority
//
//    //get specific task by status


}

