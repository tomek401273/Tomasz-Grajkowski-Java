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
    @Autowired
    @Qualifier("toDoList")
    TaskList toDoList;

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList getToDoList() {
        List<String> toDoList = new ArrayList<>();
        toDoList.add("make Transaction");
        toDoList.add("cook Diner");
        return new TaskList(toDoList);
    }

    @Autowired
    @Qualifier("inProgressList")
    TaskList inProgressList;

    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList getInProgressList() {
        List<String> inProgressList = new ArrayList<>();
        inProgressList.add("Coding");
        inProgressList.add("Programming");
        return new TaskList(inProgressList);
    }

    @Autowired
    @Qualifier("doneList")
    TaskList doneList;

    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList getDoneList() {
        List<String> doneList = new ArrayList<>();
        doneList.add("relax");
        doneList.add("watch TV");
        return new TaskList(doneList);
    }

    @Bean
    public Board getBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }


}
