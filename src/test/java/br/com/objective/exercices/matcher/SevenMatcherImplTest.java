package br.com.objective.exercices.matcher;

import br.com.objective.exercices.matcher.impl.SevenMatcherImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SevenMatcherImplTest {

    private Matcher subject;

    @Before
    public void setup() {
        this.subject = new SevenMatcherImpl();
    }

    @Test
    public void sevenMatcher_getDivider_returningSeven() {
        Assert.assertEquals(7, subject.getDivider());
    }

    @Test
    public void isDivisorOf_processValidNumber_returningTrue() {
        Assert.assertTrue("This is not a valid number", subject.isDivisorOf(7));
    }

    @Test
    public void isDivisorOf_processInvalidNumber_returningFalse() {
        Assert.assertFalse("This is a valid number", subject.isDivisorOf(5));
    }

}
