package SeleniumProject.SeleniumProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class List {

	public void arraylist() {

		ArrayList<String> empnames = new ArrayList<String>();

		empnames.add("Kiran");
		empnames.add("kumar");
		empnames.add("mittu");

		System.out.println(empnames);
		// System.out.println(empnames.get(3));
		// System.out.println(empnames.get(2));

		// empnames.add("sandeep");
		// empnames.add(1, "sandy");

		// System.out.println(empnames);

		Collections.sort(empnames);

		for (String s1 : empnames) {
			System.out.println(s1);
		}

		Collections.sort(empnames, Collections.reverseOrder());
		for (String s : empnames) {
			System.out.println(s);
		}

		// empnames.remove(2);

		// for(String s:empnames){

		// System.out.println(s);
	}

	public void duplicatearraylist() {

		ArrayList<String> emp = new ArrayList<String>();

		emp.add("Kiran");
		emp.add("kumar");
		emp.add("mittu");
		emp.add("mittu");

		System.out.println(emp);

		Set<String> emp1 = new LinkedHashSet<String>(emp);

		System.out.println(emp1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l = new List();

		l.arraylist();

	}

}
