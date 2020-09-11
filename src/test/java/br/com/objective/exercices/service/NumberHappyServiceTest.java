package br.com.objective.exercices.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberHappyServiceTest {

    private NumberHappyService subject;

    @Before
    public void setup() {
        this.subject = new NumberHappyService();
    }

    @Test
    public void happyNumber_evaluateValidHappyNumber_returningTrue() {
        Assert.assertTrue("This is not a happy number", subject.evaluateHappyNumber(7));
    }

    @Test
    public void happyNumber_evaluateInvalidHappyNumber_returningFalse() {
        Assert.assertFalse("This is a happy number", subject.evaluateHappyNumber(5));
    }

}
