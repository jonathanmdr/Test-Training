package br.com.objective.exercices.service;

import java.util.HashSet;
import java.util.Set;

public class NumberHappyService {

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

}
