package com.varkovich.lesson_11.operation;

public class DocumentOperation {

    public static String getDocumentsTwoFirstBlocks(String document) {
        String[] documentArray = document.split("-");

        return documentArray[0] + documentArray[2];
    }

    public static String getMaskedDocument(String document) {
        document = document.substring(0, 4) + "-***-" + document.substring(9, 13) + "-***-" + document.substring(18, 22);

        return document;
    }

    public static String getDocumentsLettersInLowCase(String document) {
        String[] documentArray = document.split("-");
        String result = documentArray[1] + "/" + documentArray[3] + "/"
                + documentArray[4].charAt(1) + "/" + documentArray[4].charAt(3);

        return result.toLowerCase();
    }

    public static StringBuilder getDocumentInSpecifiedFormatInUpperCase(String document) {
        String[] documentArray = document.split("-");
        StringBuilder stringBuilder = new StringBuilder("Letters:");
        stringBuilder.append(documentArray[1].toUpperCase());
        stringBuilder.append("/");
        stringBuilder.append(documentArray[3].toUpperCase());
        stringBuilder.append("/");
        stringBuilder.append(documentArray[4].toUpperCase().charAt(1));
        stringBuilder.append("/");
        stringBuilder.append(documentArray[4].toUpperCase().charAt(3));

        return stringBuilder;
    }

    public static boolean isContainLine(String document, String line) {
        document = document.toLowerCase();
        if (document.contains(line)) {
            return true;
        }
        return false;
    }

    public static boolean doesStartWithLine(String document, String line) {
        return document.startsWith(line);
    }

    public static boolean doesEndWithLine(String document, String line) {
        return document.endsWith(line);
    }
}
