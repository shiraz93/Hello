package com.company;

public class Lesson2_1e {
    void CarculatePrice(int per_price){
        for (Double i = 0.1; i <1.0 ;i+=0.1 ) {
           
            System.out.println(per_price*i);
        }
    }
}
