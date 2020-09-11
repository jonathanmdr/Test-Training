package br.com.objective.ex1.matcher;

import br.com.objective.ex1.matcher.impl.SevenMatcherImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SevenMatcherImplTest {

    private Matcher matcher;

    @Before
    public void setup() {
        this.matcher = new SevenMatcherImpl();
    }

    @Test
    public void sevenMatcher_getDivider_returningSeven() {
        Assert.assertEquals(7, matcher.getDivider());
    }

    @Test
    public void isDivisorOf_processValidNumber_returningTrue() {
        Assert.assertTrue("This is not a valid number", matcher.isDivisorOf(7));
    }

    @Test
    public void isDivisorOf_processInvalidNumber_returningFalse() {
        Assert.assertFalse("This is a valid number", matcher.isDivisorOf(5));
    }

}