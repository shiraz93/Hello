package com.company;

public class Main {

    public static void main(String[] args) {
        ArmenianChannelsList armenianChannelsList = new ArmenianChannelsList();
        UsaChannelsList usaChannelsList = new UsaChannelsList();
        IPTV iptv = new IPTV(armenianChannelsList, usaChannelsList);
        iptv.printChannels();

    }
}
