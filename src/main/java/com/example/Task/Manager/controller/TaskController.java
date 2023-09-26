package com.example.Task.Manager.controller;

import com.example.Task.Manager.dao.TaskRepo;
import com.example.Task.Manager.model.Task;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@OpenAPIDefinition(
        info = @Info(
                title = "APIs",
                version = "1.0.0",
                description = "APIS for performing CRUD operations on Task Manager",
                contact = @Contact(
                        name = "Nidhi",
                        email = "int.Nidhi.Sanklecha@xpressbees.com"
        )
        )
)
public class TaskController {
    @Autowired
    private TaskRepo repo;

    @PostMapping("/addTask")
    public String saveTask(@RequestBody Task task)
    {
        repo.save(task);
        return "Added new task successfully";
    }

    @GetMapping("/findAllTasks")
    public List<Task> getTasks()
    {
        return repo.findAll();
    }

    @PutMapping("/updateTask")
    public String updateTask(@RequestBody Task edited_task)
    {
        repo.save(edited_task);
        return "Updated the task successfully";
    }

    @DeleteMapping("/delete/{_id}")
    public String deleteTask(@PathVariable ObjectId _id)
    {
        repo.deleteById(_id);
        return "Deleted task successfully";
    }

}
