package com.example.screamitus_android;

public class Infection {
    int totalinsructors;
    //n is no. of days
    int instructor=1;
    public double calculateTotalInfected(int n) {
        if (n <= 0) {
           return  -1;
        }
        else
        {
           if(n==1 &&n<=5)
           {
               totalinsructors=n*5;
           }
           else if(n>7)
           {
               totalinsructors=n*8;
           }

        }

        return totalinsructors;
    }

}
