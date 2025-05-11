package com.task_manager.api.task_manager_api.repository;

import com.task_manager.api.task_manager_api.entities.Status;
import com.task_manager.api.task_manager_api.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(Status status);
}
