package br.com.objective.ex1.core.expression;

import br.com.objective.ex1.core.expession.impl.ExpressionImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static br.com.objective.ex1.utils.ConstantsExpression.*;

public class ExpressionImplTest {

    private ExpressionImpl expressions;

    @Before
    public void setup() {
        this.expressions = new ExpressionImpl();
    }

    @Test
    public void validateExpression_firstExpressionWithValidNumbers_returningTrue() {
        Assert.assertTrue(expressions.validateExpression(FIRST_EXPRESSION, 3));
        Assert.assertTrue(expressions.validateExpression(FIRST_EXPRESSION, 5));
    }

    @Test
    public void validateExpression_firstExpressionWithInvalidNumbers_returningFalse() {
        Assert.assertFalse(expressions.validateExpression(FIRST_EXPRESSION, 2));
        Assert.assertFalse(expressions.validateExpression(FIRST_EXPRESSION, 4));
    }

    @Test
    public void validateExpression_secondExpressionWithValidNumbers_returningTrue() {
        Assert.assertTrue(expressions.validateExpression(SECOND_EXPRESSION, 15));
        Assert.assertTrue(expressions.validateExpression(SECOND_EXPRESSION, 30));
    }

    @Test
    public void validateExpression_secondExpressionWithInvalidNumbers_returningFalse() {
        Assert.assertFalse(expressions.validateExpression(SECOND_EXPRESSION, 10));
        Assert.assertFalse(expressions.validateExpression(SECOND_EXPRESSION, 20));
    }

    @Test
    public void validateExpression_thirdExpressionWithValidNumbers_returningTrue() {
        Assert.assertTrue(expressions.validateExpression(THIRD_EXPRESSION, 21));
        Assert.assertTrue(expressions.validateExpression(THIRD_EXPRESSION, 35));
    }

    @Test
    public void validateExpression_thirdExpressionWithInvalidNumbers_returningFalse() {
        Assert.assertFalse(expressions.validateExpression(THIRD_EXPRESSION, 31));
        Assert.assertFalse(expressions.validateExpression(THIRD_EXPRESSION, 45));
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateExpression_invalidExpression_returningIllegalArgumentException() {
        expressions.validateExpression(DEFAULT_EXPRESSION, 0);
    }

}
