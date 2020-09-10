package br.com.objective.ex1.core.matcher;

import br.com.objective.ex1.core.matcher.impl.FiveMatcherImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FiveMatcherImplTest {

    private Matcher matcher;

    @Before
    public void setup() {
        this.matcher = new FiveMatcherImpl();
    }

    @Test
    public void fiveMatcher_getDivider_returningFive() {
        Assert.assertEquals(5, matcher.getDivider());
    }

    @Test
    public void isDivisorOf_processValidNumber_returningTrue() {
        Assert.assertTrue("This is not a valid number", matcher.isDivisorOf(5));
    }

    @Test
    public void isDivisorOf_processInvalidNumber_returningFalse() {
        Assert.assertFalse("This is a valid number", matcher.isDivisorOf(7));
    }

}
