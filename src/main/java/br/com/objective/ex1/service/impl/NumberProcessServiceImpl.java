package br.com.objective.ex1.service.impl;

import br.com.objective.ex1.core.expession.impl.ExpressionImpl;
import br.com.objective.ex1.service.NumberProcessService;
import br.com.objective.ex1.utils.ConstantsExpression;

public class NumberProcessServiceImpl implements NumberProcessService {

    private final ExpressionImpl expressions;

    public NumberProcessServiceImpl(ExpressionImpl expressions) {
        this.expressions = expressions;
    }

    @Override
    public int evaluateNumbersByExpression(ConstantsExpression expression, int initialStepValue, int finishStepValue) {
        int sum = 0;

        for (int currentNumber = initialStepValue; currentNumber < finishStepValue; currentNumber++) {
            if (expressions.validateExpression(expression, currentNumber)) {
                sum += currentNumber;
            }
        }

        return sum;
    }

}
