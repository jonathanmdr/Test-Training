package br.com.objective.exercices.utils;

import br.com.objective.exercices.matcher.Matcher;
import br.com.objective.exercices.matcher.impl.FiveMatcherImpl;
import br.com.objective.exercices.matcher.impl.SevenMatcherImpl;
import br.com.objective.exercices.matcher.impl.ThreeMatcherImpl;

public enum ConstantsMatcher {

    THREE_MATCHER(new ThreeMatcherImpl()),
    FIVE_MATCHER(new FiveMatcherImpl()),
    SEVEN_MATCHER(new SevenMatcherImpl());

    private Matcher matcher;

    ConstantsMatcher(Matcher matcher) {
        this.matcher = matcher;
    }

    public Matcher getMatcher() {
        return this.matcher;
    }

}
