package br.com.objective.exercices.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberCousinServiceTest {

    private NumberCousinService subject;

    @Before
    public void setup() {
        this.subject = new NumberCousinService();
    }

    @Test
    public void cousinNumber_evaluateValidCousinNumber_returningTrue() {
        Assert.assertTrue("This is not a cousin number", subject.evaluateCousinNumber(7));
    }

    @Test
    public void cousinNumber_evaluateInvalidCousinNumber_returningFalse() {
        Assert.assertFalse("This is a cousin number", subject.evaluateCousinNumber(10));
    }

}
