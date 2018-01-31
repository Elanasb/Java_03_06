package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Main objektas = new Main();

        objektas.ivedimas();
        objektas.isvedimas();
    }

    private String[] masyvas;

    public void ivedimas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite 5 zodzius");
        masyvas = new String[5];
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("Iveskite zodi "+(i+1));
            masyvas[i] = sc.nextLine();


        }

    }

    public void isvedimas() {
        System.out.println("=================");
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println(masyvas[i]);

        }
    }
}