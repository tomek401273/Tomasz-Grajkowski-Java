package com.kodilla.stream.lambda;

public class ExperssionExecutor {
    public void executeExpression (double a, double b, MathExperssion mathExperssion){
        double result = mathExperssion.calculateExperssion(a, b);
        System.out.println("Result equals: "+result);
    }

}
