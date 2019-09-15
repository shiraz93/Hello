package com.company;

public class Lesson1d {
    void Add(Double number){
        if(number>0){
            System.out.println(number+1);
        }else if(number<0){
            System.out.println(number-2);
        }else {
            number=10.0;
            System.out.println(number);
        }
    }
}
