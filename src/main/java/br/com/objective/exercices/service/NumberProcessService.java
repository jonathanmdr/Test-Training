package br.com.objective.exercices.service;

import br.com.objective.exercices.service.exception.InvalidIntervalException;
import br.com.objective.exercices.service.exception.InvalidNumberException;
import br.com.objective.exercices.utils.ConstantsExpression;

public class NumberProcessService {

    public int evaluateNumbersByExpression(ConstantsExpression expression, int initialStepValue, int finishStepValue) {
        if (initialStepValue < 0 || finishStepValue < 0) {
            throw new InvalidNumberException("This number cannot be negative");
        }

        if (finishStepValue < initialStepValue) {
            throw new InvalidIntervalException("The finish step cannot be less than the initial step");
        }

        int sum = 0;

        for (int currentNumber = initialStepValue; currentNumber < finishStepValue; currentNumber++) {
            if (expression.validate(currentNumber)) {
                sum += currentNumber;
            }
        }

        return sum;
    }

}
