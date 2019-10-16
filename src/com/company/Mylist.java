package com.company;

public interface Mylist<T> {
    int size();
    void remove(int index);
    void add(T t);
    T get(int index);

}
