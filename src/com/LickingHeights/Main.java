package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       ModulusClock();
    }

    public static void ModulusClock(){
        int hours;
        int minutes;

        Scanner user;
        user = new Scanner(System.in);

        System.out.println("Enter a Value for Hours");
        hours = user.nextInt();

        System.out.println("Enter a Value for Minutes");
        minutes = user.nextInt();
        hours = minutes >= 60? hours + minutes/60 : hours;
        hours = (hours%12);
        minutes =(minutes%60);
        System.out.printf("The time is: %d:%02d",hours,minutes);





    }

}