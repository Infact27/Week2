package oop;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class Week2 {

    public static void main(String[] args) 
    {
        int ANGKA;
        String AL, I;
        
        Scanner INPUT = new Scanner(System.in);
        Random LOTERE = new Random();
        AL = String.format("%d%d", LOTERE.nextInt(10), LOTERE.nextInt(10));
        
        do{
            System.out.print("Masukkan angka [0-99] : ");
            try
            {
                ANGKA = INPUT.nextInt();
            }
            catch(InputMismatchException e)
            {
                INPUT.nextLine();
                continue;
            }
            if(ANGKA >= 0 && ANGKA <= 99)
            break;
        }while(true);
        
        if(ANGKA<10)
        {
            I = String.format("0" + ANGKA);
        }
        else I = String.valueOf(ANGKA);
        
        System.out.println("Angka anda : " + I);
        System.out.println("Angka lotere : " + AL );
        
        if(I.equals(AL))
        {
            System.out.println("Anda mendapatkan $10.000!!!");
        }
        else if(I.charAt(0)== AL.charAt(1) && I.charAt(1) == AL.charAt(0))
        {
            System.out.println("Anda mendapatkan $3.000!!!");
        }
        else if(I.charAt(0) == AL.charAt(0) || I.charAt(0) == AL.charAt(1) || I.charAt(1) == AL.charAt(0) || I.charAt(1) == AL.charAt(1))
        {
            System.out.println("Anda mendapatkan $1.000!!!");
        }
        else
        {
            System.out.println("Anda kurang beruntung...");
        }
    }
}