package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface 
{

	public static void main(String[] args)
	{
		//Hashset
		//In this it print random
		/*
		 * Set<String> set=new HashSet<>();
		 * 
		 * set.add("Vinod"); set.add("Anuradha"); set.add("Gauri"); set.add("Gauri");
		 * 
		 * for(String s:set) { System.out.println(s); }
		 */	
		
		//Linked HashSet
		/*
		 * Set<String> set=new LinkedHashSet<>();
		 * 
		 * set.add("Vinod"); set.add("Anuradha"); set.add("Gauri"); set.add("Gauri");
		 * 
		 * for(String s:set) { System.out.println(s); }
		 */
		
		//TreeSet
	       Set<String> set=new TreeSet<>();
			
			set.add("Vinod");
			set.add("Anuradha");
			set.add("Gauri");
			set.add("Gauri");
			
			for(String s:set)
			{
				System.out.println(s);
			}

	}

}
