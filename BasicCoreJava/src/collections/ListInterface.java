package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface 
{

	public static void main(String[] arg)
	{
		//ArrayList
		/*
		 * List list=new ArrayList<>();
		 * 
		 *Here type of parameter of add method is Object
		 * list.add("Vinod"); list.add("Anuradha"); list.add("Gauri"); list.add(new
		 * ListInterface());
		 */
		
		//We can do generic to this.
		//Here type of parameter of add method is String
		/*
		 * List <String>list=new ArrayList<>();
		 * 
		 * list.add("Vinod"); list.add("Anuradha"); list.add("Gauri");
		 * 
		 * for(String s:list) { System.out.println(s); }
		 */
		
		
		
		//LinkedList
		/*
		 * List <String>list=new LinkedList<>();
		 * 
		 * list.add("Vinod"); list.add("Anuradha"); list.add("Gauri");
		 * 
		 * for(String s:list) { System.out.println(s); }
		 */
		
		//Vector
        List <String>list=new Vector<>();
		
		list.add("Vinod");
		list.add("Anuradha");
		list.add("Gauri");
		list.add("Gauri");
		
		for(String s:list)
		{
			System.out.println(s);
		}
		
		
	}
}
