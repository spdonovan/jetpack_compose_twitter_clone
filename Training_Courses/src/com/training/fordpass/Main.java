package com.training.fordpass;

public class Main {

    public static void main(String[] args) {
       System.out.println("We got started!!");
       int valA = 21;
       int valB = 6;
       int valC = 3;
       int valD = 1;

       int result1 = valA - valB / valC;

       int result2 = (valA - valB) / valC;

       System.out.println(result1);
       System.out.println(result2);

       int result3 = valA / valC * valD + valB;
       int result4 = valA / (valC * (valD + valB));

       System.out.println(result3);
       System.out.println(result4);
    }

}
