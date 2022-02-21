package com.org.gen.day6;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new HashSet<Integer>();
		
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		s1.add(5);
		
		s2.add(4);
		s2.add(5);
		s2.add(6);
		s2.add(7);
		
		Set<Integer> union = new HashSet<Integer>();
		union.addAll(s1);
		union.addAll(s2);
		
		System.out.println(union);
		
		Set<Integer> inter = new HashSet<Integer>();
		inter.addAll(s1);
		inter.retainAll(s2);
		System.out.println(inter);
		
		Set<Integer> diff = new HashSet<Integer>();
		diff.addAll(s1);
		diff.removeAll(s2);
		System.out.println(diff);
		
		
	}

}
