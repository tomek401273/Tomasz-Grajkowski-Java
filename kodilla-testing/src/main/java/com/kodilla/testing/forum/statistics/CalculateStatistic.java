package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateStatistic {
    //Statistics statistics;
    private double countUsers;
    private double countPosts;
    private double countComments;
    private double avgPostPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

//    public CalculateStatistic(Statistics statistics) {
//        this.statistics = statistics;
//    }


    public CalculateStatistic() {
    }

    public void calculateAdvStatistics(Statistics statistics) {
        this.countUsers = statistics.usersNames().size();
        this.countPosts = statistics.postsCount();
        this.countComments = statistics.commentsCount();
        if (statistics.usersNames().size() != 0) {
            this.avgPostPerUser = statistics.postsCount() / statistics.usersNames().size();
            this.avgCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
        }
        if (statistics.postsCount() != 0) {
            this.avgCommentsPerPost = statistics.commentsCount() / statistics.postsCount();
        }
    }

    public void showStatistics() {
        System.out.println("countUsers: " + countUsers);
        System.out.println("countPost: " + countPosts);
        System.out.println("countComments" + countComments);
        System.out.println("avgPostPerUser" + avgPostPerUser);
        System.out.println("avgCommentsPerUser" + avgCommentsPerUser);
        System.out.println("avgCommentsPerPost" + avgCommentsPerPost);
    }

    public double getCountUsers() {
        return countUsers;
    }

    public double getCountPosts() {
        return countPosts;
    }

    public double getCountComments() {
        return countComments;
    }

    public double getAvgPostPerUser() {
        return avgPostPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }
}
