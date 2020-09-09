package br.com.objective.ex1.service;

import br.com.objective.ex1.core.expession.impl.ExpressionImpl;
import br.com.objective.ex1.service.impl.NumberProcessServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static br.com.objective.ex1.utils.ConstantsExpression.*;

public class NumberProcessServiceImplTest {

    private NumberProcessService numberProcessService;

    @Before
    public void setupTest() {
        this.numberProcessService = new NumberProcessServiceImpl(new ExpressionImpl());
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

}