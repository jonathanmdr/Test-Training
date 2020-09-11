package br.com.objective.ex1.utils;

import java.util.function.Predicate;

import static br.com.objective.ex1.utils.ConstantsMatcher.*;

public enum ConstantsExpression {

    FIRST_EXPRESSION(
            (value) -> THREE_MATCHER.getMatcher().isDivisorOf(value) || FIVE_MATCHER.getMatcher().isDivisorOf(value)
    ),
    SECOND_EXPRESSION(
            (value) -> THREE_MATCHER.getMatcher().isDivisorOf(value) && FIVE_MATCHER.getMatcher().isDivisorOf(value)
    ),
    THIRD_EXPRESSION(
            (value) -> (THREE_MATCHER.getMatcher().isDivisorOf(value) || FIVE_MATCHER.getMatcher().isDivisorOf(value))
                     && SEVEN_MATCHER.getMatcher().isDivisorOf(value)
    );

    private Predicate<Integer> predicate;

    ConstantsExpression(Predicate<Integer> predicate) {
        this.predicate = predicate;
    }

    public boolean validate(int value) {
        return this.predicate.test(value);
    }

}
