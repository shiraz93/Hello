package com.company;

public class Main {

    public static void main(String[] args) {
        BMW bmw = new BMW();
        SpeedKPH movableAdapter = new MovableAdapter(bmw);
        System.out.println(" speed MKH:" + movableAdapter.getSpeed());



    }
}
