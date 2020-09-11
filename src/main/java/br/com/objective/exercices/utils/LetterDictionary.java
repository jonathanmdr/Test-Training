package br.com.objective.exercices.utils;

import br.com.objective.exercices.utils.exception.LetterDictionaryException;

import java.util.HashMap;
import java.util.Map;

public class LetterDictionary {

    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private Map<String, Integer> letterValues;

    public LetterDictionary() {
        this.letterValues = loadLetterValues();
    }

    public int getValueByLetter(char character) {
        try {
            return this.letterValues.get(String.valueOf(character));
        } catch (Exception ex) {
            throw new LetterDictionaryException(ex.getMessage(), ex);
        }
    }

    private Map<String, Integer> loadLetterValues() {
        this.letterValues = new HashMap<>();
        int letterValue = 1;

        char[] charactersLower = ALPHABET.toCharArray();

        for (char character : charactersLower) {
            this.letterValues.put(String.valueOf(character), letterValue);
            letterValue ++;
        }

        char[] charactersUpper = ALPHABET.toUpperCase().toCharArray();

        for (char character : charactersUpper) {
            this.letterValues.put(String.valueOf(character), letterValue);
            letterValue ++;
        }

        return letterValues;
    }

}
