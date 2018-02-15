package com.kodilla.patterns2.observer.forum.observer;

import com.kodilla.patterns2.observer.forum.observable.ForumTopic;

public class ForumUser implements Observer {
    private final String username;
    private int updateCount;

    public ForumUser(String username) {
        this.username = username;
    }

    @Override
    public void update(ForumTopic forumTopic) {
        System.out.println(username + ": New message in topic: " + forumTopic.getName() + "\n" +
                "(count message in this topic: " + forumTopic.getMessage().size() + " messages)");
        updateCount++;
        System.out.println("total new messages: "+ getUpdateCount());
        System.out.println();
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
