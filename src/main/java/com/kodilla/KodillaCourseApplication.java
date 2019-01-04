package com.kodilla;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class KodillaCourseApplication {



    public static void main(String[] args) {
        SpringApplication.run(KodillaCourseApplication.class, args);

        Scanner takeA = new Scanner(System.in);
        Scanner takeB = new Scanner(System.in);

        double a = 0.0;
        double b = 0.0;

        System.out.println("Podaj liczbę A: ");
        a = takeA.nextDouble();
        System.out.println("Podaj liczbę B: ");
        b = takeA.nextDouble();
        Calculator add = new Calculator(a,b);

        System.out.println("Wynik dodawania: " + a + " + " + b + " = " + add.addNumbers());


    }


}

