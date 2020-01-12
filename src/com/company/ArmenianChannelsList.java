package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class ArmenianChannelsList implements ListChannel {
    ArrayList<Channel> channel;

    /**
     * Create constructor.
     */
    public ArmenianChannelsList() {
        channel = new ArrayList<Channel>();
        addChannel("ShantNews", "news", 1.5);
        addChannel("MovieArmenian", "Movies", 3.5);
        addChannel("SongArmenian", "Song", 0.5);
    }

    /**
     * Add channel.
     *
     * @param name
     * @param description
     * @param price
     */
    public void addChannel(String name, String description, Double price) {
        Channel channel = new Channel(name, description, price);
        this.channel.add(channel);
    }

    /**
     * @return iterator
     */
    @Override
    public Iterator<Channel> createIterator() {
        return channel.iterator();
    }
}
