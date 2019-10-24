package com.company;

import java.util.List;
import java.util.stream.Stream;

public class LessonTenLevelTwoExerciseFour {
    /**
     * Add one character to all elements and print the first element of the collection
     *
     * @param list
     * @param symbol
     */
    void AddSymbolAndPrintFirstElement(List<String> list, String symbol) {
        Stream<String> stringStream = list.stream();
        stringStream.map(p -> p + symbol).limit(1).forEach(System.out::println);
    }
}
