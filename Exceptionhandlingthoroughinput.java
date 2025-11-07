package com.mycompany.project;

import java.util.Scanner;

 class Exceptionhandlingthoroughinput{
    public static int divide(int a,int b) throws ArithmeticException{
        int c=a/b;
        return c;

    }

     static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try {
            System.out.println("entre the value of a :");
            int a = sc.nextInt();

            System.out.println("entre the value of b :");
            int b =sc.nextInt();

            int c=a/b;
            System.out.println(c);
        }

        catch (Exception e){
            System.out.println("this is an exception");
        }
    }


}