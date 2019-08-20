package homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HomeWork {

	public static void main(String[] args) 
	{
		Map<String,Map<String, Integer>> map=new HashMap<String, Map<String,Integer>>();
		
		Map<String,Integer> m1=new HashMap<String, Integer>();
		m1.put("sub1", 40);
		m1.put("sub2", 35);
		m1.put("sub3", 60);
		m1.put("sub4", 65);
		m1.put("sub5", 70);
		
		Map<String,Integer> m2=new HashMap<String, Integer>();
		m2.put("sub1", 60);
		m2.put("sub2", 35);
		m2.put("sub3", 44);
		m2.put("sub4", 87);
		m2.put("sub5", 52);
		
		Map<String,Integer> m3=new HashMap<String, Integer>();
		m3.put("sub1", 41);
		m3.put("sub2", 43);
		m3.put("sub3", 67);
		m3.put("sub4", 55);
		m3.put("sub5", 55);
		
		map.put("Vinod", m3);
		
		Map<String, Integer> result=getPercentage(map);
		
        Set<String> keys=result.keySet();
		
		Iterator<String> it=keys.iterator();
		
		
		while(it.hasNext())
		{
			System.out.print(keys);
			System.out.println(result.get(it.next()));
		}
		
        
	}
	
	public static Map<String,Integer> getPercentage(Map<String,Map<String, Integer>>map) 
	{
		Map<String,Integer> map1=new HashMap<String, Integer>();
		
		Set<String> stds=map.keySet();
		
		for(String students:stds)
		{
			Map<String,Integer> sub=map.get(students);
			Set<String> s=sub.keySet();
			int count=0;
			int total=0;
			for(String s1:s)
			{
				total=total+sub.get(s1);
				count++;
			}
			int perct=total/count;
			map1.put(students, perct);
			
		}
		
		
		return map1;
		
	}

}
