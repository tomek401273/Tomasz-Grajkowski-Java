package com.kodilla.patterns2.observer.homework.observer;

import com.kodilla.patterns2.observer.homework.observable.StudentListTask;

public class Mentor implements Observer {
    private final String userName;
    private int taskToEvaluation;

    public Mentor(String userName) {
        this.userName = userName;
        this.taskToEvaluation = 0;
    }

    public void updateCoursantResolvedTask(StudentListTask studentListTask) {
        taskToEvaluation++;
        System.out.println(getUserName() + " student: " + studentListTask.getStudentName()
                + " resolved task. On your taskEvalueateList is: " + taskToEvaluation
                + " task");
    }

    public void acceptTask(StudentListTask studentListTask, String task) {
        taskToEvaluation--;
        studentListTask.getResolvedTask().remove(task);
        System.out.println("Task evaluated. Remain tasks to evaluation: " + actualTaskToEvaluation());
        studentListTask.nofityTaskAccepted(task);
    }

    public void rejectTask(StudentListTask studentListTask, String task) {
        taskToEvaluation--;
        System.out.println("Task evaluated. Remain tasks to evaluation: " + actualTaskToEvaluation());
        studentListTask.notifyTakRejected(task);
    }

    public String actualTaskToEvaluation() {
        return "Total task to evaluation: " + taskToEvaluation;
    }

    public int getTaskToEvaluation() {
        return taskToEvaluation;
    }

    public String getUserName() {
        return userName;
    }
}
