package com.company;

public class MathEx {
    public static int swap(int input)
    {
        int x = input % 10;
        int y = input / 10 % 10;
        int swapped = input - (x+y*10);
        return swapped + x * 10 + y;
    }
    public static void timeLeft(int curHour, int curMin, int depHour, int depMin)
    {
        int curhourtomin = curHour * 60;
        int curmintotal = curhourtomin + curMin;
        int dephourtomin = depHour * 60;
        int depmintotal = dephourtomin + depMin;
        int waitmin = depmintotal - curmintotal;
        int A = waitmin/60;
        int B = waitmin%60;
        System.out.println("The train is arriving in " + A + " hours and " + B + " minutes");
    }
    public static int dayOfWeek(int daysOfWeek, int day)
    {
        int Z = daysOfWeek + day;
        int down = Z - 1;
        return down%7;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int input = 123;
        int output = swap(input);
        System.out.println(input +" gets swapped to "+ output);

        input = 6;
        output = swap(input);
        System.out.println(input +" gets swapped to " + output);

        input = 381;
        output = swap(input);
        System.out.println(input +" gets swapped to " + output);

        System.out.println();

        timeLeft(1,34, 8, 20);
        timeLeft(1,15, 4, 36);

        System.out.println();

        System.out.println(dayOfWeek(0,1));
        System.out.println(dayOfWeek(0,14));
        System.out.println(dayOfWeek(6, 22));
        System.out.println(dayOfWeek(5, 4));
        System.out.println(dayOfWeek(1,24));
        System.out.println(dayOfWeek(2,1));
    }
}

