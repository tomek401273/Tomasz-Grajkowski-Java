package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {

    @Bean
    public TaskList toDoList() {
        List<String> toDoList = new ArrayList<>();
        toDoList.add("make Transaction");
        toDoList.add("cook Diner");
        return new TaskList(toDoList);
    }

    @Bean
    public TaskList inProgress() {
        List<String> inProgress = new ArrayList<>();
        inProgress.add("Coding");
        inProgress.add("Programming");
        return new TaskList(inProgress);
    }

    @Bean
    public TaskList doneList() {
        List<String> doneList = new ArrayList<>();
        doneList.add("relax");
        doneList.add("watch TV");
        return new TaskList(doneList);
    }

    @Bean
    public Board board() {
        return new Board(toDoList(), inProgress(), doneList());
    }
}
