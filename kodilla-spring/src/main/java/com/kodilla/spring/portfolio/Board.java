package com.kodilla.spring.portfolio;

public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board() {
    }

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
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

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public void addTaskToDoList(String task) {
        toDoList.addTask(task);
    }

    public void addTaskInProgressList(String task) {
        inProgressList.addTask(task);
    }

    public void addTaskDoneList(String task) {
        doneList.addTask(task);
    }

    public void readToDoList() {
        System.out.println("This is toDoList: " + toDoList.tasks);
    }

    public void readInProgressList() {
        System.out.println("This is inProgressList" + inProgressList.tasks);
    }

    public void readDoneList() {
        System.out.println("This is doneList: " + doneList.tasks);
    }

    //    final TaskList taskList;
//
//    public Board(final TaskList taskList) {
//        this.taskList = taskList;
//    }
//    public void readTask() {
//        System.out.println("This toDoList: "+taskList.tasks);
//        taskList.getAllTask();
//    }

}
