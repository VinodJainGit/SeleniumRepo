package mapInterface;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;



public class MapInterface {

	public static void main(String[] args) 
	{
		/*
		 * Map<String, String> map=new HashMap<String,String>();
		 * 
		 * map.put("Name1","Anand"); map.put("Name2","Puja"); map.put("Name3","Akshay");
		 * 
		 * System.out.println(map.get("Name1"));
		 */
		
        Map<String, String> map=new Hashtable<String,String>();
		
		map.put("Name1","Anand");
		map.put("Name2","Puja");
		map.put("Name3","Akshay");

		//System.out.println(map.get("Name1"));
		
		Set<String> keys=map.keySet();
		
		Iterator<String> it=keys.iterator();
		
		while(it.hasNext())
		{
			System.out.println(map.get(it.next()));
		}
		
		
	}

}
