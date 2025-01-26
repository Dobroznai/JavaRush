package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/*
Призывная кампания
*/


public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18 && age <= 28) {
            System.out.println(name + militaryCommissar);
        }
        sc.close();
    }
}

