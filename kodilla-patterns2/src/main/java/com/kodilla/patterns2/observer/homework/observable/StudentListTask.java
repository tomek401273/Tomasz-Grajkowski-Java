package com.kodilla.patterns2.observer.homework.observable;

import com.kodilla.patterns2.observer.homework.observable.Observable;
import com.kodilla.patterns2.observer.homework.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class StudentListTask implements Observable {
    private final List<Observer> observers;
    private final List<String> taskList;
    private final String studentName;

    public StudentListTask(String studentName) {
        this.observers = new ArrayList<>();
        this.taskList = new ArrayList<>();
        this.studentName = studentName;
    }

    public void addTask(String task) {
        taskList.add(task);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: observers) {
            observer.update(this);
        }

    }

    @Override
    public void removeObserver() {
        observers.remove(observers);
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
}
