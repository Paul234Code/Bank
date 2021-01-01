package tsp.bank;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Acount papi1 = new Acount("sophie", 234.34);
		
		papi1.create("Paul Faye");
		papi1.display();
		Acount papi2 = new Acount("jacques", 245.56);
		System.out.println(papi1.compareTo(papi2.name));
		

	}

}
