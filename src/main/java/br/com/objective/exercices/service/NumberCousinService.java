package br.com.objective.exercices.service;

public class NumberCousinService {

    public boolean evaluateCousinNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}
