package com.kodilla.stream;

import com.kodilla.stream.lambda.ExperssionExecutor;

public class Main2 {
    public static void main(String[] args) {
        ExperssionExecutor expressionExecutor = new ExperssionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
    }
}
