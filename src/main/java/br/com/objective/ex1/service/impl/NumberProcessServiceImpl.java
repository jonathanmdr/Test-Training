package br.com.objective.ex1.service.impl;

import br.com.objective.ex1.service.NumberProcessService;
import br.com.objective.ex1.utils.ConstantsExpression;

import java.util.HashSet;
import java.util.Set;

public class NumberProcessServiceImpl implements NumberProcessService {

    @Override
    public int evaluateNumbersByExpression(ConstantsExpression expression, int initialStepValue, int finishStepValue) {
        int sum = 0;

        for (int currentNumber = initialStepValue; currentNumber < finishStepValue; currentNumber++) {
            if (expression.validate(currentNumber)) {
                sum += currentNumber;
            }
        }

        return sum;
    }

    @Override
    public boolean evaluateHappyNumber(int number) {
        return isHappy(number, new HashSet<>());
    }

    private boolean isHappy(int number, Set<Integer> numbersSoFar) {
        int next = calculateNextNumber(number);

        if (next == 1) {
            return true;
        }

        if (!numbersSoFar.add(next)) {
            return false;
        }

        return isHappy(next, numbersSoFar);
    }

    private int calculateNextNumber(int number) {
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit;
            number = (number - digit) / 10;
        }

        return sum;
    }

    @Override
    public boolean evaluateCousinNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}
