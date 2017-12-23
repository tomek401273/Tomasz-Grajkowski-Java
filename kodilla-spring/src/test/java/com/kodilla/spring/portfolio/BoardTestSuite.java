package com.kodilla.spring.portfolio;

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
        List<String> toDoList = new ArrayList<>();
        toDoList.add("make Transaction");
        toDoList.add("cook Diner");
        toDoList.add("play game");
        //Then
        System.out.println("toDoList" + board.toDoList.getTasks());
        Assert.assertEquals(toDoList, board.toDoList.getTasks());
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
        System.out.println("inProgressList: "+board.inProgressList.getTasks());
        Assert.assertEquals(inProgressList, board.inProgressList.getTasks());
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
        System.out.println("doneList: "+board.doneList.getTasks());
        Assert.assertEquals(doneList,board.doneList.getTasks());
    }
}
