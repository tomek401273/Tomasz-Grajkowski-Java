package com.kodilla.patterns2.observer.forum.observer;

import com.kodilla.patterns2.observer.forum.observable.ForumTopic;

public interface Observer {
    void update(ForumTopic forumTopic);
}
