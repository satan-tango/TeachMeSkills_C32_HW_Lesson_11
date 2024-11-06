package com.varkovich.lesson_11.validator;

import com.varkovich.lesson_11.utils.DocumentValidatorState;

public class DocumentValidator {

    public static DocumentValidatorState validateDocument(String document) {
        if (document == null || document.isEmpty()) {
            return DocumentValidatorState.INVALID_DOCUMENT;
        }

        document.trim();

        if (document.length() != 22) {
            return DocumentValidatorState.INVALID_DOCUMENT;
        }

        if (!document.contains("-")) {
            return DocumentValidatorState.INVALID_DOCUMENT;
        }

        String[] documentArray = document.split("-");

        if (documentArray.length != 5) {
            return DocumentValidatorState.INVALID_DOCUMENT;
        }

        for (int i = 0; i < documentArray.length - 1; i++) {
            if (i % 2 == 0) {
                if (documentArray[i].length() != 4) {
                    return DocumentValidatorState.INVALID_DOCUMENT;
                }
                if (!isArrayContainsOnlyNumbers(documentArray[i].toCharArray())) {
                    return DocumentValidatorState.INVALID_DOCUMENT;
                }
            } else {
                if (documentArray[i].length() != 3) {
                    return DocumentValidatorState.INVALID_DOCUMENT;
                }
                if (!isArrayContainsOnlyLetters(documentArray[i].toLowerCase().toCharArray())) {
                    return DocumentValidatorState.INVALID_DOCUMENT;
                }
            }
        }

        String documentLastBlock = documentArray[documentArray.length - 1];
        if (documentLastBlock.length() != 4) {
            return DocumentValidatorState.INVALID_DOCUMENT;
        }

        for (int i = 0; i < documentLastBlock.length(); i++) {
            if (i % 2 == 0) {
                if (!Character.isDigit(documentLastBlock.charAt(i))) {
                    return DocumentValidatorState.INVALID_DOCUMENT;
                }
            } else {
                if (!Character.isLetter(documentLastBlock.charAt(i))) {
                    return DocumentValidatorState.INVALID_DOCUMENT;
                }
            }
        }


        return DocumentValidatorState.VALID_DOCUMENT;
    }

    private static boolean isArrayContainsOnlyNumbers(char[] charArray) {
        for (int i = 0; i < charArray.length; i++) {
            if (!Character.isDigit(charArray[i])) {
                return false;
            }
        }
        return true;
    }


    private static boolean isArrayContainsOnlyLetters(char[] charArray) {
        for (int i = 0; i < charArray.length; i++) {
            if (!Character.isLetter(charArray[i])) {
                return false;
            }
        }
        return true;
    }

}
