package com.company;

import java.util.Iterator;

public class IPTV {
    ListChannel armenianChannelList;
    ListChannel usaChannelList;

    /**
     * Create constructor.
     *
     * @param armenianChannelList List.
     * @param usaChannelList      Array.
     */
    public IPTV(ListChannel armenianChannelList, ListChannel usaChannelList) {
        this.armenianChannelList = armenianChannelList;
        this.usaChannelList = usaChannelList;
    }

    /**
     * Print channels.
     */
    public void printChannels() {
        Iterator<Channel> armenianChannelIterator = armenianChannelList.createIterator();
        Iterator<Channel> usaChannelIterator = usaChannelList.createIterator();
        System.out.println("List");
        System.out.println("Armenian");
        printChannels(armenianChannelIterator);
        System.out.println("USA");
        printChannels(usaChannelIterator);
    }

    /**
     * Print channels.
     *
     * @param iterator
     */
    public void printChannels(Iterator iterator) {
        while (iterator.hasNext()) {
            Channel channel = (Channel) iterator.next();
            System.out.print(channel.getName() + ",");
            System.out.print(channel.getPrice() + ",");
            System.out.println(channel.getDescription() + ":");
        }
    }
}
