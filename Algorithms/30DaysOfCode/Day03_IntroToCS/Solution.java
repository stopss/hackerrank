/*
 * 
 * problem [Intro to Conditional Statements]: https://www.hackerrank.com/challenges/30-conditional-statements/problem
 * 
 */
package com.java.thirtydaysofcode.day03;

import java.util.Scanner;

public class Solution {

	public static void solve(int n) {
        if((n%2) != 0) {
            System.out.println("Weird");
        } else {
            if(n >= 2 && n < 5)
                System.out.println("Not Weird");
            else if(n >= 6 && n <= 20)
                System.out.println("Weird");
            else
                System.out.println("Not Weird");
        }

    }
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(N);
        scanner.close();

	}

}
