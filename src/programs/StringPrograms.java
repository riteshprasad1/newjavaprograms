package programs;

import java.util.HashMap;
import java.util.HashSet;
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverseString();
		//specialCharacter();
		//integerReverse();
		//missingNumberInArray();
		//duplicateElementInArray();
	//	smallestLargestValueInArray();
		stringManipulation();
	}

}
