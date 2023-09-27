package com.example.Task.Manager.controller;
import com.example.Task.Manager.model.Task;
import org.bson.types.ObjectId;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "Task-service", url = "http://localhost:8080")
public interface TaskFeignClient {

    @PostMapping("/addTaskExternally")
    String saveTask(@RequestBody Task task);

    @GetMapping("/findAllTasksExternally")
    List<Task> getTasks();

    @PutMapping("/updateTaskExternally")
    String updateTask(@RequestBody Task edited_task);
    @DeleteMapping("/deleteTaskExternally/{_id}")
    String deleteTask(@PathVariable ObjectId _id);
}
