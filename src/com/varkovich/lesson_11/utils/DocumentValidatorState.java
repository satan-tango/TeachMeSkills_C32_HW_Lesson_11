package com.varkovich.lesson_11.utils;

public enum DocumentValidatorState {
    VALID_DOCUMENT("Document is valid"),
    INVALID_DOCUMENT("Document is invalid");

    String commentary;

    DocumentValidatorState(String commentary) {
        this.commentary = commentary;
    }

    public String getCommentary() {
        return commentary;
    }
}
