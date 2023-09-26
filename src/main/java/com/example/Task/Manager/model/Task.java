package com.example.Task.Manager.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Tasks")
public class Task {

    @Id
    private ObjectId _id;
    private String title;
    private String description;
    private Date dueDate;
    private String priority;

}
