package data.structure.hashtable;

import java.util.*;

public class HashTableConcept {
	public static void main(String args[])
	{
		Hashtable balance = new Hashtable();
		Enumeration names;
		String sr;
		double val;
		
		balance.put("Mohon", new Double(3434.34));
		balance.put("Rana", new Double(1211.22));
		balance.put("Ayan", new Double(1378.00));
		balance.put("Daisy", new Double(1510.22));
		balance.put("Qadir", new Double(-19.02));
		
		names = balance.keys();
		
		while(names.hasMoreElements())
		{
			sr = (String) names.nextElement();
			System.out.println(sr + ": " + balance.get(sr));
		}
		System.out.println();
		
		val = ((Double)balance.get("Mohon")).doubleValue();
		balance.put("Mohon", new Double(val+1000));
		System.out.println("Mohon's new balance is : " + balance.get("Mohon"));
	}
}
