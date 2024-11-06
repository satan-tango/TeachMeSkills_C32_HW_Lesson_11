package com.varkovich.lesson_11;

import com.varkovich.lesson_11.operation.DocumentOperation;
import com.varkovich.lesson_11.utils.DocumentValidatorState;
import com.varkovich.lesson_11.validator.DocumentValidator;

/**
 * Написать программу со следующим функционалом:
 * На вход передать строку (будем считать, что это некий стандартный номер документа в заданном формате).
 * Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это любая цифра, а y — это буква латинского
 * алфавита (могут быть большие и маленькие).
 * - Вывести на экран в одну строку два первых блока по 4 цифры.
 * - Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
 * - Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
 * - Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре
 * (реализовать с помощью класса StringBuilder).
 * - Проверить содержит ли номер документа последовательность "abc" и вывести сообщение
 * содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
 * - Проверить начинается ли номер документа с последовательности 555.
 * - Проверить заканчивается ли номер документа на последовательность 1a2b.
 * Все эти методы реализовать в отдельном классе в статических методах, каждая задача - в отдельном методе.
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        String document = "5553-abc-6552-hgy-4p5L";

        if (DocumentValidator.validateDocument(document) == DocumentValidatorState.INVALID_DOCUMENT) {
            System.out.println(DocumentValidatorState.INVALID_DOCUMENT.getCommentary());
            return;
        }

        System.out.printf("Document: %s\n", document);

        System.out.println("- " + DocumentOperation.getDocumentsTwoFirstBlocks(document));

        System.out.println("- " + DocumentOperation.getMaskedDocument(document));

        System.out.println("- " + DocumentOperation.getDocumentsLettersInLowCase(document));

        System.out.println("- " + DocumentOperation.getDocumentInSpecifiedFormatInUpperCase(document));

        if (DocumentOperation.isContainLine(document, "abc")) {
            System.out.println("- Is contain 'abc': YES");
        } else {
            System.out.println("- Is contain 'abc': NO");
        }

        if (DocumentOperation.doesStartWithLine(document, "555")) {
            System.out.println("- Does start with '555': YES");
        } else {
            System.out.println("- Does start with '555': NO");
        }

        if (DocumentOperation.doesEndWithLine(document, "1a2b")) {
            System.out.println("- Does end with '1a2b': YES");
        } else {
            System.out.println("- Does end with '1a2b': NO");
        }

    }
}
