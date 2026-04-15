package br.com.gabriel.Set.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		Set<Integer> courseA = new HashSet<>();
		for(int i = 1; i<=n;i++) {			
			courseA.add(sc.nextInt());
		}
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		Set<Integer> courseB = new HashSet<>();
		for(int i = 1; i<=n;i++) {			
			courseB.add(sc.nextInt());
		}
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		Set<Integer> courseC = new HashSet<>();
		for(int i = 1; i<=n;i++) {			
			courseC.add(sc.nextInt());
		}
		
		Set<Integer> total = new HashSet<Integer>(courseA);
		total.addAll(courseB);
		total.addAll(courseC);
		
				
		System.out.println("Total Students "+ total.size());
		
		sc.close();
		
	}

}
