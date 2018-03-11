package com.kodilla.exception.io.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int id;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int countOfPosts;

    public ForumUser(final int id, final String userName, final char sex, final LocalDate dateOfBirth, final int countOfPosts) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.countOfPosts = countOfPosts;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getCountOfPosts() {
        return countOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPosts=" + countOfPosts +
                '}';
    }



}
