package br.com.objective.exercices.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberHappyServiceTest {

    private NumberHappyService numberHappyService;

    @Before
    public void setup() {
        this.numberHappyService = new NumberHappyService();
    }

    @Test
    public void happyNumber_evaluateValidHappyNumber_returningTrue() {
        Assert.assertTrue("This is not a happy number", numberHappyService.evaluateHappyNumber(7));
    }

    @Test
    public void happyNumber_evaluateInvalidHappyNumber_returningFalse() {
        Assert.assertFalse("This is a happy number", numberHappyService.evaluateHappyNumber(5));
    }

}
