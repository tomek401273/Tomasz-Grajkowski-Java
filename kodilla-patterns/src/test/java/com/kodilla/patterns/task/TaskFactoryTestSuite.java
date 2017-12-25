package com.kodilla.patterns.task;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void tesFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.ShoppingTask);
        //Then
        Assert.assertEquals(false,shoppingTask.isTaskExecuted());
        Assert.assertEquals("Executing task: Shopping Task", shoppingTask.executeTask());
        Assert.assertEquals("Shopping Task",shoppingTask.getTaskName());
        Assert.assertEquals(true,shoppingTask.isTaskExecuted());

    }
    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //Whem
        Task paintingTask = taskFactory.makeTask(TaskFactory.PaintingTask);
        //Then
        Assert.assertEquals(false,paintingTask.isTaskExecuted());
        Assert.assertEquals("Executing task: Painting Task",paintingTask.executeTask());
        Assert.assertEquals("Painting Task",paintingTask.getTaskName());
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
    }
    @Test
    public void testFactoryDivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task divingTask = taskFactory.makeTask(TaskFactory.DivingTask);
        //Then
        Assert.assertEquals(false, divingTask.isTaskExecuted());
        Assert.assertEquals("Executing task: Diving Task", divingTask.executeTask());
        Assert.assertEquals("Diving Task",divingTask.getTaskName());
        Assert.assertEquals(true,divingTask.isTaskExecuted());
    }
}
