package com.mycompany.spinning_practice_problem;

import java.util.*;

public class Spinning_Practice_problem {
    
    public static void main(String[] args) {
        double h;
        double r;
        Timef newTime = new Timef();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the hour and then rotations");
        h = input.nextInt();
        r = input.nextDouble();  
        double hour = h*60;
        double rotations = r*60;
        double time = hour + rotations;
        double finalHour = Math.floor(time / 60);
        double finalMin = Math.ceil(time % 60);
        newTime.setTime((int)finalHour, (int)finalMin);
        displayTime(newTime);
    }
    private static void displayTime(Timef t){
        System.out.print(t.toString());
    }
}

