package com.collections;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MapInterface 
{
	void meth1()
	{
		System.out.println("implementing Map implemented classes");
		//HashMap<Object,Object> map=new HashMap<Object,Object>();  //insertion order not maintained
		LinkedHashMap<Object,Object> map=new LinkedHashMap<Object,Object>();  //insertion order maintained
		
		map.put(101,"java");
		map.put("java","java"); //heterogeneous keys&heterogeneous values are allowed
		map.put(null,null);   //null keys & null values are allowed
		map.put(101, 1000);  //Duplicates are allowed
		map.put(102,"HTML");
		map.put("venuabcdefghijklmjjmmh",1000); //its default capacity16
		map.put(103,"oracle"); //its size increases by double
		map.put(106,"spring"); //it is not synchronized
		
		System.out.println(map+"\n");
		
		System.out.println("get():"+map.get(103)+"\n");
		
		System.out.println("retrieving the keys by using hashset");
		HashSet<Object> hs=new HashSet<Object>(map.keySet());
		Iterator<Object> i1=hs.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next()+" ");
		}
	}
		

	public static void main(String[] args) 
	{
		 MapInterface mi=new MapInterface();
		 mi.meth1();

	}

}
