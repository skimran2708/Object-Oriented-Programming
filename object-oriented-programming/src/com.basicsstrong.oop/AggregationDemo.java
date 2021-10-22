package com.basicsstrong.oop;

import java.util.*;

class College
{
	String name;
	private List<Teacher> teacher;
	public College(String name, List<Teacher> teacher)
	{
		this.name=name;
		this.teacher=teacher;
	}

	public List<Teacher> getTeacher()
	{
		return teacher;
	}
}

class Teacher
{
	String name;
	String subject;
	public Teacher(String name, String subject)
	{
		this.name=name;
		this.subject=subject;
	}

	@Override
	public String toString()
	{
		return "[Teacher: "+name+", Subject: "+subject+"]";
	}
}

public class AggregationDemo
{
	public static void main(String args[])
	{
		List<Teacher> teacher=new ArrayList<Teacher>();
		teacher.add(new Teacher("Rohan","Java"));
		teacher.add(new Teacher("John","Python"));
		teacher.add(new Teacher("Michael","C++"));

		College ob=new College("MyCollege",teacher);
	}
}