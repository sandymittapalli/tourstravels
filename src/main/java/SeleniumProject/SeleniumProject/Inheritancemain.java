package SeleniumProject.SeleniumProject;

public class Inheritancemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inheritancechild ch = new Inheritancechild();
		
		ch.test4();
		
		Inheritance p = new Inheritancechild();
		
		p.test4();
		p.test3();
		
		Inheritancechild ch1 = (Inheritancechild) new Inheritance();
		
		Inheritance p1 = new Inheritance();
		
		
	}

}
