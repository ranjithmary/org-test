package org.base;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Lists2 {

	public static void main(String[] args) {
		List<Integer>li = new ArrayList();

		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		
		System.out.println(li);
		
		Set l1 = new LinkedHashSet();
		
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(70);
		l1.add(60);
		
		System.out.println(l1);
		
		
		
		li.retainAll(l1);
		System.out.println(li);
		
		
		
			
		}
		
		
	}


