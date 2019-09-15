package com.company;

public class Lesson_1_3e {
    void Isin(double x,double y){
        if(x>=-1 && x<=0 && y>=-1 && y<=0 || x<=1 && x>=0 && y<=1 && y>=0 && x+y<=1){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
