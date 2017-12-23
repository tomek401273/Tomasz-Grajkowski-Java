package com.kodilla.spring.portfolio;

import sun.reflect.generics.scope.Scope;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public void setToDoList(TaskList toDoList) {
        this.toDoList = toDoList;
    }

    public void setInProgressList(TaskList inProgressList) {
        this.inProgressList = inProgressList;
    }

    public void setDoneList(TaskList doneList) {
        this.doneList = doneList;
    }

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }
    public void addTask2(String task) {

    }

    public void addElementToDoList(String element){
        List<String> temp = new ArrayList<>();
        temp.add(element);
        TaskList taskList = new TaskList(temp);
        toDoList = taskList;
    }
}
