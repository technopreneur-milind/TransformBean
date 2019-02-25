package com.example.JavaFileCopier;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyBean  {

	public String map(String input) throws Exception {
		String id =input.substring(0,9);
		String name=input.substring(9,14);
		String dob=input.substring(14,22);
		String school=input.substring(22,31);
		String city =input.substring(31,40);
		StringBuilder csv = new StringBuilder(); 
		csv.append(id);
		System.out.println(id);
		csv.append(",").append(name);
		System.out.println(name);
		csv.append(",").append(dob);
		System.out.println(dob);
		csv.append(",").append(school);
		System.out.println(school);
		csv.append(",").append(city);
		System.out.println(city);
		return csv.toString();
	}

}
