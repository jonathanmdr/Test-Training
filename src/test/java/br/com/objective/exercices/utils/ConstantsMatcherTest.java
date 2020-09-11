package br.com.objective.exercices.utils;

import br.com.objective.exercices.matcher.impl.FiveMatcherImpl;
import br.com.objective.exercices.matcher.impl.SevenMatcherImpl;
import br.com.objective.exercices.matcher.impl.ThreeMatcherImpl;
import org.junit.Assert;
import org.junit.Test;

import static br.com.objective.exercices.utils.ConstantsMatcher.*;

public class ConstantsMatcherTest {

    @Test
    public void threeMatcher_getThreeMatcherEnum_returningThreeMatcherInstance() {
        Assert.assertTrue("This is not ThreeMatcherImpl instance", THREE_MATCHER.getMatcher() instanceof ThreeMatcherImpl);
    }

    @Test
    public void fiveMatcher_getFiveMatcherEnum_returningFiveMatcherInstance() {
        Assert.assertTrue("This is not FiveMatcherImpl instance", FIVE_MATCHER.getMatcher() instanceof FiveMatcherImpl);
    }

    @Test
    public void sevenMatcher_getSevenMatcherEnum_returningSevenMatcherInstance() {
        Assert.assertTrue("This is not SevenMatcherImpl instance", SEVEN_MATCHER.getMatcher() instanceof SevenMatcherImpl);
    }

}
