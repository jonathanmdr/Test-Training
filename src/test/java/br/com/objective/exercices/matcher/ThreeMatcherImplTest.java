package br.com.objective.exercices.matcher;

import br.com.objective.exercices.matcher.impl.ThreeMatcherImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ThreeMatcherImplTest {

    private Matcher subject;

    @Before
    public void setup() {
        this.subject = new ThreeMatcherImpl();
    }

    @Test
    public void threeMatcher_getDivider_returningThree() {
        Assert.assertEquals(3, subject.getDivider());
    }

    @Test
    public void isDivisorOf_processValidNumber_returningTrue() {
        Assert.assertTrue("This is not a valid number", subject.isDivisorOf(3));
    }

    @Test
    public void isDivisorOf_processInvalidNumber_returningFalse() {
        Assert.assertFalse("This is a valid number", subject.isDivisorOf(7));
    }

}
