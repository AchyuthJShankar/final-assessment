package oopsPrograms;

//Code on LinkedList collection 

import java.util.LinkedList;

public class Collections1 {
	public static void main(String args[])
    {
        // Creating object of the
        // class linked list
        LinkedList<String> ll = new LinkedList<String>();
 
        // Adding elements to the linked list
        ll.add("Acchu");
        ll.add("YCC");
        ll.addLast("YT");
        ll.addFirst("OHS");
        ll.add(2, "XYZ");
         
        System.out.println(ll);
 
        ll.remove("XYZ");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
 
        System.out.println(ll);
    }
}
