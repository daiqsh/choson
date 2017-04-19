package com.cheers.collection;

import java.util.HashSet;
import java.util.Set;

public class Convertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long originLong = 0;
		System.out.println(new Integer((int)originLong));
		
		//
		Set<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("A");
		
		System.out.println(set.size());
	}

}
