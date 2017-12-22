package com.kodilla.spring.shape;

import com.kodilla.testing.shape.Square;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class ShapesFactory {
    @Bean
    public Squere createSquere() {
        return new Squere();
    }
    @Bean
    public Shape choosenShape() {
        Shape theShape;
        Random generator = new Random();
        int choosen = generator.nextInt(3);
        if (choosen == 0) {
            theShape = new Triangle();
        } else if (choosen == 1) {
            theShape = new Circle();
        } else {
            theShape = new Squere();
        }
        return theShape;
    }
}
