package mapInterface;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class SetInterface2 {

	public static void main(String[] args) 
	{
		
		Set<Integer> set=new HashSet<>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		
		Iterator<Integer> it=set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}


	}

}
