/*
 * 
 * proble [Let's Review]: https://www.hackerrank.com/challenges/30-review-loop/problem
 * 
 */
package com.java.thirtydaysofcode.day06;

import java.util.Scanner;

public class Solution {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
        
        for(int i = 0; i < T; i++) {
            String S = sc.next();
            for(int j = 0; j < S.length(); j+=2) {
                System.out.print(S.charAt(j));
            }
            System.out.print(" ");
            for(int j = 1; j < S.length(); j+=2) {
                System.out.print(S.charAt(j));
            }
            System.out.println();
        }

	}

}
