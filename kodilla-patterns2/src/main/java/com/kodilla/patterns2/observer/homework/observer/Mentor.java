package com.kodilla.patterns2.observer.homework.observer;

import com.kodilla.patterns2.observer.homework.observable.StudentListTask;

public class Mentor implements Observer {
    private final String userName;
    private int tasksCount;

    public Mentor(String userName) {
        this.userName = userName;
        this.tasksCount = 0;
    }

    @Override
    public void update(StudentListTask studentListTask) {
        System.out.println(userName+": New message from student: " +studentListTask.getStudentName());
        System.out.println("Count tasks from this student: "+ studentListTask.getTaskList().size());
        tasksCount++;
        System.out.println("total tasks in your list: "+tasksCount);
        System.out.println();
    }

    public String getUserName() {
        return userName;
    }

    public int getTasksCount() {
        return tasksCount;
    }
}
