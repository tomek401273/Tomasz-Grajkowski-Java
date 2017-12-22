package com.kodilla.spring;

import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import com.kodilla.spring.shape.Squere;
import com.kodilla.spring.shape.Triangle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRunnerTestSuite {
    @Test
    public void testCircleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        //Shape shape = context.getBean(Circle.class);
        Shape shape = (Shape) context.getBean("circle");
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("This is a circle.", name);
    }

    @Test
    public void testTriangleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        // Shape shape = context.getBean(Triangle.class);
        Shape shape = (Shape) context.getBean("triangle");
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("This is a triangle.", name);
    }

    @Test
    public void testSquereLoadedIntoContiner() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        // Shape shape = context.getBean(Squere.class);
        Shape shape = (Shape) context.getBean("createSquere");
        //When
        String name = shape.getShapeName();
        //Assert
        Assert.assertEquals("This is a square.", name);
    }

    @Test
    public void testShapeLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean("choosenShape");
        //When
        String name = shape.getShapeName();
        //Then
        System.out.println("Choosen shape says: " + name);
    }
}