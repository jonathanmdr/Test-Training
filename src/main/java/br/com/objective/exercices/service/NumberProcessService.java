package br.com.objective.exercices.service;

import br.com.objective.exercices.utils.ConstantsExpression;

public class NumberProcessService {

    public int evaluateNumbersByExpression(ConstantsExpression expression, int initialStepValue, int finishStepValue) {
        int sum = 0;

        for (int currentNumber = initialStepValue; currentNumber < finishStepValue; currentNumber++) {
            if (expression.validate(currentNumber)) {
                sum += currentNumber;
            }
        }

        return sum;
    }

}
