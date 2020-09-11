package br.com.objective.exercices.matcher.impl;

import br.com.objective.exercices.matcher.Matcher;

public class SevenMatcherImpl implements Matcher {

    @Override
    public boolean isDivisorOf(int value) {
        return value % getDivider() == 0;
    }

    @Override
    public int getDivider() {
        return 7;
    }

}
