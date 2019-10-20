/*
 * 
 * proble [Data Types]: https://www.hackerrank.com/challenges/30-data-types/problem
 * 
 */
package com.java.thirtydaysofcode.day01;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
		int a = scan.nextInt();
        double b = scan.nextDouble();
        scan.nextLine();
        String c = scan.nextLine();
        
        System.out.println(i+a);
        System.out.println(d+b);
        System.out.println(s+c);

	}

}
