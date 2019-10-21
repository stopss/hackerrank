/*
 * 
 * problem [Binary Numbers]: https://www.hackerrank.com/challenges/30-binary-numbers/problem
 * 
 */
package com.java.thirtydaysofcode.day10;

import java.util.Scanner;

public class Solution {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String strBinary = Integer.toBinaryString(n);
        
        int max = 0;
        int tmp = 0;
        
        for(int i = 0; i < strBinary.length(); i++) {
        	if(strBinary.charAt(i) == '1') {
        		tmp++;
        		max = Math.max(max, tmp);
        	}else {
        		tmp = 0;
        	}
        }
        System.out.println(max);
        
        scanner.close();
    }
}
