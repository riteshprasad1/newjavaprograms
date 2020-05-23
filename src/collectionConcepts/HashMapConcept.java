package collectionConcepts;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Name", "Ritesh");
		hm.put("Age", "20");
		hm.put("City", "Pune");
		hm.put("Name", "Ritesh");
		System.out.println(hm.get("name"));

		HashMap<String, String> hm2 = new HashMap<String, String>();

		hm2 = (HashMap<String, String>) hm.clone();

		System.out.println(hm);
		System.out.println(hm2);

		hm.clear();

		System.out.println(hm);
		System.out.println(hm2);

		boolean contains = hm2.containsValue("Pune");
		System.out.println(contains);

		for (Entry<String, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		hm.remove("Age");
		System.out.println(hm);
		System.out.println("***************************************");

		HashMap<Integer, Employee> hm1 = new HashMap<Integer, Employee>();
		Employee e1 = new Employee("Ritesh", 25, "Pune");
		Employee e2 = new Employee("Prasad", 26, "Mumbai");
		Employee e3 = new Employee("Ram", 20, "Hyderabad");

		hm1.put(1, e1);
		hm1.put(2, e2);
		hm1.put(3, e3);
		// HashMap<Integer, Employee> hm2 = new HashMap<Integer,Employee>();

		// hm2 = (HashMap<Integer, Employee>) hm1.clone();
		System.out.println(hm1);

		for (Entry<Integer, Employee> emp : hm1.entrySet()) {
			int key = (emp.getKey());
			System.out.println("Key is " + key);
			Employee e = emp.getValue();
			System.out.println(e.name + " " + e.age + " " + e.city);
		}

		HashMap mm = new HashMap();
		mm.put(1, "Ritesh");
		mm.put(2, "Prasad");
		mm.put(null, "aaa");
		mm.put(null, null);
		System.out.println(mm);

		Hashtable mn = new Hashtable();
		mn.put(1, "Ritesh");
		mn.put(2, "Prasad");

		Enumeration ee = mn.elements();

		while (ee.hasMoreElements()) {
			System.out.println(ee.nextElement());
		}

		System.out.println("with entryset");
		Set es = mn.entrySet();
		System.out.println(es);
	}

}
