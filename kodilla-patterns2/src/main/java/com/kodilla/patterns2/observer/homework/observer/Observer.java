package com.kodilla.patterns2.observer.homework.observer;

import com.kodilla.patterns2.observer.homework.observable.StudentListTask;

public interface Observer {
    void update(StudentListTask studentListTask);
}
