package com.kodilla.patterns2.observer.forum.observable;

import com.kodilla.patterns2.observer.forum.observer.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void notifyObserver();
    void removeObserver(Observer observer);
}
