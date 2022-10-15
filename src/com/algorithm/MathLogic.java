package com.algorithm;

import java.util.ArrayList;
import java.util.List;

public class MathLogic {

    public static int factorialRecursion(int number){
        if(number < 2){
            return 1;
        }else{
            return number * factorialRecursion(number - 1);
        }
    }

    public static int convertToBinary(int number){
        StringBuilder binary = new StringBuilder();

        do{
            binary.append(number%2);
        }while ((number/=2)>=1);

        return Integer.parseInt(binary.reverse().toString());
    }
}
