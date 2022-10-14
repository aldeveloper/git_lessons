package com.algorithm;

public class MathLogic {

    public static int factorialRecursion(int number){
        if(number < 2){
            return 1;
        }else{
            return number * factorialRecursion(number - 1);
        }
    }

}
