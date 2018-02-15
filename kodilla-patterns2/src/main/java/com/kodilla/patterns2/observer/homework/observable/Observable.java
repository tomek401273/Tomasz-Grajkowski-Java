package com.kodilla.patterns2.observer.homework.observable;

import com.kodilla.patterns2.observer.homework.observer.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void notifyObserver();
    void removeObserver();
}
