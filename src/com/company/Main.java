package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        for(int i = args.length -1; i > -1; i--){

            System.out.println("Аргумент в обратном порядке: " + args[i]);
        }
    }
}
