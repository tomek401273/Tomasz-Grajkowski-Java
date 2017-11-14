package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifiler;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module seven - stream !!!");

//        SaySomething saySomething = new SaySomething();
//        saySomething.say();
////////////////////////////////////////////////////////////////////////////////////////////////////////
//        Procesor procesor = new Procesor();
//        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
//        procesor.execute(executeSaySomething);
////////////////////////////////////////////////////////////////////////////////////////////////////////
//        Procesor procesor = new Procesor();
//        Executor codeToExecute = () -> System.out.println("This is example text. z lambdy ");
//        procesor.execute(codeToExecute);

        ExperssionExecutor expressionExecutor = new ExperssionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("Poem Beautifiler");
        PoemBeautifiler poemBeautifiler = new PoemBeautifiler();

        poemBeautifiler.beautify("Computer", (a) -> a.toUpperCase());
        poemBeautifiler.beautify("lubie placki", (b) -> b.toUpperCase()+" "+b.toLowerCase()+" "+b.toUpperCase());
        poemBeautifiler.beautify("Mouse", (c) -> "ABC"+ c +"ABC");
        poemBeautifiler.beautify("ABC", (d) -> d.substring(d.length()-1)+d.substring(d.length()-2)+d.substring(d.length()-3));

    }
}
