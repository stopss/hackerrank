/* 
 * 
 * problem [Dictionaries and Maps]: https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem
 * 
 */
package com.java.thirtydaysofcode.day08;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> people = new HashMap<String, Integer>();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            
            // Write code here
            people.put(name, phone);
        }
        
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(people.containsKey(s)) {
            	System.out.println(s + "=" + people.get(s));
            }else {
            	System.out.println("Not found");
            }
        }
        in.close();

	}

}
