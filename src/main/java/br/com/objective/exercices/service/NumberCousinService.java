package br.com.objective.exercices.service;

import br.com.objective.exercices.service.exception.InvalidNumberException;

public class NumberCousinService {

    public boolean evaluateCousinNumber(int number) {
        if (number < 0) {
            throw new InvalidNumberException("This number cannot be negative!");
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}
