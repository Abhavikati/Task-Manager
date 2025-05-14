package com.task_manager.api.task_manager_api.service;

import com.task_manager.api.task_manager_api.entities.Task;
import com.task_manager.api.task_manager_api.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;


    public Task createTask(Task task){

        taskRepository.save(task);
        return task;
    }

    public List<Task> getAllTask(){
        return taskRepository.findAll();

    }

}
