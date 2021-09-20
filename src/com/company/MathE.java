package com.company;

public class MathE {
    public static int digitSwapper(int input)
    {
        int numone = input % 10;
        int numten = input / 10 % 10;
        int numhun = input / 100 % 10;
        int swapped = (numhun + numone + numten);
        return swapped;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int input = 123;
        int output = digitSwapper(input);
        System.out.println(input +" " + output);
    }
}

