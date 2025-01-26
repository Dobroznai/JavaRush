package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static String line, line1, line2;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        line = sc.nextLine();
        line1 = sc.nextLine();
        line2 = sc.nextLine();
        
        System.out.println(line2);
        System.out.println(line1.toUpperCase());
        System.out.println(line.toLowerCase());
        sc.close();
}}
