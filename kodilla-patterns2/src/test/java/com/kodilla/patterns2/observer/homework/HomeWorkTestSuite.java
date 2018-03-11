package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.homework.observable.JamesStudent;
import com.kodilla.patterns2.observer.homework.observable.MarkStudent;
import com.kodilla.patterns2.observer.homework.observable.StudentListTask;
import com.kodilla.patterns2.observer.homework.observable.ThomasStudent;
import com.kodilla.patterns2.observer.homework.observer.Mentor;
import org.junit.Assert;
import org.junit.Test;

public class HomeWorkTestSuite {
    @Test
    public void simpleTest() {
        Mentor superMentor = new Mentor("superMentor");
        Mentor standardMentor = new Mentor("standardMentor");

        ThomasStudent thomas = new ThomasStudent();
        MarkStudent mark = new MarkStudent();
        JamesStudent james = new JamesStudent();

        thomas.registerObserver(superMentor);
        mark.registerObserver(superMentor);
        james.registerObserver(standardMentor);

        String thomasTask1 = "java object programing";
        String thomasTask2 = "simple shop with java and agular";
        String thomasTask3 = "The best shop with springboot and angular 5 !!!";

        String markTask1 = "java object programing";
        String markTask2 = "portal like facebook with java and javascript and jquery";
        String jamesTask1 = "java object programing";

        thomas.addTask(thomasTask1);
        thomas.addTask(thomasTask2);
        thomas.addTask(thomasTask3);
        mark.addTask(markTask1);
        mark.addTask(markTask2);
        james.addTask(jamesTask1);

        thomas.resolveTask(thomasTask3);
        thomas.resolveTask(thomasTask1);
        thomas.resolveTask(thomasTask2);
        mark.resolveTask(markTask2);
        james.resolveTask(jamesTask1);
        System.out.println();

        superMentor.acceptTask(thomas,thomasTask3);
        superMentor.acceptTask(mark, markTask2);
        standardMentor.rejectTask(james, jamesTask1);


        Assert.assertEquals(2, superMentor.getTaskToEvaluation());
        Assert.assertEquals(0, standardMentor.getTaskToEvaluation());

        Assert.assertEquals(0, thomas.getTaskToDone().size());
        Assert.assertEquals(1,thomas.getAcceptedTask().size());
        Assert.assertEquals(2, thomas.getResolvedTask().size());
        Assert.assertEquals(3,thomas.getTaskList().size());

        Assert.assertEquals(1, mark.getTaskToDone().size());
        Assert.assertEquals(1,mark.getAcceptedTask().size());
        Assert.assertEquals(0, mark.getResolvedTask().size());
        Assert.assertEquals(2,mark.getTaskList().size());

        Assert.assertEquals(1, james.getTaskToDone().size());
        Assert.assertEquals(0,james.getAcceptedTask().size());
        Assert.assertEquals(0, james.getResolvedTask().size());
        Assert.assertEquals(1,james.getTaskList().size());
    }
}
