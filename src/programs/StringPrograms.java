package programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringPrograms {

	public static void reverseString() {

		String s = "Ritesh";
		int t = s.length();
		for (int i = t - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}

	public static void specialCharacter()
	{
		String s ="##$$@@%% ritesh 9595921424 prasad";
		
		s =s.replaceAll("[^A-Za-z0-9 ]", "");
		System.out.println(s);
	}
	
	
	public static void integerReverse()
	{
		int numb = 123;
		int rev = 0;
		
		while(numb!= 0)
		{
			rev= rev * 10 + numb % 10;
			numb = numb/10;
			
		}
		System.out.println(rev);
		
		int numb1 = 1234;
		StringBuffer sb = new StringBuffer(String.valueOf(numb1));
		sb.reverse();
		System.out.println(sb);
	}
	
	public static void missingNumberInArray()
	{
		int a[] = {1,2,4,5};
		int sum = 0;
		
		for(int i=0;i<a.length;i++)
		{
			sum = sum +a[i];
		}
		System.out.println(sum);
		
		
		int sum1=0;
		
		for(int i =1;i<=5;i++) {
			sum1= sum1+i;
		}
		System.out.println(sum1);
		
		int missingNumber;
		missingNumber = sum1-sum;
		System.out.println(missingNumber);
	}
	
	
	 public static void duplicateElementInArray()
	 {
		 String[] name = {"Java","JavaScript","Ruby","Python","Java"};
		 
		 for(int i=0; i<name.length;i++)
		 {
			 for(int j=i+1; j<name.length;j++)
			 {
				 if(name[i]==name[j])
				 {
					 System.out.println("Duplicate name is" +name[j]);
				 }
			 }
		 }
		 //2nd approach with Hashset
		 
		 Set<String> names = new HashSet<>();
		 
		 for(String nameset : name)
		 {
			 if(names.add(nameset) == false)
			 {
				 System.out.println("Duplicate element in hashset is"+nameset);
			 }
		 }
		 //3rd approach with map
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		for(String mapnames : name)
		{
			 Integer count= map.get(mapnames);
			 if(count == null)
			 {
				 map.put(mapnames, 1);
			 }
			 else
			 {
				 map.put(mapnames, ++count);
			 }
		}
				System.out.println(map);
				
		Set<Entry<String, Integer>>	 entrySet = map.entrySet();
				{
						for(Entry<String, Integer> e : entrySet)
						{
							if(e.getValue()>1)
							{
								System.out.println("Duplicate value in hashmap is "+e.getKey());
							}
							
						}
				}
				
	 	}
	 
	 public static void smallestLargestValueInArray()
	 {
		 int a[] = {3,6,2,8,9,4};
		 int largest = a[0];
		 int smallest = a[0];
		 
		 for(int i=1;i<a.length;i++)
		 {
			 if(a[i]>largest)
			 {
				largest = a[i];
			 }
			 else if (a[i]<smallest)
			 {
				 smallest = a[i];
			 }
		 }
		 System.out.println("Largest no "+largest+" "+"Smallest "+smallest);
	 }
	 
	 public static void stringManipulation()
	 {
		 String s = "The rains have started here";
		 System.out.println(s.length());
		 System.out.println(s.charAt(5));
		 System.out.println(s.indexOf('a'));
		 System.out.println(s.indexOf('a',s.indexOf('a')+1));
		 System.out.println(s.indexOf("have"));
		 
		 //split
		 
		 String s1 = "Hello World Test Selenium Test";
		 String strArray[] = s1.split(" ");
		 
		 String newStr = "";
		 for(int i=0;i<strArray.length;i++)
		 {
			 System.out.println(strArray[i]);
			 newStr = newStr+strArray[i];
			 newStr = newStr.concat(" ");
		 }
		 System.out.println(newStr);
		
		 String a ="Hello";
		 String b = "World";
		 
		 a = a.concat(b);
		 System.out.println(a.length());
		b= a.substring(0, 5);
		a=	a.substring(5,10);
		 System.out.println(a);
		 System.out.println(b);
		 String d="Ritesh";
		 String c = new String();
		 c = "Ritesh";
		 
		 if(c.equals(d))
		 {
			 System.out.println("Equals");
		 }
		 else
		 {
			 System.out.println("Not equals");
		 }
		 System.out.println(c);
		 
	 }
	 
	 public static void duplicateWordInString()
	 {
		 
		 String s = "Hey java is java best lang is java";
		 	String [] strArray =s.split(" ");
		 Map<String,Integer> map = new HashMap<>();
		 
		 for(String words : strArray) {
			 
			 	Integer count = map.get(words);
			 	if (count == null)
			 	{
			 		map.put(words, 1);
			 	}
			 	else 
			 	{
			 		map.put(words, ++count);
			 	}
		 }
			// 	System.out.println(map);
			 	Set<Entry<String, Integer>> entrySet = 	map.entrySet();
				{
					System.out.println("Words and count");
					for (Entry<String,Integer> entry :entrySet)
			 		{
			 		if(entry.getValue()>1)
			 		{
			 		System.out.println(entry.getKey()+ " "+entry.getValue());
			 		}
			 		}
			 	
			 	}
		 
		/*
		 * Set<String> wordsInString = map.keySet(); { for (String word: wordsInString)
		 * { if(map.get(word)>1) { System.out.println(word +" "+map.get(word));
		 * 
		 * } }
		 * 
		 * }
		 */
		 
	 }
	 public static boolean primeNumber(int num)
	 {
		 if(num<=1)
		 {
			 return false;
		 }
		 for (int i=2;i<num;i++)
		 {
			 if(num%i == 0)
			 {
				 return false;
			 }
		 }
		return true;
			 
		 }
			
	 
	 public static void palindromeNumber()
	 {
		 int num = 151;
		 int num1 = num;
		 int rev=0;
		 
		 while(num!= 0)
		 {
		 rev = rev*10+num%10;
		 num = num/10;
		 }
		 System.out.println(rev);
		 if(num1 == rev)
		 {
			 System.out.println("Is palindrome");
		 }
		 else
		 {
			 System.out.println("Not palindrome");
		 }
	 }
	 public static void factorial()
	 {
		 	int numb = 10;
		 	int fact = 1;
		 	for(int i =1; i<=numb; i++)
		 	{
		 		fact = fact * i;
		 	}
		 	System.out.println(fact);
			 
	 }
	public static int resursiveFactorial(int numb)
	{
		
		if(numb==0)
		return 1;
		else 
			return (numb * resursiveFactorial(numb-1));
	}
	
	public static void iteratingArraylist()
	{
		ArrayList<String> tvShows = new ArrayList<>();
		tvShows.add("Shaktimaan");
		tvShows.add("PrisonBreak");
		tvShows.add("JuniorG");
		tvShows.add("Ramayan");
		
		System.out.println("****with iterator***");
		Iterator<String> it =tvShows.iterator();
		while(it.hasNext())
		{
			String shows = it.next();
			System.out.println(shows);
		}
		System.out.println("****with for each lambda***");
		tvShows.forEach(shows -> {
			System.out.println(shows);
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverseString();
		//specialCharacter();
		//integerReverse();
		//missingNumberInArray();
		//duplicateElementInArray();
	//	smallestLargestValueInArray();
		//stringManipulation();
		//duplicateWordInString();
		//System.out.println(primeNumber(2));
		//System.out.println(primeNumber(1));
		//System.out.println(primeNumber(3));
		//System.out.println(primeNumber(4));
		//System.out.println(primeNumber(11));
		//palindromeNumber();
		//factorial();
		//System.out.println(resursiveFactorial(4));
		iteratingArraylist();
	}

}
