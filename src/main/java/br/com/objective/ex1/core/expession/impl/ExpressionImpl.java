package br.com.objective.ex1.core.expession.impl;

import br.com.objective.ex1.core.expession.BaseExpression;
import br.com.objective.ex1.utils.ConstantsExpression;

import static br.com.objective.ex1.utils.ConstantsMatcher.*;

public class ExpressionImpl extends BaseExpression {

    @Override
    public boolean validateExpression(ConstantsExpression expression, int value) {
        switch (expression) {
            case FIRST_EXPRESSION:
                return THREE_MATCHER.getMatcher().isDivisorOf(value) || FIVE_MATCHER.getMatcher().isDivisorOf(value);

            case SECOND_EXPRESSION:
                return THREE_MATCHER.getMatcher().isDivisorOf(value) && FIVE_MATCHER.getMatcher().isDivisorOf(value);

            case THIRD_EXPRESSION:
                return (THREE_MATCHER.getMatcher().isDivisorOf(value) || FIVE_MATCHER.getMatcher().isDivisorOf(value))
                     && SEVEN_MATCHER.getMatcher().isDivisorOf(value);

            default:
                throw new IllegalArgumentException("Expression does not exist");
        }
    }

}
