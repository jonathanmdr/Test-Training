package br.com.objective.exercices.service;

import br.com.objective.exercices.utils.LetterDictionary;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static br.com.objective.exercices.utils.ConstantsExpression.*;

public class WordNumberServiceTest {

    private WordNumberService wordNumberService;

    @Before
    public void setup() {
        this.wordNumberService = new WordNumberService(new LetterDictionary());
    }

    @Test
    public void evaluateWord_simpleWordWithUpperAndLowerCharacters_sumOfValuesForTheWord() {
        Assert.assertEquals(1, wordNumberService.evaluateWord("a"));
        Assert.assertEquals(27, wordNumberService.evaluateWord("A"));
        Assert.assertEquals(78, wordNumberService.evaluateWord("Hello"));
    }

    @Test
    public void evaluateWord_wordWithNumberCharacters_sumOfValuesForTheWord() {
        Assert.assertEquals(56, wordNumberService.evaluateWord("B2B"));
    }

    @Test
    public void evaluateWord_wordWithSpecialCharacters_sumOfValuesForTheWord() {
        Assert.assertEquals(175, wordNumberService.evaluateWord("@!#$Professional"));
    }

}
