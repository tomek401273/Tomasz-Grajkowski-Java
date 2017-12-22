package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    final List<String> tasks;

    public TaskList(final List<String> task) {
        this.tasks= task;
    }

    public List<String> getTasks() {
        return tasks;
    }
    public void getAllTask() {
        for (String task: tasks){
            System.out.println(task);
        }
    }
    public void addTask(String task) {
        tasks.add(task);
    }
    public void nameTaskList(){

    }
}
