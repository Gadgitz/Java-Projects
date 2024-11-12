package com.mycompany.spinning_practice_problem;
public class Timef {
    private int hour;
    private int min;
    
    public void setTime(int hour, int min){
        this.hour = hour;
        this.min = min;
    }
    
    public String toString(){
    return String.format("%d:%02d", hour, min);
    }
}
