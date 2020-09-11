package br.com.objective.exercices.service;

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
    public void threeOrFiveNumbers_evaluateNumbersMultipleOfThreeOrFive_sumNumbersMultipleOfThreeOrFive() {
        Assert.assertEquals(233168, subject.evaluateNumbersByExpression(FIRST_EXPRESSION, 1, 1000));
    }

    @Test
    public void threeAndFiveNumbers_evaluateNumbersMultipleOfThreeAndFive_sumNumbersMultipleOfThreeAndFive() {
        Assert.assertEquals(33165, subject.evaluateNumbersByExpression(SECOND_EXPRESSION, 1, 1000));
    }

    @Test
    public void threeOrFiveAndSevenNumbers_evaluateNumbersMultipleOfThreeOrFiveAndSeven_sumNumbersMultipleOfThreeOrFiveAndSeven() {
        Assert.assertEquals(33173, subject.evaluateNumbersByExpression(THIRD_EXPRESSION, 1, 1000));
    }

}
