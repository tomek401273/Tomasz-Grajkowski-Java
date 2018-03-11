package com.kodilla.patterns2.observer.homework.observable;

import com.kodilla.patterns2.observer.homework.observable.Observable;
import com.kodilla.patterns2.observer.homework.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class StudentListTask implements Observable {
    private final List<Observer> observers;
    private final List<String> taskList;
    private final String studentName;
    private final List<String> resolvedTask;
    private final List<String> acceptedTask;
    private final List<String> taskToDone;

    public StudentListTask(String studentName) {
        this.observers = new ArrayList<>();
        this.taskList = new ArrayList<>();
        this.studentName = studentName;
        this.resolvedTask = new ArrayList<>();
        this.acceptedTask = new ArrayList<>();
        this.taskToDone = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver() {
        observers.remove(observers);
    }

    @Override
    public void notifiyObserverTaskResoved() {
        observers.stream().forEach(x -> x.updateCoursantResolvedTask(this));
    }

    public void addTask(String task) {
        taskList.add(task);
        taskToDone.add(task);
    }

    public void resolveTask(String task) {
        notifiyObserverTaskResoved();
        taskToDone.remove(task);
        resolvedTask.add(task);
        taskActualStatus();
    }

    @Override
    public void nofityTaskAccepted(String task) {
        acceptedTask.add(task);
        resolvedTask.remove(task);
        System.out.println(getStudentName() + " your task is just accepted by mentor");
        taskActualStatus();
    }

    @Override
    public void notifyTakRejected(String task) {
        resolvedTask.remove(task);
        System.out.println(getStudentName() + " you ares idiot your solution are stupid. Correct it very soon hurry!!!");
        taskToDone.add(task);
        taskActualStatus();
    }

    public void taskActualStatus() {
        System.out.println("Student: " + getStudentName() + " your actual status");
        System.out.println("All your task: " + taskList.toString());
        System.out.println("Task accepted: " + acceptedTask.toString());
        System.out.println("Task toDone: " + taskToDone.toString());
        System.out.println("Task resolved: " + resolvedTask.toString());
        System.out.println();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public List<String> getTaskList() {
        return taskList;
    }

    public String getStudentName() {
        return studentName;
    }

    public List<String> getResolvedTask() {
        return resolvedTask;
    }

    public List<String> getAcceptedTask() {
        return acceptedTask;
    }

    public List<String> getTaskToDone() {
        return taskToDone;
    }


}
