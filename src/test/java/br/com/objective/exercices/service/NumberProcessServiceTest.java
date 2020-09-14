package br.com.objective.exercices.service;

import br.com.objective.exercices.service.exception.InvalidIntervalException;
import br.com.objective.exercices.service.exception.InvalidNumberException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static br.com.objective.exercices.utils.ConstantsExpression.*;

public class NumberProcessServiceTest {

    private NumberProcessService subject;

    @Before
    public void setup() {
        this.subject = new NumberProcessService();
    }

    @Test
    public void evaluateNumbersByExpression_evaluateNumbersMultipleOfThreeOrFive_sumNumbersMultipleOfThreeOrFive() {
        Assert.assertEquals(233168, subject.evaluateNumbersByExpression(FIRST_EXPRESSION, 1, 1000));
    }

    @Test
    public void evaluateNumbersByExpression_evaluateNumbersMultipleOfThreeAndFive_sumNumbersMultipleOfThreeAndFive() {
        Assert.assertEquals(33165, subject.evaluateNumbersByExpression(SECOND_EXPRESSION, 1, 1000));
    }

    @Test
    public void evaluateNumbersByExpression_evaluateNumbersMultipleOfThreeOrFiveAndSeven_sumNumbersMultipleOfThreeOrFiveAndSeven() {
        Assert.assertEquals(33173, subject.evaluateNumbersByExpression(THIRD_EXPRESSION, 1, 1000));
    }

    @Test(expected = InvalidNumberException.class)
    public void evaluateNumbersByExpression_evaluateInvalidInitialStepNumber_returningException() {
        subject.evaluateNumbersByExpression(THIRD_EXPRESSION, -1, 1000);
    }

    @Test(expected = InvalidNumberException.class)
    public void evaluateNumbersByExpression_evaluateInvalidFinishStepNumber_returningException() {
        subject.evaluateNumbersByExpression(THIRD_EXPRESSION, 0, -1);
    }

    @Test(expected = InvalidIntervalException.class)
    public void evaluateNumbersByExpression_evaluateInvalidInterval_returningException() {
        subject.evaluateNumbersByExpression(THIRD_EXPRESSION, 1000, 1);
    }

}
