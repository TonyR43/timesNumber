package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Please enter a number to multiply: ");
        int num = userInput.nextInt();

        System.out.println("Please enter number of times to be multiplied: ");
        int numBy = userInput.nextInt();

        int count = 1;
        int sum=0;

        while (count <= numBy)
        {
            sum = sum+num;
            System.out.println(sum);
            count++;
        }
    }
}
