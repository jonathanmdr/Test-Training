package br.com.objective.exercices.service;

import br.com.objective.exercices.service.exception.InvalidNumberException;
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

    @Test(expected = InvalidNumberException.class)
    public void happyNumber_evaluateInvalidHappyNumber_returningException() {
        subject.evaluateHappyNumber(-1);
    }

}
