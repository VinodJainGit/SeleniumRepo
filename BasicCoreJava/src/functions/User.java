package functions;

public class User {

	public static void main(String[] args) 
	{
		Car maruti=new Car();
		
		maruti.color="white";
		maruti.model="swift";
		maruti.wheels=6;
		maruti.specification();
		
		Car tata=new Car();
		tata.color="red";
		tata.model="nano";
		//tata.wheels=4;
		tata.specification();
		
		
		Car vw=new Car();
		vw.color="silver";
		vw.model="polo";
		//vw.wheels=4;
		vw.specification();
		

	}

}
