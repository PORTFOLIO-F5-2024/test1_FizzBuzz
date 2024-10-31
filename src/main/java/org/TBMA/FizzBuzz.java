package org.TBMA;

public class FizzBuzz {
    public String checkNumber(int number) {
        String finalReturn = "";
        System.out.println(finalReturn + "0");
        if (number % 3 == 0){
            finalReturn += "Fizz";
            System.out.println(finalReturn + "1");
        }
        if(number % 5 == 0){
            finalReturn += "Buzz";
            System.out.println(finalReturn + "2");
        }
        if (finalReturn.isEmpty()){
            finalReturn += String.valueOf(number);
            System.out.println(finalReturn + "3");
        }
        System.out.println(finalReturn + "4");
        return finalReturn;
    }
}
