package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Date;

public class ForumUser {
    private final int userId;
    private final String userName;
    private final char gender;
    private final LocalDate dateOfBirth;
    private final int countPublicedPost;

    public ForumUser(final int userId, final String userName, final char gender, final LocalDate dateOfBirth, final int countPublicedPost) {
        this.userId = userId;
        this.userName = userName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.countPublicedPost = countPublicedPost;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getCountPublicedPost() {
        return countPublicedPost;
    }
    public int getAge(){
        LocalDate today = LocalDate.now();
        int yearBirth = getDateOfBirth().getYear();
        int actualYear = today.getYear();
        int age = actualYear -yearBirth;
        return age;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", countPublicedPost=" + countPublicedPost +
                '}';
    }
}
