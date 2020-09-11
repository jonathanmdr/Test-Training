package br.com.objective.ex1.service;

import br.com.objective.ex1.service.impl.NumberProcessServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static br.com.objective.ex1.utils.ConstantsExpression.*;

public class NumberProcessServiceImplTest {

    private NumberProcessService numberProcessService;

    @Before
    public void setup() {
        this.numberProcessService = new NumberProcessServiceImpl();
    }

    @Test
    public void threeOrFiveNumbers_evaluateNumbersMultipleOfThreeOrFive_sumNumbersMultipleOfThreeOrFive() {
        Assert.assertEquals(233168, numberProcessService.evaluateNumbersByExpression(FIRST_EXPRESSION, 1, 1000));
    }

    @Test
    public void threeAndFiveNumbers_evaluateNumbersMultipleOfThreeAndFive_sumNumbersMultipleOfThreeAndFive() {
        Assert.assertEquals(33165, numberProcessService.evaluateNumbersByExpression(SECOND_EXPRESSION, 1, 1000));
    }

    @Test
    public void threeOrFiveAndSevenNumbers_evaluateNumbersMultipleOfThreeOrFiveAndSeven_sumNumbersMultipleOfThreeOrFiveAndSeven() {
        Assert.assertEquals(33173, numberProcessService.evaluateNumbersByExpression(THIRD_EXPRESSION, 1, 1000));
    }

    @Test
    public void happyNumber_evaluateValidHappyNumber_returningTrue() {
        Assert.assertTrue("This is not a happy number", numberProcessService.evaluateHappyNumber(7));
    }

    @Test
    public void happyNumber_evaluateInvalidHappyNumber_returningFalse() {
        Assert.assertFalse("This is a happy number", numberProcessService.evaluateHappyNumber(5));
    }

    @Test
    public void cousinNumber_evaluateValidCousinNumber_returningTrue() {
        Assert.assertTrue("This is not a cousin number", numberProcessService.evaluateCousinNumber(7));
    }

    @Test
    public void cousinNumber_evaluateInvalidCousinNumber_returningFalse() {
        Assert.assertFalse("This is a cousin number", numberProcessService.evaluateCousinNumber(10));
    }

}
