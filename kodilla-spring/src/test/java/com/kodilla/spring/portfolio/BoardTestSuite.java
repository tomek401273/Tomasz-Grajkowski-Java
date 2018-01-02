package com.kodilla.spring.portfolio;

import javafx.concurrent.Task;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class BoardTestSuite {
    @Test
    public void testToDoList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        Board board = context.getBean(Board.class);
        //When
        board.toDoList.addTask("play game");

        List<String> toDoList2 = new ArrayList<>();
        toDoList2.add("make Transaction");
        toDoList2.add("cook Diner");
        toDoList2.add("play game");

        //Then
        System.out.println("toDoList" + context.getBean("toDoList", TaskList.class).getTasks());
        Assert.assertEquals(toDoList2, context.getBean("toDoList", TaskList.class).getTasks());
    }

    @Test
    public void testInProgressList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.inProgressList.addTask("cleaning");
        List<String> inProgressList = new ArrayList<>();
        inProgressList.add("Coding");
        inProgressList.add("Programming");
        inProgressList.add("cleaning");
        //Then
        System.out.println("inProgressList: " + context.getBean("inProgressList",TaskList.class).getTasks());
        Assert.assertEquals(inProgressList, context.getBean("inProgressList",TaskList.class).getTasks());
    }

    @Test
    public void testDoneList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.doneList.addTask("lerning java");
        List<String> doneList = new ArrayList<>();
        doneList.add("relax");
        doneList.add("watch TV");
        doneList.add("lerning java");

        //Then
        System.out.println("doneList: " + context.getBean("doneList",TaskList.class).getTasks());
        Assert.assertEquals(doneList, context.getBean("doneList",TaskList.class).getTasks());
    }
}
