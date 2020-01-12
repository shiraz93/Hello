package com.company;

import java.util.Iterator;

public class UsaChannelListIterator implements Iterator {
    Channel[] channels;
    int position = 0;

    /**
     * Create constructor
     *
     * @param channels Array.
     */
    public UsaChannelListIterator(Channel[] channels) {
        this.channels = channels;
    }

    /**
     * @return{@code true} if has next element, {@code false} otherwise.
     */
    @Override
    public boolean hasNext() {
        if (position >= channels.length || channels[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * @return next element.
     */
    @Override
    public Object next() {
        Channel channel = channels[position];
        position++;
        return channel;
    }
}
