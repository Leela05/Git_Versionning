package com.Harman;

public class Addition {
    public static void main(String[] args) {
        Subtraction sub_obj=new Subtraction();
        int x = 3, y = 4, c;
        c = x + y;
        System.out.println(c);
        int subresult=sub_obj.sub2numbers(x,y);
        System.out.println(subresult);
    }
}
