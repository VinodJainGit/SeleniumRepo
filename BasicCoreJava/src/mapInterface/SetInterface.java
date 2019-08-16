package mapInterface;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) 
	{
		Set<String> set=new HashSet<>();
		
		set.add("Anand");
		set.add("Pooja");
		set.add("Akshay");
		set.add("Vijay");
		
		for(String s:set)
		{
			System.out.println(s);
		}
	}

}
