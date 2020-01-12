package com.company;

import java.util.Iterator;

public class UsaChannelsList implements ListChannel {
    static final int MAX_ITEMS = 5;
    int numberOfItems = 0;
    Channel[] channels;

    /**
     * Create constructor
     */
    public UsaChannelsList() {
        channels = new Channel[MAX_ITEMS];
        addItem("CNN", "News", 2.5);
        addItem("UsaSport", "Sport", 3.5);
        addItem("MovieUsa", "Movies", 1.2);
    }

    /**
     * Add channel.
     *
     * @param name
     * @param description
     * @param price
     */
    public void addItem(String name, String description, double price) {
        Channel channel = new Channel(name, description, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry, channel is full! Can’t add channel to list");
        } else {
            channels[numberOfItems] = channel;
            numberOfItems++;
        }
    }

    /**
     * @return iterator.
     */
    @Override
    public Iterator<Channel> createIterator() {
        return new UsaChannelListIterator(channels);
    }
}
