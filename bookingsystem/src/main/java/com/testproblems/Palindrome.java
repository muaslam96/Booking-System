package com.testproblems;

public class Palindrome {
    public boolean isPalindrome(int number){

        System.out.println("Initial Number : "+number);

        int checkNumer = number;

        boolean status = false;

        int secondNumber = 0;

        while(number > 0){
            secondNumber = secondNumber*10 + number % 10;
            //System.out.println(secondNumber);
            number = number / 10;
        }

        System.out.println("Second number : "+secondNumber);
        //System.out.println("Initial Number : "+number);

        if (secondNumber == checkNumer) {
            return status = true;
        }
        else
            return status;
    }
}
