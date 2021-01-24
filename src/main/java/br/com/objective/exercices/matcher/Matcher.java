package br.com.objective.exercices.matcher;

public interface Matcher {

    default boolean isDivisorOf(int value) {
        return value % getDivider() == 0;
    }

    int getDivider();

}
