package br.com.objective.exercices.service;

import br.com.objective.exercices.service.exception.InvalidWordException;
import br.com.objective.exercices.utils.LetterDictionary;

import java.text.Normalizer;

public class WordNumberService {

    private final LetterDictionary letterDictionary;

    public WordNumberService(LetterDictionary letterDictionary) {
        this.letterDictionary = letterDictionary;
    }

    public int evaluateWord(String word) {
        if (word == null) {
            throw new InvalidWordException("This word cannot be null");
        }

        int sum = 0;

        char[] characters = sanitizeString(word).toCharArray();

        for (char character : characters) {
            sum += letterDictionary.getValueByLetter(character);
        }

        return sum;
    }

    private String sanitizeString(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD)
                .replaceAll("\\d+", "")
                .replaceAll("[^a-zA-Z]", "")
                .replaceAll("[^\\p{ASCII}]", "");
    }

}
