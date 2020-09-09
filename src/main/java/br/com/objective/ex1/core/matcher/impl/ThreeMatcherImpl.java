package br.com.objective.ex1.core.matcher.impl;

import br.com.objective.ex1.core.matcher.Matcher;

public class ThreeMatcherImpl implements Matcher {

    @Override
    public boolean isDivisorOf(int value) {
        return value % getDivider() == 0;
    }

    @Override
    public int getDivider() {
        return 3;
    }

}
