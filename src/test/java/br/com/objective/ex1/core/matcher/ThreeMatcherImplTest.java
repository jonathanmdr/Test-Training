package br.com.objective.ex1.core.matcher;

import br.com.objective.ex1.core.matcher.impl.ThreeMatcherImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ThreeMatcherImplTest {

    private Matcher matcher;

    @Before
    public void setup() {
        this.matcher = new ThreeMatcherImpl();
    }

    @Test
    public void threeMatcher_getDivider_returningThree() {
        Assert.assertEquals(3, matcher.getDivider());
    }

    @Test
    public void isDivisorOf_processValidNumber_returningTrue() {
        Assert.assertTrue("This is not a valid number", matcher.isDivisorOf(3));
    }

    @Test
    public void isDivisorOf_processInvalidNumber_returningFalse() {
        Assert.assertFalse("This is a valid number", matcher.isDivisorOf(7));
    }

}
