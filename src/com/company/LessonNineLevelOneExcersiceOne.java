package com.company;

public class LessonNineLevelOneExcersiceOne {
    /**
     * this method compare first to second ,first and second should be some type and method  return boolean type
     *
     * @param first
     * @param second
     * @param <T>
     * @return
     */
    <T extends Comparable<T>> boolean isEqualTo(T first, T second) {
        if (first.equals(second)) {
            return true;
        } else {
            return false;
        }

    }
}
