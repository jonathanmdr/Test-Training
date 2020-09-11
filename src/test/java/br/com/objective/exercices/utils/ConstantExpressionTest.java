package br.com.objective.exercices.utils;

import org.junit.Assert;
import org.junit.Test;

import static br.com.objective.exercices.utils.ConstantsExpression.*;

public class ConstantExpressionTest {

    @Test
    public void validateExpression_firstExpressionWithValidNumbers_returningTrue() {
        Assert.assertTrue(FIRST_EXPRESSION.validate(3));
        Assert.assertTrue(FIRST_EXPRESSION.validate(5));
    }

    @Test
    public void validateExpression_firstExpressionWithInvalidNumbers_returningFalse() {
        Assert.assertFalse(FIRST_EXPRESSION.validate(2));
        Assert.assertFalse(FIRST_EXPRESSION.validate(4));
    }

    @Test
    public void validateExpression_secondExpressionWithValidNumbers_returningTrue() {
        Assert.assertTrue(SECOND_EXPRESSION.validate(15));
        Assert.assertTrue(SECOND_EXPRESSION.validate(30));
    }

    @Test
    public void validateExpression_secondExpressionWithInvalidNumbers_returningFalse() {
        Assert.assertFalse(SECOND_EXPRESSION.validate(10));
        Assert.assertFalse(SECOND_EXPRESSION.validate(20));
    }

    @Test
    public void validateExpression_thirdExpressionWithValidNumbers_returningTrue() {
        Assert.assertTrue(THIRD_EXPRESSION.validate(21));
        Assert.assertTrue(THIRD_EXPRESSION.validate(35));
    }

    @Test
    public void validateExpression_thirdExpressionWithInvalidNumbers_returningFalse() {
        Assert.assertFalse(THIRD_EXPRESSION.validate(31));
        Assert.assertFalse(THIRD_EXPRESSION.validate(45));
    }

}
