package com.kodilla.patterns.task;

public class TaskFactory {
    public static final String ShoppingTask = "ShoppingTask";
    public static final String PaintingTask = "PaintingTask";
    public static final String DivingTask = "DivingTask";

    public final Task makeTask (final String taskClass) {
        switch (taskClass) {
            case ShoppingTask:
                return new ShoppingTask("Shopping Task", "butter",100);
            case PaintingTask:
                return new PaintingTask("Painting Task","black", "house");
            case DivingTask:
                return new DivingTask("Diving Task", "USA","fins");
            default:
                return null;
        }
    }


}
