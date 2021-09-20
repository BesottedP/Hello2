package com.company;

public class MathE {
    public static int digitSwapper(int input)
    {
        int numone = input % 10;
        int numten = input / 10 % 10;
        int swapped = input - (numone+numten*10);
        return swapped + numone * 10 + numten;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int input = 123;
        int output = digitSwapper(input);
        System.out.println(input +" " + output);

        input = 6;
        output = digitSwapper(input);
        System.out.println(input +" " + output);

        input = 381;
        output = digitSwapper(input);
        System.out.println(input +" " + output);
    }
}

