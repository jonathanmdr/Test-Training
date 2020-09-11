package br.com.objective.exercices.matcher;

import br.com.objective.exercices.matcher.impl.FiveMatcherImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FiveMatcherImplTest {

    private Matcher subject;

    @Before
    public void setup() {
        this.subject = new FiveMatcherImpl();
    }

    @Test
    public void fiveMatcher_getDivider_returningFive() {
        Assert.assertEquals(5, subject.getDivider());
    }

    @Test
    public void isDivisorOf_processValidNumber_returningTrue() {
        Assert.assertTrue("This is not a valid number", subject.isDivisorOf(5));
    }

    @Test
    public void isDivisorOf_processInvalidNumber_returningFalse() {
        Assert.assertFalse("This is a valid number", subject.isDivisorOf(7));
    }

}
