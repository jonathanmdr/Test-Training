package br.com.objective.ex1.matcher.impl;

import br.com.objective.ex1.matcher.Matcher;

public class FiveMatcherImpl implements Matcher {

    @Override
    public boolean isDivisorOf(int value) {
        return value % getDivider() == 0;
    }

    @Override
    public int getDivider() {
        return 5;
    }

}
