package Lecture1;

import java.util.HashMap;
import java.util.Objects;

public class Person {
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	} 
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this==obj) return true;
		if(obj==null || getClass()!= obj.getClass()) return false;
		Person person=(Person)obj;
		return age==person.age && Objects.equals(name,person.name);
		
		// override equals method to check both reference,class and data not only reference.
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(age,name);
	}
	public static void main(String [] args) {
		Person person1=new Person(12,"Gurmeet");
		Person person2=new Person(13,"Sumit");
		Person person3=new Person(12,"Gurmeet");
		
		System.out.println(person1.equals(person3)); // it compare refrence of object/location.
		
		System.out.println(person1.hashCode()+"  "+person3.hashCode());
		//hashcode are unique values on basis of memory reference and some other refrence.
		//if value of person1 and person2 is same also then hashcode are diffrent.
		//it will have same hascode if memory refrence are same.
		
		
		HashMap<Person,Boolean> personMap=new HashMap<>();
		personMap.put(person1,true);
		
		personMap.put(person3,true);
    /* Hashmap doesnot contain same key for two values but here it contain because 
		 it does not only depend on key and value but also on hashmap and here
		 hashmap is diffrent for both these values.
		
		 but for primitive data types a=5; b=5; memory refrence is same and so hashcode is same thats
		 why they dont allow to duplicate key. */
		
		System.out.println(personMap);
		
	}

}
