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


        thomas.addTask("java object programing");
        thomas.addTask("simple shop with java and agular");
        thomas.addTask("The best shop with springboot and angular 5 !!!");
        mark.addTask("java object programing");
        mark.addTask("portal like facebook with java and javascript and jquery");
        james.addTask("java object programing");

        Assert.assertEquals(5, superMentor.getTasksCount());
        Assert.assertEquals(1,standardMentor.getTasksCount());
    }
}
