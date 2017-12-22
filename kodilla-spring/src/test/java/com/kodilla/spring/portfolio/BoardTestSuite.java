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
        board.addTaskToDoList("play game");
        board.readToDoList();
        List<String> toDoList = new ArrayList<>();
        toDoList.add("make Transaction");
        toDoList.add("cook Diner");
        toDoList.add("play game");
        //Then
        Assert.assertEquals(toDoList, board.getToDoList().tasks);
    }
    @Test
    public void testInProgressList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.addTaskInProgressList("cleaning");
        board.readInProgressList();
        //When
        List<String> inProgressList = new ArrayList<>();
        inProgressList.add("Coding");
        inProgressList.add("Programming");
        inProgressList.add("cleaning");
        //Then
        Assert.assertEquals(inProgressList, board.getInProgressList().tasks);
    }

    @Test
    public void testDoneList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.addTaskDoneList("lerning java");
        board.readDoneList();
        //When
        List<String> doneList = new ArrayList<>();
        doneList.add("relax");
        doneList.add("watch TV");
        doneList.add("lerning java");
        //Then
        Assert.assertEquals(doneList,board.getDoneList().tasks);
    }
}
