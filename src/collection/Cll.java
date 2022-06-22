package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Vector;



public class Cll {
	public static void main(String[] args) {
		/*ArrayList al = new ArrayList();//without generics it can store any data type
		al.add("Akash");
		al.add(45);
		al.add('M');
		al.add(0.45);
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}*/
		
		/*ArrayList<String> ar= new ArrayList<String>();//to save particular datat type we have to add generics
		ar.add("Manisha");
		ar.add(5);
		for(int k=0;k<ar.size();k++) {
			System.out.println(ar.get(k));
		}*/
		
		/*LinkedList ld = new LinkedList();//without generics we can save any data type
		ld.add("Manish");
		ld.add(23);
		ld.add('M');
		for(int i=0;i<ld.size();i++) {
			System.out.println(ld.get(i));
		}*/
		/*Vector v = new Vector();
		v.add("Nitin");
		v.add(143);
		v.add('K');
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}*/
		
		/*PriorityQueue pq=new PriorityQueue();
		pq.add("Akash");
		pq.add("Nitin");
		pq.add("Dhanya");
		pq.add("Manya");
		System.out.println(pq.peek());
		System.out.println(pq.poll());*/
		
		/*HashSet hs = new HashSet();
		hs.add("Akash");
		hs.add("pavan");
		hs.add(56);
		hs.add('h');
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		/*HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Akash");
		hm.put(2, "Nitin");
		hm.put(3, "Dhanya");
		System.out.println(hm.get(3));
		System.out.println(hm.get(2));
		System.out.println(hm.get(1));*/
		
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(0, "nitin");
		ht.put(1, "manya");
		ht.put(2, "Kalpesh");
		System.out.println(ht.get(2));
		System.out.println(ht.get(1));
		System.out.println(ht.get(0));
		
	}

}
