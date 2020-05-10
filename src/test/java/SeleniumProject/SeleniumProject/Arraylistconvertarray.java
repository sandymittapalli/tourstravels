package SeleniumProject.SeleniumProject;

import java.util.ArrayList;

public class Arraylistconvertarray {
	
	public void fruits(){
	
	ArrayList<String> fruitslist = new ArrayList<String>();
	
	fruitslist.add("mango");
	fruitslist.add("pineapple");

	
	
	Object[] item = fruitslist.toArray();
    for(Object s : item)
    	System.out.print(s + " ");  
	
	}
	
	public void integer(){
	ArrayList<Integer> al = new ArrayList<Integer>(); 
    al.add(10); 
    al.add(20); 
    al.add(30); 
    al.add(40); 

    // Error: incompatible types: Object[] 
    // cannot be converted to Integer[] 
    Integer[] arr = new Integer[al.size()]; 
    arr = al.toArray(arr); 

    for (Integer x : arr) 
        System.out.print(x + " "); 
	
} 

   
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arraylistconvertarray la = new Arraylistconvertarray();
		
		la.fruits();
	la.integer();

	}

}
