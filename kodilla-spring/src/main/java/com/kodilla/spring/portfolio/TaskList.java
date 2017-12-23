package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<String> tasks;

    public TaskList( List<String> task) {
        this.tasks= task;
    }


    public List<String> getTasks() {
        return tasks;
    }

    public boolean addTask(String task) {
        tasks.add(task);
        return true;
    }
}
