package SeleniumProject.SeleniumProject;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrayconverttoarraylist {
	public static void arr1(){
	
	String[] arr = {"mango", "apple", "milk"};
	
	
	
	ArrayList<String>arr1 =  new ArrayList<String>(Arrays.asList(arr));
	
	arr1.add("water");
	
	System.out.println(arr1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
arr1();
	}

}
