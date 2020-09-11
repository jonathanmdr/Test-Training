package br.com.objective.exercices.utils;

import br.com.objective.exercices.utils.exception.LetterDictionaryException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LetterDictionaryTest {

    private LetterDictionary subject;

    @Before
    public void setup() {
        this.subject = new LetterDictionary();
    }

    @Test
    public void getValueByLetter_informLetter_returningValue() {
        char[] characterLower = LetterDictionary.ALPHABET.toCharArray();
        int valueValidationLower = 1;
        int valueValidationUpper = 27;

        for (int i = 0; i < characterLower.length; i++) {
            Assert.assertEquals(valueValidationLower, subject.getValueByLetter(characterLower[i]));
            valueValidationLower ++;
        }

        char[] characterUpper = LetterDictionary.ALPHABET.toUpperCase().toCharArray();

        for (int i = 0; i < characterUpper.length; i++) {
            Assert.assertEquals(valueValidationUpper, subject.getValueByLetter(characterUpper[i]));
            valueValidationUpper ++;
        }
    }

    @Test(expected = LetterDictionaryException.class)
    public void getValueByLetter_informInvalidLetter_returningException() {
        subject.getValueByLetter('Ç');
    }

}
