package br.com.objective.exercices.service;

import br.com.objective.exercices.service.exception.InvalidWordException;
import br.com.objective.exercices.utils.LetterDictionary;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WordNumberServiceTest {

    private WordNumberService subject;

    @Before
    public void setup() {
        this.subject = new WordNumberService(new LetterDictionary());
    }

    @Test
    public void evaluateWord_simpleCharacters_sumOfValuesForTheWord() {
        Assert.assertEquals(1, subject.evaluateWord("a"));
        Assert.assertEquals(27, subject.evaluateWord("A"));
    }

    @Test
    public void evaluateWord_simpleWordWithUpperAndLowerCharacters_sumOfValuesForTheWord() {
        Assert.assertEquals(78, subject.evaluateWord("Hello"));
    }

    @Test
    public void evaluateWord_wordWithNumberCharacters_sumOfValuesForTheWord() {
        Assert.assertEquals(56, subject.evaluateWord("B2B"));
    }

    @Test
    public void evaluateWord_wordWithSpecialCharacters_sumOfValuesForTheWord() {
        Assert.assertEquals(175, subject.evaluateWord("@!#$Professional"));
    }

    @Test(expected = InvalidWordException.class)
    public void evaluateWord_wordNull_returningException() {
        subject.evaluateWord(null);
    }

}
