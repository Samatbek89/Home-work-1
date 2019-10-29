package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Основное задание
        System.out.println("Привет мир!");
        int myNumber = 89;
        System.out.println(myNumber);

        final String tx = "Привет"; // константа)
        String tx2 = "Мир";
        System.out.println(tx + tx2);


        // Задание на сообразительность
        Scanner sc = new Scanner(System.in);
        System.out.println("Здравствуйте Самат: ");
        String phrasel = sc.nextLine();
        String phrase2 = sc.nextLine();
        System.out.println(phrasel + " " + phrase2);

    }
}
