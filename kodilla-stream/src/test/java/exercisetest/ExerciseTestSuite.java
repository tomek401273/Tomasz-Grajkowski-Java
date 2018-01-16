package exercisetest;

import com.kodilla.stream.lambda.ExperssionExecutor;
import org.junit.Test;

public class ExerciseTestSuite {

    @Test
    public void justTest1() {
                ExperssionExecutor expressionExecutor = new ExperssionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
    }
}
