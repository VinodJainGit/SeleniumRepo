package mapInterface;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class EnhancedForLoop {

	public static void main(String[] args) 
	{
		/*
		 * int [] str= {10,20,30,40,50,60};
		 * 
		 * for(int i:str) { System.out.println(i); }
		 */

		
		/*
		 * Object [] obj=new Object[3]; obj[0]=100; obj[1]=true; obj[2]="anand";
		 * 
		 * for(Object o:obj) { System.out.println(o); }
		 */
		
		
		/*
		 * Set<Object> set=new HashSet<>();
		 * 
		 * set.add(100); set.add(true); set.add("Anand");
		 * 
		 * 
		 * for(Object s:set) { System.out.println(s); }
		 */
		
		
		  List list=new ArrayList<>(); 
		  list.add(100); 
		  list.add(true);
		  list.add("Vinod");
		  
		/*
		 * for(Object o:list) { System.out.println(o); }
		 */
		 
		//Now put this list into map
		  
		  Map<String,List> map=new HashMap<String, List>();
		  map.put("Vinod",list);
		  
		  System.out.println(map.get("Vinod"));
		  
		  
		
		/*
		 * Map<Integer,Object> map=new Hashtable<Integer,Object>();
		 * 
		 * map.put(1,100); map.put(2,true); map.put(3,"anand");
		 * 
		 * System.out.println(map.get(2));
		 */
		
	}

}
