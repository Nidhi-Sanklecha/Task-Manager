package com.example.Task.Manager.dao;

import com.example.Task.Manager.model.Task;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepo extends MongoRepository<Task, ObjectId> {
}
