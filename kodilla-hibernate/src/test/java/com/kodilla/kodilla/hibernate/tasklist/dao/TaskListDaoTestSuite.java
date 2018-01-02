package com.kodilla.kodilla.hibernate.tasklist.dao;

import com.kodilla.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    TaskListDao taskListDao;
    private static final String LISTNAME= "toDoFirst";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, "taskToDoFirstOtherTasks");

        //When
        taskListDao.save(taskList);

        //Then
        String taskListName1= taskList.getListName();
        List<TaskList> checkTaskListName = taskListDao.findByListName(LISTNAME);
        TaskList taskListName2 = checkTaskListName.get(0);
        Assert.assertEquals(taskListName1, taskListName2.getListName());

        //CleanUp
        taskListDao.deleteAll();
    }
}
