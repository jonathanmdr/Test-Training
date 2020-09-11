package br.com.objective.exercices.utils.exception;

public class LetterDictionaryException extends RuntimeException {

    public LetterDictionaryException(String message, Exception ex) {
        super(message, ex);
    }

}
