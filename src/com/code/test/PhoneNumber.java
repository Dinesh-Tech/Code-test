package com.code.test;

public class PhoneNumber {

    static final char[][] matrix = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'},
            {'*', '0', '#'}
    };

    public static void main(String args[]) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        String givenPhoneNumber = "585-953-2111";
        phoneNumberValidations(givenPhoneNumber);

        System.out.println("Row" + " " + "Column");
        for(int i =0; i< givenPhoneNumber.length(); i++){
           char c = givenPhoneNumber.charAt(i);
            findIndiesOfElement(c);
        }
    }

    public static void phoneNumberValidations(String str) {

        String rx = "[\\(]?\\d{3}[\\)]?([-.]?)\\s*\\d{3}\\1\\s*\\d{4}";

        if (str.matches(rx)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public static void findIndiesOfElement(char c) {

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == c) {
                    System.out.println(i + "  " + j);
                    break;
                }
            }
    }

    public static String findEasyDial(){
        String dial = "easy to dial";
        String regExp = "";
        //regExp.matches \\s*[0-9]
        //if( ! matches )
        // dial = is not easy to dial
        return dial;
    }

}
