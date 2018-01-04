package com.kodilla.kodilla.hibernate.tasklist.dao;

import com.kodilla.kodilla.hibernate.task.Task;
import com.kodilla.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.kodilla.hibernate.task.dao.TaskDao;
import com.kodilla.kodilla.hibernate.tasklist.TaskList;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    TaskListDao taskListDao;

    @Autowired
    TaskDao taskDao;

    private static final String LISTNAME= "toDoFirst";
    private static final String DESCRIPTION ="taskToDoFirstOtherTasks";
    @After
    public void testDelete() {
       List<TaskList> taskListList = taskListDao.findByListName(LISTNAME);
       taskListDao.delete(taskListList);

    }

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        int id = taskList.getId();

        //When
        taskListDao.save(taskList);

        //Then
        String taskListName1= taskList.getListName();
        List<TaskList> checkTaskListName = taskListDao.findByListName(LISTNAME);
        TaskList taskListName2 = checkTaskListName.get(0);
        Assert.assertEquals(taskListName1, taskListName2.getListName());


//        try{
//            Assert.assertEquals(taskListName1, taskListName2.getListName());
//
//        }catch (Exception e) {
//            System.out.println("Excepition: "+e);
//        }
//        finally {
//            //CleanUp
//            taskListDao.delete(taskList);
//        }
    }

    @Test
    public void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(LISTNAME, "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        taskListDao.delete(id);
    }
    @Test
    public void testNamedQueries() {
        //Given
        Task task1 = new Task("Test: Study Hibernate", 3);
        Task task2 = new Task("Test: Practice Named Queries", 6);
        Task task3 = new Task("Test: Study native queries", 7);
        Task task4 = new Task("Test: Makse some tests", 13);

        TaskFinancialDetails tfd1 = new TaskFinancialDetails(new BigDecimal(5), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        TaskFinancialDetails tfd3 = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd4 = new TaskFinancialDetails(new BigDecimal(15), false);

        task1.setTaskFinancialDetails(tfd1);
        task2.setTaskFinancialDetails(tfd2);
        task3.setTaskFinancialDetails(tfd3);
        task4.setTaskFinancialDetails(tfd4);

        TaskList taskList = new TaskList(LISTNAME, "ToDo tasks");
        taskList.getTasks().add(task1);
        taskList.getTasks().add(task2);
        taskList.getTasks().add(task3);
        taskList.getTasks().add(task4);

        task1.setTaskList(taskList);
        task2.setTaskList(taskList);
        task3.setTaskList(taskList);
        task4.setTaskList(taskList);

        taskListDao.save(taskList);
        int id = taskList.getId();

        //When
        List<Task> longTasks = taskDao.retriveLongTasks();
        List<Task> shortTasks = taskDao.retriveShortTasks();
        List<Task> enoughTimeTasks = taskDao.retriveTaskWithEnoughtTime();
        List<Task> dutrationLongerThan = taskDao.retriveTasksWithDurationLongerThan(6);
        //Then
        try {
            Assert.assertEquals(1, longTasks.size());
            Assert.assertEquals(3, shortTasks.size());
            Assert.assertEquals(3, enoughTimeTasks.size());
            Assert.assertEquals(2, dutrationLongerThan.size());
        } finally {
           // CleanUp
            taskListDao.delete(id);

        }
    }


}