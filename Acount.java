package tsp.bank;
 import java.lang.String;


public class Acount {
	protected  String name;
	protected double balance;
	
	
	public Acount( String pname, double solde) {
		this.name= pname;
		this.balance = solde;
	}
	
	
	public  void create( String name) {
		
		this.name = name;
		this.balance= Math.floor(100*Math.random());
	
		
	}
   public  void display() {
	   System.out.println("Proprietaire :"+getName() );
	   System.out.println("balance : "+getBalance()+"€");
   }
   int compareTo(String name) {
	  
	    if (!this.name.equals(name))
            return -1;
	    else if(this.getName().equals(name))
	    	return 0;
	    else
	    	return 1;
	    

	   
   }

	public  String getName() {
		return name;
	}

    public  double getBalance() {
		return balance;
	}


	public void setName(String name) {
		this.name = name;
	}


    public void setBalance(double balance) {
		this.balance = balance;
	}

}
