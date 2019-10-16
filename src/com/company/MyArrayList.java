package com.company;

public class MyArrayList<T> implements Mylist<T> {

    Object[] elementData = new Object[10];
    private int size = 0;

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * remove index element
     *
     * @param index
     */
    @Override
    public void remove(int index) {
        for (int i = index; i < size; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--;
    }

    /**
     * this method add to array element o
     *
     * @param o
     */
    @Override
    public void add(T o) {
        if (size >= elementData.length) {
            enlargeLenghtArray();
        }
        elementData[size++] = o;

    }

    /**
     * this method return element of elementdata
     *
     * @param index
     * @return
     */
    @Override
    public T get(int index) {
        return (T) elementData[index];
    }

    /**
     * this method create new array which size size+10 and reference o give to elementData
     */
    void enlargeLenghtArray() {
        Object o[] = new Object[size + 10];
        for (int i = 0; i < elementData.length; i++) {
            o[i] = elementData[i];
        }
        elementData = o;
    }
}
