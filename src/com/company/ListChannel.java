package com.company;

import java.util.Iterator;

public interface ListChannel {
    /**
     * @return Iterator.
     */
    public Iterator<Channel> createIterator();
}
