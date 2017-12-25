package com.kodilla.patterns.task;

public class DivingTask implements Task {
    final String taskName;
    final String where;
    final String using;
    private boolean doneTask = false;

    public DivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        doneTask =true;
        return "Executing task: "+taskName;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return doneTask;
    }
}
